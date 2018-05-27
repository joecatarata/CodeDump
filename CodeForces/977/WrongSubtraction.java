import java.io.*;

public class WrongSubtraction{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        for(int i=0; i<k; i++){
            if(n%10 > 0){
                n--;
            }else{
                n/=10;
            }
        }
        System.out.println(n);
    }
}
