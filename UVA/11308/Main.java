import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		Map<String, Integer> binders = new TreeMap<>();
		for(int i=0; i<t; i++)
		{
			String title = br.readLine();
			String[] numbs = br.readLine().split(" ");
			int m = Integer.parseInt(numbs[0]);
			int n = Integer.parseInt(numbs[1]);
			int b = Integer.parseInt(numbs[2]); //budget in dollars
			for(int j=0; j<m; j++){
				
			}
			
		}// scan binders
	}
}