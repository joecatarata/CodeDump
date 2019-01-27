import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		
		
		while(k-- > 0){
			int N = Integer.parseInt(br.readLine());
			Map<Integer, Integer> stamps = new TreeMap<>();
			Set<Integer> unique = new TreeSet<>();
			
			for(int i=0; i<N; i++){
				int M = Integer.parseInt(br.readLine());
				for(int j=0; j<M; j++){
					String[] A = br.readLine().split(" ");
					for(String stamp : A){
						if(
					}
				}
			}
		}
	}
}