import java.io.*;
import java.math.BigInteger;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(String input = br.readLine(); !input.equals(""); input = br.readLine()){
			int n = Integer.parseInt(input);
			BigInteger x = BigInteger.valueOf(1);
			BigInteger y = BigInteger.valueOf(1);
			BigInteger z = BigInteger.valueOf(0);
			if(n<=0)
				x = BigInteger.valueOf(0);
			else if(n == 1 || n == 2)
				x = BigInteger.valueOf(1);
			else{
					for(int i=2; i<n; i++){
					z = x.add(y);
					y = x;
					x = z;
				}
			}
			
			System.out.println("The Fibonacci number for " + n + " is " + x);
		}
	}
}
