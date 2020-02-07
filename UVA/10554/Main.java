import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String first;
		int ctr=0;
		while(first = br.readLine()){
			if(first.equals("-"))
				break;
			for(String input = br.readLine(); !input.equals("-"); input = br.readLine()){
				String[] tokens = input.split(" ");
					
			}
		}
	}
}