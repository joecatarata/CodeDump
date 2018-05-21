import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(String[] input = br.readLine().split(" "); !input.equals("-1 -1"); input = br.readLine().split(" ")){
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			if(a == -1 && b == -1)
				break;
			int difference = Math.abs(a-b);

			if(difference > 49){
				System.out.println(99-difference+1);
			}else{
				System.out.println(difference);
			}
		}
	}
}
