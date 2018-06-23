import java.io.*;
import java.util.*;
public class substring{

    public static String[] sortArrayByLength(String[] array){
        Arrays.sort(array, new Comparator<String>() {
        @Override
        public int compare(String a, String b) {
            return Integer.compare(a.length(),b.length());
        }
    });
     return array;
}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean canBe = true;
        int n = Integer.parseInt(br.readLine());
        String[] strings = new String[n];
        for(int i=0; i<n; i++){
            strings[i] = br.readLine();
        }
        sortArrayByLength(strings);
        //Find substrings
        for(int i=strings.length-1; i>0; i--){
            String current = strings[i];
            for(int j=i-1; j>=0; j--){
                String tested = strings[j];
                if(current.indexOf(tested) == -1){
                    canBe = false;
                    break;
                }
            }
        }

        if(canBe){
            System.out.println("YES");
            for(String s:strings){
                System.out.println(s);
            }
        }else{
            System.out.println("NO");
        }
    }
}
