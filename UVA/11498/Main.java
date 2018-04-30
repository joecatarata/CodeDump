import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int scalingFactor = 10000;
		int input = -999;
		while((input = Integer.parseInt(br.readLine()))!=0){
			int queries = input;
			String[] divPair = br.readLine().split(" ");
			int n = Integer.parseInt(divPair[0]);
			int m = Integer.parseInt(divPair[1]);
			while((queries--)>0){
				String[] coordinates = br.readLine().split(" ");
				int x = Integer.parseInt(coordinates[0]);
				int y = Integer.parseInt(coordinates[1]);

				if(x == n || y == m){
					System.out.println("divisa");
				}
				else if(x > n && y > m){
					System.out.println("NE");
				}
				else if(x < n && y > m){
					System.out.println("NO");
				}
				else if(x < n && y < m){
					System.out.println("SO");
				}
				else if(x > n && y < m){
					System.out.println("SE");
				}

			}
		}

	}
}
