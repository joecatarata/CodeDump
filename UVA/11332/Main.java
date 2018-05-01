import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static int function(int n){
		String number = String.valueOf(n);
		if(number.length() == 1){
			return n;
		}
		else{
			int num = Integer.parseInt(number);
			int total = 0;
			while(num > 0){
				total += num%10;
				num /= 10;
			}
			return function(total);
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int input = Integer.parseInt(br.readLine()); input != 0; input = Integer.parseInt(br.readLine())){
			System.out.println(function(input));
		}

	}
}
