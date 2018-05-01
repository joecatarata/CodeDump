import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseCtr = 1;
		int testCases = Integer.parseInt(br.readLine());

		while((testCases--) > 0){
			String[] input = br.readLine().split(" ");
			int length = Integer.parseInt(input[0]);
			int width = Integer.parseInt(input[1]);
			int height = Integer.parseInt(input[2]);
			System.out.print("Case " + caseCtr +": ");
			if(length <= 20 && width <= 20 && height <= 20){
				System.out.println("good");
			}else{
				System.out.println("bad");
			}
			caseCtr++;
		}
	}
}
