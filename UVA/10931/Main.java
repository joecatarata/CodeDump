import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int I = Integer.parseInt(br.readLine()); I != 0; I = Integer.parseInt(br.readLine())){
            int ctr = 0;
            int x = I;
            for(int i=0; i<32; i++){
                if((I & 1) == 1)
                    ctr++;
                I = I >> 1;
            }
            System.out.println("The parity of " + Integer.toBinaryString(x) + " is " + ctr + " (mod 2)." );
        }

    }
}
