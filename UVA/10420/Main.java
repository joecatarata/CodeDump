import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.HashMap;
class Main{


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_ctr = 1;
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> women_loved = new HashMap<String, Integer>();

        while((n--)>0){
            //String[] input = br.readLine().split(" ");
            String country =  br.readLine().split(" ")[0];
            if(women_loved.get(country) != null){
                women_loved.replace(country, women_loved.get(country)+1);
            }else{
                women_loved.put(country, 1);
            }

        }
        Object[] keys = women_loved.keySet().toArray();
        Arrays.sort(keys);
        for(Object key:keys){
            System.out.println(key + " " + women_loved.get(key));
        }

    }
}
