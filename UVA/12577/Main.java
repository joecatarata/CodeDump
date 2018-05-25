
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCtr = 1;
        for(String word = br.readLine(); !word.equals("*"); word = br.readLine()){
            System.out.print("Case " + caseCtr + ": ");
            caseCtr++;
            if(word.equals("Hajj")){
                System.out.println("Hajj-e-Akbar");
            }else{
                System.out.println("Hajj-e-Asghar");
            }
        }
    }
}
