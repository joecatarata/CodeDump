import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int N = Integer.parseInt(br.readLine()); N != 0; N = Integer.parseInt(br.readLine())){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] ages = new int[N];
            for(int i=0; i<N; i++){
                ages[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(ages);

            for(int i=0; i<ages.length; i++){
                System.out.print(ages[i]);
                if(i<ages.length-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
