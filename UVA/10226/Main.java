import java.io.*;
import java.util.*;

class Main{
	
	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		br.readLine();
		for(int i=0; i<T; i++){

			Map<String, Integer> trees = new TreeMap<>();
			String tree;
			int totalElements = 0;
			while((tree = br.readLine())!=null){
				if(tree.length() == 0)
					break;
				if(!trees.containsKey(tree)){// tree is not yet found
					trees.put(tree, 1);
				}else{
					trees.put(tree, trees.get(tree)+1);
				}	
				totalElements++;
			}
			for(String s : trees.keySet()){
				System.out.printf("%s %.4f\n", s, 100.0*trees.get(s)/totalElements); 
			}
			if((i+1)!=T)
				System.out.println("");
		}
		
	}
}