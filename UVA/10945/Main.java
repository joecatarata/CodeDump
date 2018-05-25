import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.StringBuilder;
class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(String input = br.readLine(); !input.equals("DONE"); input = br.readLine()){
            input = input.replaceAll("[^A-Za-z]", "").toUpperCase();
			StringBuilder sb = new StringBuilder(input);
			
            if(sb.reverse().toString().equals(input)){
                System.out.println("You won't be eaten!");
            }else{
                System.out.println("Uh oh..");
            }
        }
    }
}
