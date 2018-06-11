import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.NavigableSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Comparator;
class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(String line = br.readLine(); line != null; line = br.readLine()){
            String input[] = line.split(" ");
            int N = Integer.parseInt(input[0]);
            int A = Integer.parseInt(input[1]);
            long total = 0;
            for(int i=1; i<=N; i++){
                total += (i*(Math.pow(A, i)));
            }

            System.out.println(total);
        }
    }
}
