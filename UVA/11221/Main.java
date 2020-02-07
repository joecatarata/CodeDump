import java.io.*;
import java.util.*;
import java.lang.*;
class Main{
	public static boolean isPal(String s){
    for(int i=0; i<s.length()/2; i++){
        if(s.charAt(i) != s.charAt(s.length()-(i+1)))
            return false;
    }
    return true;
}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int caseNum = 1;
		while(T-- > 0){
			String input = br.readLine().replaceAll("\\.|,|\\?|!| |\\(|\\)" , "");
			System.out.println(input);
			System.out.println(input.length());
			boolean trueisPos = false;
			int trueK = -1;
			for(int i=0; i<input.length()/2 && trueisPos == false; i++){
				
				if(input.length()%(i+1) == 0 && i != 0){
					boolean isPossible = true;
					int startIndex = 0;
					int endIndex = i;
					ArrayList<String> tokens = new ArrayList<>();
					int k = input.length()/(i+1);
					

					while(endIndex <= input.length()){
						tokens.add(input.substring(startIndex, endIndex+1));
						startIndex += i+1;
						endIndex += i+1;
					}

					for(int j=0; j<tokens.size(); j++){
						System.out.println(tokens.get(j)); 
					}

					//Checks if magic square
					//horizontal check
					for(int j=0; j<tokens.size(); j++){
						// System.out.println(tokens.get(j)); 
						if(!isPal(tokens.get(j))){
							isPossible = false;
							System.out.println("horizontal check fail");
						}
					}

					//vertical check
					for(int y=0; y<k; y++){
						StringBuilder sb = new StringBuilder();
						for(int x=0; x<k; x++){
							sb.append(tokens.get(x).charAt(y));
						}
						if(!isPal(sb.toString())){
							isPossible = false;
							System.out.println("vertical check fail");
						// System.out.println(sb.toString());
						}
					}

					//backwards horizontal check
					for(int y=k-1; y>=0; y--){
						StringBuilder sb = new StringBuilder();
						for(int x=k-1; x>=0; x--){
							sb.append(tokens.get(y).charAt(x));
						}
						if(!isPal(sb.toString())){
							isPossible = false;
							System.out.println("backwards horizontal check fail");
						// System.out.println(sb.toString());
						}
					}

					//backwards vertical check
					for(int y=k-1; y>=0; y--){
						StringBuilder sb = new StringBuilder();
						for(int x=k-1; x>=0; x--){
							sb.append(tokens.get(x).charAt(y));
						}
						if(!isPal(sb.toString())){
							isPossible = false;
							System.out.println("backwards vertical check fail");
						// System.out.println(sb.toString());
						}
					}
					if(isPossible){
						trueisPos = true;
						trueK = k;
					}
				}
				

			}
					System.out.println("Case #" + (caseNum++) + ":");
					if(trueisPos){
						System.out.println(trueK);
						break;
					}else{
						System.out.println("No magic :(");
						break;
					}
		}
	}
}

// A magic square palindrome is a sentence whose characters can be divided in a
// K
// 
// K
// square table with
// the property that the original sentence can be read from the table in four different ways:
// •
// Start from the (1,1) cell, move right until the end of the line and than proceed to the next line.
// •
// Start from the (1,1) cell, move down until the end of the column and then proceed to the next
// column.
// •
// Start from the (
// K;K
// ) cell, move left until the beginning of the line and then proceed to the
// previous line.
// •
// Start from the (
// K;K
// ) cell, move up until the beginning of the column and then proceed to the
// previous column