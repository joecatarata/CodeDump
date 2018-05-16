import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedHashMap;
class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(String input = br.readLine(); input!=null; input = br.readLine()){
            LinkedHashMap<Character, Integer> letters = new LinkedHashMap<Character, Integer>();
            int max = Integer.MIN_VALUE;

            for(char c = 'A'; c <= 'Z'; c++){
                letters.put(c, 0);
            }
            for(char c = 'a'; c <= 'z'; c++){
                letters.put(c, 0);
            }
            char[] charArray = input.toCharArray();
            for(int i=0; i<charArray.length; i++){
                char temp = charArray[i];
                if((temp >= 'A' && temp <= 'Z') || (temp >= 'a' && temp <= 'z')){
                    letters.put(temp, letters.get(temp)+1);
                    if(max < letters.get(temp)){
                        max = letters.get(temp);
                    }
                }
            }

            for(char key: letters.keySet()){
                if(letters.get(key) == max){
                    System.out.print(key);
                }
            }
            System.out.println(" " + max);
        }
    }
}
