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

    public static <K,V extends Comparable<? super V>> NavigableSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
        NavigableSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
            new Comparator<Map.Entry<K,V>>() {
                @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                    int res = e1.getValue().compareTo(e2.getValue());
                    return res != 0 ? res : 1;
                }
            }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<Character, Integer> frequency = new TreeMap<Character, Integer>();
        int n = Integer.parseInt(br.readLine());

        while((n--)>0){
            String line = br.readLine().toUpperCase();
            for(int i=0; i<line.length(); i++){
                char c = line.charAt(i);
                if(c >= 'A' && c <= 'Z'){
                    if(frequency.containsKey(c)){
                        frequency.replace(c, frequency.get(c)+1);
                    }else{
                        frequency.put(c, 1);
                    }
                }

            }
        }
        NavigableSet<Map.Entry<Character, Integer>> keys = entriesSortedByValues(frequency).descendingSet();
        for(Map.Entry<Character, Integer> key: keys){
            System.out.println(key.getKey() + " " + key.getValue());
        }

    }
}
