import java.util.*;
import java.io.*;

class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> dict = new ArrayList<>();
		
		int lines = 0;
		for(int i=0; i<1000; i++){
			String input = br.readLine();
			if(input.equals("#"))
				break;

			dict.add(input);
			lines++;
		}

		for(String input = br.readLine(); !input.equals("#"); input = br.readLine()){

			int[] freq = new int[26];
			for(int j=0; j<26; j++){
				freq[i] = 0;
			}

			String[] to_be_searched = input.split(" ");
			for(String ch : to_be_searched){
				int ascii = (int) ch.charAt(0);
				ascii = ascii % 97;
				freq[ascii]++;
				// System.out.println("ascii " + ch.charAt(0));
			}

			// for(int j=0; j<26; j++){
			// 	System.out.println(freq[j]);
			// }

			int possible = 0;
			for(int j=0; j<dict.size(); j++){
				String word = dict.get(j);
				
			}
		}
	}
} 