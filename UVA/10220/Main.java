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
import java.math.BigInteger;

class Main{	
	static BigInteger factorial(BigInteger n){
		if(n.intValue()<2)
			return BigInteger.ONE;
		else{
			BigInteger temp = n;
			return n.multiply((factorial(n.subtract(BigInteger.valueOf(1)))));
		}
	}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger a[] = new BigInteger[1001];
		for(int i=0; i<1001;i++){
			BigInteger x = factorial(BigInteger.valueOf(i));
			String s = x.toString();	
			BigInteger sum = BigInteger.ZERO;
			for(int j=0; j<s.length(); j++){
				sum = sum.add(new BigInteger((s.charAt(j)+"")));
			}
			a[i] = sum;
		}
		for(String input = br.readLine(); input != null; input = br.readLine()){
			int n = Integer.parseInt(input);
			System.out.println(a[n]);
		}
    }
	
}
