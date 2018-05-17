import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.HashMap;
class Main{


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_ctr = 1;
        int test_cases = Integer.parseInt(br.readLine());
        while((test_cases--)>0){
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1])-1;
            int p = Integer.parseInt(input[2]);
            System.out.println("Case " + case_ctr++ + ": "+(((p+k)%n)+1));
        }

    }
}
