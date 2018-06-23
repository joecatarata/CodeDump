import java.io.*;
import java.util.*;
import java.lang.StringBuilder;
public class sums{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int[] n = new int[k];
        ArrayList<Integer[]> arr = new ArrayList<Integer[]>();
        int[] maxPerSequence = new int[k];
        int[] sums = new int[k];
        //Input
        for(int i=0; i<k; i++){
            n[i] = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            Integer[] a = new Integer[n[i]];
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int j=0; j<n[i]; j++){
                a[j] = Integer.parseInt(input[j]);
                if(max <= a[j])
                    max = a[j];
                sum += a[j];
            }
            arr.add(a);
            maxPerSequence[i] = max;
            sums[i] = sum;
        }
        int index1 = -1;
        int index2 = -1;

        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.size(); j++){
                if(i==j)
                    continue;
                int diff = sums[i] - sums[j];
                if(diff < maxPerSequence[j]){
                    Integer[] curr = arr.get(i);
                    Integer[] potential = arr.get(j);
                    for(int m=0; m<potential.length; m++){
                        if((diff - potential[m]) > 0){
                                
                        }
                    }
                }
            }
        }

    }
}
