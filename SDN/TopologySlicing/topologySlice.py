'''
SOFTNET
College of Computer Studies, DE LA SALLE UNIVERSITY
Dr. Marnel Peradilla
'''

from pox.core import core
from collections import defaultdict

import pox.openflow.libopenflow_01 as of
import pox.openflow.discovery
import pox.openflow.spanning_tree

from pox.lib.revent import *
from pox.lib.util import dpid_to_str
from pox.lib.util import dpidToStr
from pox.lib.addresses import IPAddr, EthAddr
from collections import namedtuple
import os

log = core.getLogger()


class TopologySlice (EventMixin):

    def __init__(self):
        self.listenTo(core.openflow)
        log.debug("Enabling Slicing Module")


    """This event will be raised each time a switch will connect to the controller"""
    def _handle_ConnectionUp(self, event):
        #Creates an OpenFlow message and sends it to the switch
        def _new_flow(inport,outport):
            msg = of.ofp_flow_mod()
            msg.match.in_port = inport
            msg.actions.append(of.ofp_action_output(port=outport))
            event.connection.send(msg)

        # Sets up 2 flows so that the connection
        # goes both ways. This function calls the
        # _new_flow 2 times to accomplish 2-way connection.
        def _new_session(x,y):
            _new_flow(x,y)
            _new_flow(y,x)

        # Use dpid to differentiate between switches (datapath-id)
        # Each switch has its own flow table. As we'll see in this
        # example we need to write different rules in different tables.
        dpid = dpidToStr(event.dpid)
        log.debug("Switch %s has come up.", dpid)
        #Checks which switch connected and add their ports accordingly
        if dpid == "00-00-00-00-00-01" or dpid == "00-00-00-00-00-04":
            _new_session(1,3)
            _new_session(2,4)
        elif dpid == "00-00-00-00-00-02" or dpid == "00-00-00-00-00-03":
            _new_session(1,2)



def launch():
    # Run spanning tree so that we can deal with topologies with loops
    pox.openflow.discovery.launch()
    pox.openflow.spanning_tree.launch()

    '''
    Starting the Topology Slicing module
    '''
    core.registerNew(TopologySlice)
