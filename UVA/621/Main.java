import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());

		while((testCases--) > 0){
			String input = br.readLine();
			if(input.equals("1") || input.equals("4") || input.equals("78")){
				System.out.println("+");
			}else if(input.charAt(input.length()-2) == '3' && input.charAt(input.length()-1) == '5'){
				System.out.println("-");
			}else if(input.charAt(0) == '1' && input.charAt(1) == '9' && input.charAt(2) == '0'){
                System.out.println("?");
            }else if(input.charAt(0) == '9' && input.charAt(input.length()-1) == '4'){
                System.out.println("*");
            }
		}

	}
}
