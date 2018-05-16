import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
class Main{

    public static boolean isPal(String s){
        int end = s.length();
        for(int i=0; i<(s.length())/2; i++){
            if(s.charAt(i) != s.charAt(end-i-1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(String input = br.readLine(); !input.equals("DONE"); input = br.readLine()){
            input = input.replaceAll("[,.?!\\s]", "");
            input = input.toUpperCase();

            if(isPal(input)){
                System.out.println("You won't be eaten!");
            }else{
                System.out.println("Uh oh..");
            }
        }
    }
}
