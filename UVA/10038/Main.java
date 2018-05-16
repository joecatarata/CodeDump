import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.HashMap;
class Main{

    public static boolean allTrue(HashMap <Integer,Boolean> array){
        for(int key : array.keySet()){
            if(array.get(key) == false)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(String input = br.readLine(); input != null; input = br.readLine()){
            String[] formattedInput = input.split(" ");
            int n = Integer.parseInt(formattedInput[0]);
            HashMap<Integer, Boolean> satisfied = new HashMap<Integer, Boolean>();
            for(int i=1; i<n; i++){
                satisfied.put(i, false);
            }
            for(int i=1; i<n; i++){
                int x = Integer.parseInt(formattedInput[i]);
                int y = Integer.parseInt(formattedInput[i+1]);
                int diff = Math.abs(x-y);
                satisfied.replace(diff, true);
            }

            if(allTrue(satisfied)){
                System.out.println("Jolly");
            }else{
                System.out.println("Not jolly");
            }
        }
    }
}
