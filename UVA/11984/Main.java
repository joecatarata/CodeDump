import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int caseNum = 1;
		while(T-- > 0){
			String[] input = br.readLine().split(" ");
			double C = Double.parseDouble(input[0]);
			double d = Double.parseDouble(input[1]);
			double F = 9*C/5+d;
			double output = F*5/9;
			System.out.print("Case " + (caseNum++) + ": ");
			if(T == 0)
				System.out.printf("%.2f", output);
			else
				System.out.printf("%.2f\n", output);
		}
	}
}
