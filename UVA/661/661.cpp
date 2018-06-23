#include <iostream>
#include <fstream>
#include <vector>
#include <string>
#include <map>
using namespace std;

int main(){
	ios::sync_with_stdio(false);
	int sequence_number = 1;
	int n,m,c;
	ofstream out("out.txt");
	while(cin >> n >> m >> c){
		int currAmp = 0;
		int maxAmpInRun = 0;

		int consumption[n];
		bool isOn[n] = {false};
		
		if(n==0 && m==0 && c==0)
			break;
		for(int i=0; i<n; i++){
			int x;
			cin >> x;
			consumption[i] = x;
		}
		bool fuseBroke = false;
		while((m--)){
			int device;
			cin >> device;
			device--;
			if(!isOn[device]){
				currAmp += consumption[device];
			}else{
				currAmp -= consumption[device];
			}

			if(currAmp > c){
				fuseBroke = true;
				break;
			}else{
				if(maxAmpInRun < currAmp){
					maxAmpInRun = currAmp;
				}
			}
			isOn[device] = !isOn[device];
			// cout << "Curr : " << currAmp << " Max: " << c << " Max in run: " << maxAmpInRun << endl;
		}
		cout << "Sequence " << sequence_number++ << endl;
		if(fuseBroke){
			cout << "Fuse was blown." << endl;
		}else{
			cout << "Fuse was not blown." << endl;
			cout << "Maximal power consumption was " << maxAmpInRun << " amperes." << endl;
		}

		cout << endl;

	}
	return 0;
}
