import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(String input = br.readLine(); input != null; input = br.readLine()){
			int testCases = Integer.parseInt(input);
			for(int i=0; i<testCases; i++){
				int noOfFarmers = Integer.parseInt(br.readLine());
				int totalBurden = 0;
				for(int j=0; j<noOfFarmers; j++){
					String[] info = br.readLine().split(" ");
					totalBurden += (Integer.parseInt(info[0]) * Integer.parseInt(info[2]));
				}
				System.out.println(totalBurden);
			}
		}
	}
}
