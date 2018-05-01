import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseCtr = 1;
		int operations = Integer.parseInt(br.readLine());
		int accountBalance = 0;
		while((operations--) > 0){
			String[] input = br.readLine().split(" ");
			if(input[0].equalsIgnoreCase("donate")){
				accountBalance += Integer.parseInt(input[1]);
			}else if(input[0].equalsIgnoreCase("report")){
				System.out.println(accountBalance);
			}
		}
	}
}
