import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main (String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
		while(testCases--!=0){
			int max = 0;
			int min = 100;
			int pos = Integer.parseInt(br.readLine());

			String[] positions = br.readLine().split(" ");

            for(String position : positions){
                int temp = Integer.parseInt(position);
    			if(temp>max) max = temp;
    			if(temp<min) min = temp;
            }

			System.out.println((max-min)*2);
		}
	}
}
