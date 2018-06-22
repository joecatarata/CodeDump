import java.util.*;
import java.io.*;

public class cd{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> queue = new ArrayList<String>();
		for(int i=0; i<n; i++){
			String input = br.readLine();
			if(input.equals("pwd")){
				for(int j=0; j<queue.size(); j++){
					System.out.print("/");
					System.out.print(queue.get(j));	
					
				}	
				System.out.print("/");
				System.out.println("");
			}else{	
				String[] temp =  input.split(" ");
				String[] paths = temp[1].split("/");
				if(temp[1].equals("/")){
					queue = new ArrayList<String>();
					continue;
				}
				if(temp[1].charAt(0) == '/'){
					queue = new ArrayList<String>();			
					paths[0] = " ";
				}
				for(String path : paths){
					if(!path.equals(" ")){
						if(path.equals("..")){
							if(queue.size() > 0)
								queue.remove(queue.size()-1);
						}else{
							queue.add(path);
						}
					}
				}
				
				
			}
		}
	}
}