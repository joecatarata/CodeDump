import java.util.*;
import java.io.*;

class Main{

	public static class ASCII implements Comparable<ASCII> {
		int ascii_value;
		int freq;
		
		public ASCII (int ascii_value, int freq) {
			this.ascii_value = ascii_value;
			this.freq = freq;
		}
		
		public void addFreq () {
			this.freq++;
		}
		
		@Override
		public int compareTo(ASCII arg0) {
			if (this.freq!=arg0.freq) return this.freq-arg0.freq;
			return arg0.ascii_value-this.ascii_value;
		}
		
}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ASCII[] freq = new ASCII[94];

		for(String input = br.readLine(); input != null; input = br.readLine()){
			
			for(int i=32; i<=126; i++){
				freq[i] = new ASCII(i, 0);
			}
		
			
		}
		
	}
} 