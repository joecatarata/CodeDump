import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = Integer.parseInt(br.readLine());
		int case_ctr = 1;
		while((test_cases--) > 0){
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int max = Integer.MIN_VALUE;
			for(int i=1; i<=N; i++){
				int c = Integer.parseInt(input[i]);
				if(max < c){
					max = c;
				}
			}
			System.out.printf("Case %d: %d\n", case_ctr, max);
			case_ctr++;
		}
	}
}
