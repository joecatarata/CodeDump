import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.lang.Math;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int case_ctr = 1;
		for(String[] firstLine = br.readLine().split(" "); !(firstLine[0].equals("0") && firstLine[1].equals("0")); firstLine = br.readLine().split(" ")){
			int no_of_requirements = Integer.parseInt(firstLine[0]);
			int no_of_proposals = Integer.parseInt(firstLine[1]);

			ArrayList<String> requirements = new ArrayList<String>();
			Map<String, Double> compliant_proposals = new HashMap<String, Double>();
			Map<String, double[]> partially_compliant_proposals = new HashMap<String, double[]>();

			boolean compliant = false, partialCompliant = false;
			for(int i=0; i<no_of_requirements; i++){
				String requirement = br.readLine();
				requirements.add(requirement);
			}

			for(int i=0; i<no_of_proposals; i++){
				String proposal = br.readLine();
				String[] numbers = br.readLine().split(" ");
				double price = Double.parseDouble(numbers[0]);
				int no_of_met_requirements = Integer.parseInt(numbers[1]);

				int x = no_of_met_requirements;

				while((x--) > 0){
					br.readLine();
				}

				if(no_of_met_requirements == no_of_requirements){
					compliant = true;
					compliant_proposals.put(proposal, price);
				}else if(no_of_met_requirements < no_of_requirements){
					partialCompliant = true;
					double[] tempDArray = new double[2];
					tempDArray[0] = price;
					tempDArray[1] = (double) no_of_met_requirements/no_of_requirements;
				//	System.out.println(tempDArray[1]);
					partially_compliant_proposals.put(proposal, tempDArray);
				}
			}

			String highestCompliant = "";
			double maxCompliantValue = Double.MIN_VALUE;
			double maxPrice = Double.MIN_VALUE;
			boolean allEqual = true;
			if(compliant_proposals.size() > 0){

				for(String key: compliant_proposals.keySet()){
					if(maxPrice < compliant_proposals.get(key)){
						highestCompliant = key;
						maxPrice = compliant_proposals.get(key);
					}
				}


			}
			else if(partially_compliant_proposals.size() > 0){

				for(String key : partially_compliant_proposals.keySet()){
					if(maxCompliantValue < partially_compliant_proposals.get(key)[1]){
						if(maxCompliantValue != Double.MIN_VALUE){
							allEqual = false;
						}
						highestCompliant = key;
						maxCompliantValue = partially_compliant_proposals.get(key)[1];
						maxPrice = partially_compliant_proposals.get(key)[0];
					}
					else if(maxCompliantValue == partially_compliant_proposals.get(key)[1]){
						if(maxPrice < partially_compliant_proposals.get(key)[0]){
							highestCompliant = key;
							maxPrice = partially_compliant_proposals.get(key)[0];
						}
					}

				}
			}

			System.out.printf("RFP #%d\n", case_ctr);
			System.out.println(highestCompliant + "\n");
			case_ctr++;
		}

	}
}
