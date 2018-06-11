import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.TreeMap;
class Main{


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n;
        while((n = Integer.parseInt(br.readLine())) != 0){
            System.out.println(n/2);
        }



    }
}
