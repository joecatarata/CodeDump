import java.util.*;
import java.io.*;
import java.text.*;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int caseNum = 0; caseNum < N; caseNum++){
			double total=0.0, avg=0.0;
			for(int i=0; i<12; i++){
				total += Double.parseDouble(br.readLine());
			}
			avg = (double) total/12.0;
			NumberFormat df = NumberFormat.getNumberInstance(Locale.US);
			df.setMaximumFractionDigits(2);
			// if((int) Math.round(avg-(long)avg) * 100 < 10){

			// }
			System.out.println(Math.round(avg-(long)avg) * 10);
			System.out.println((caseNum+1) + " $" + df.format(avg));
		}
	}
}