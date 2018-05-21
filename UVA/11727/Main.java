import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
import java.util.Arrays;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int[] salaries = new int[3];
		int ctr = 0;
		while((testCases--) > 0){
			ctr++;
			String[] input = br.readLine().split(" ");
			salaries[0] = Integer.parseInt(input[0]);
			salaries[1] = Integer.parseInt(input[1]);
			salaries[2] = Integer.parseInt(input[2]);
			Arrays.sort(salaries);
			System.out.printf("Case %d: %d\n", ctr, salaries[1]);
			salaries = new int[3];
		}

	}
}
