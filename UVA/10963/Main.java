import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());

		while((testCases--) > 0){
			br.readLine();
			int noOfColumns = Integer.parseInt(br.readLine());
			int gap = 0;
			boolean isCloseable = true;
			for(int i=0; i<noOfColumns; i++){
				String[] input = br.readLine().split(" ");
				int temp = Math.abs(Integer.parseInt(input[0]) - Integer.parseInt(input[1]));
				if(i==0){
					gap = temp;
				}else{
					if(gap != temp){
						isCloseable = false;
					}
				}
			}


			if(isCloseable){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
			if(testCases > 0){
				System.out.print("\n");
			}
		}

	}
}
