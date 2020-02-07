import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<String> dict = new TreeSet<>();

		for(String line = br.readLine(); line != null; line = br.readLine()){
			line = line.replaceAll("[^A-Za-z ]", " ");
			String[] words = line.split("\\s{1,}");
			for(String s : words){

				if(!dict.contains(s))
					dict.add(s.toLowerCase());
			}

			
		}
		for(String word : dict){
				System.out.println(word);
		}
		
	}

}