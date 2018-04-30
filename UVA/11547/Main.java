import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());

		while((testCases--) > 0){
			int n = Integer.parseInt(br.readLine());
			n = (((((((n*567)/9)+7492)*235)/47)-498)/10)%10;
			System.out.println(Math.abs(n));
		}

	}
}
