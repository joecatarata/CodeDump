import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;;
class Main{


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_ctr = 1;
        int t = Integer.parseInt(br.readLine());
        String[] keys = new String[]{
            "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        while((t--)>0){
             String line = br.readLine();
             int total = 0;
             for(int i=0; i<line.length(); i++){
                 char c = line.charAt(i);
                 if(c == ' '){
                     total++;
                 }else{
                     for(int j=0; j<keys.length; j++){
                         if(keys[j].contains(Character.toString(c))){
                             total+=keys[j].indexOf(c)+1;
                             break;
                         }
                     }
                 }

             }
             System.out.println("Case #" + case_ctr++ +": " + total);
        }

    }
}
