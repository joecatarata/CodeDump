import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String s;
		LinkedHashMap<Integer, Integer> values = new LinkedHashMap<>();
		while(sc.hasNextInt()){
			int x = sc.nextInt();
			
			if(!values.containsKey(x)){
				values.put(x, 1);
			}else{
				values.put(x, values.get(x)+1);
			}
			
		}
		for (Map.Entry<Integer, Integer> entry : values.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}