import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> output = new ArrayList<String>();
		HashMap<String, String> dict = new HashMap<String, String>();
		
		dict.put("A", "-");
		dict.put("B", "--.");
		dict.put("C", ".--");
		dict.put("D", "-.-");
		dict.put("E", ".");
		dict.put("F", "..-");
		dict.put("G", "---.");
		dict.put("H", "..--");
		dict.put("I", "-.");
		dict.put("J", "---");
		dict.put("K", "...");

		
		for(String input = br.readLine(); input != null; input = br.readLine()){
			int first_size = 0;
			int last_size = 0;
			while(first_size <= input.length()){ //change this
				StringBuilder sb = new StringBuilder(input);
				
			}
		}

        
    }
}
