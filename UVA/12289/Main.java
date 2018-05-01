import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCases = Integer.parseInt(br.readLine());
		for(int i=0; i<testCases; i++){
			String input = br.readLine();
			int inputErrorCtr = 0;
			boolean isOne = false, isTwo = false, isThree = false;
			String one = "one", two = "two", three = "three";
			int j;

			for( j = 0; inputErrorCtr < 2 && j<one.length(); j++){
				if(!one.contains(Character.toString(input.charAt(j)))){
					inputErrorCtr++;
				}
			}
			if(inputErrorCtr < 2 && input.length() == one.length()){
				isOne = true;
			}

			if(!isOne){
				inputErrorCtr = 0;
				for( j = 0; inputErrorCtr < 2 && j<two.length(); j++){
					if(!two.contains(Character.toString(input.charAt(j)))){
						inputErrorCtr++;
					}
				}
			}
			if(inputErrorCtr < 2 && input.length() == two.length()){
				isTwo = true;
			}

			if(!isTwo){
				inputErrorCtr = 0;
				for(j = 0; inputErrorCtr < 2 && j<three.length(); j++){
					if(!three.contains(Character.toString(input.charAt(j)))){
						inputErrorCtr++;
					}
				}
			}
			if(inputErrorCtr < 2 && input.length() == three.length()){
				isThree = true;
			}
			String output = "";
			if(isOne){
				output = "1";
			}
			else if(isTwo){
				output = "2";
			}
			else if(isThree){
				output = "3";
			}
			System.out.println(output);
		}

	}
}
