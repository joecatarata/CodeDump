import java.util.*;
import java.io.*;

class Main{
	class StackPlus extends Stack{
		public StackPlus split(){

		} 
	}
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(String inp = br.readLine(); inp != null; inp = br.readLine()){
			int n = Integer.parseInt(inp);
			for(int i=0; i<n; i++){
				String line = br.readLine();
				int h = Integer.parseInt(line[0]);
				for(int j=0; j<h; j++){

				}
			}
		}
	}
}