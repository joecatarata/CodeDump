import java.util.*;
import java.io.*;
import java.math.BigDecimal;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int m = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);
		Map<String, BigDecimal> words = new TreeMap<>();
		for(int i=0; i<m; i++){
			String[] word_input = br.readLine().split(" ");
			words.put(word_input[0], new BigDecimal(word_input[1]));
		}
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<n; i++){
			String desc = "";
			BigDecimal total = BigDecimal.ZERO;
			do{
				String[] description = br.readLine().split(" ");
				
				for(int j=0; j<description.length; j++){
					desc = description[i];
					if(words.containsKey(desc)){
						total = total.add(words.get(desc));
					}
				}
				
			}while(!desc.equals("."));
			System.out.println(total.toString());
		}
	}
}