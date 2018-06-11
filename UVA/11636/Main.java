import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_ctr = 1;
        for(int n = Integer.parseInt(br.readLine()); n>=0; n = Integer.parseInt(br.readLine())){
            System.out.println("Case " + case_ctr++ + ": " + (int) Math.ceil(Math.log(n)/Math.log(2)));
        }
    }
}
