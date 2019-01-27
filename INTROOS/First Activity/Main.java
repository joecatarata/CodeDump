

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		double startTime = System.nanoTime();
		Linear l = new Linear(N,M);
		l.traverse();
		System.out.println("Traversed! Time elasped: " + ((System.nanoTime()-startTime)/1000000) + " milliseconds (ms)");
	}
}
