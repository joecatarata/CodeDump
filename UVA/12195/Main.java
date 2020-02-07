import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Double> notes  = new HashMap<>();
		notes.put("W", 1.0);
		notes.put("H", 0.5);
		notes.put("Q", 0.25);
		notes.put("E", 0.125);
		notes.put("S", 0.0625);
		notes.put("T", 0.03125);
		notes.put("X", 0.015625);

		for(String input = br.readLine(); !input.equals("*"); input = br.readLine()){
			String[] compositions = input.split("/");
			int rightMeasures = 0;
			for(String composition : compositions){
				double duration = 0.0;
				for(int i=0; i<composition.length(); i++){
					duration += notes.get(String.valueOf(composition.charAt(i)));
				}
				if(duration == 1.0){
					rightMeasures++;
					// System.out.println(composition + " 	dur: " + duration);
				}
			}
			System.out.println(rightMeasures);
		}
	}
}