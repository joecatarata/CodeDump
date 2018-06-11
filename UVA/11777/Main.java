import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.HashMap;
class Main{


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test_cases = Integer.parseInt(br.readLine());
        int case_ctr = 1;
        while((test_cases--)>0){
            String[] test_case = br.readLine().split(" ");
            int term1 = Integer.parseInt(test_case[0]);
            int term2 = Integer.parseInt(test_case[1]);
            int finalScore = Integer.parseInt(test_case[2]);
            int attendance = Integer.parseInt(test_case[3]);
            int[] tests = new int[3];
            tests[0] = Integer.parseInt(test_case[4]);
            tests[1] = Integer.parseInt(test_case[5]);
            tests[2] = Integer.parseInt(test_case[6]);
            Arrays.sort(tests);
            double s = (tests[1] + tests[2])/2;
            s += term1+term2+finalScore+attendance;

            String gradeLetter = "";
            if(s >= 90.0) {
    			gradeLetter = "A";
    		} else if(s >= 80.0 && s < 90.0) {
    			gradeLetter = "B";
    		} else if(s >= 70.0 && s < 80.0) {
    			gradeLetter = "C";
    		} else if(s >= 60.0 && s < 70.0) {
    			gradeLetter = "D";
    		}else{
                gradeLetter = "F";
            }
            System.out.println("Case " + case_ctr++ + ": " + gradeLetter);


        }

    }
}
