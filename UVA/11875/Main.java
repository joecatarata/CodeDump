import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_ctr = 1;
        int T = Integer.parseInt(br.readLine());
        while((T--)>0){
            String[] input_line = br.readLine().split(" ");
            int num_of_members = Integer.parseInt(input_line[0]);
            int median = (int) num_of_members/2;
            System.out.println("Case " + case_ctr++ + ": " + input_line[median+1]);
        }
    }
}
