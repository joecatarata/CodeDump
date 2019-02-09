import java.io.*;
import java.util.concurrent.*;
import java.util.ArrayList;
public class Exercise {
	public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
		System.out.println("My CPU processors available: " + Runtime.getRuntime().availableProcessors());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		long number = Long.parseLong(input[0]);
		int N = Integer.parseInt(input[1]); //number of threads
		// Solver[] threads = new Solver[N];

		long start = 2;
		long end = (long)((number/2)/N);
		long adder = end-start;

    PrimeSolver threads[] = new PrimeSolver[N];
    double startTime = System.nanoTime();
    for(int i=0; i<N; i++){
      threads[i] = new PrimeSolver(start, end, number, i+1);
      threads[i].start();
    }
    for(int i=0; i < N; i++){
      threads[i].join();
    }
    System.out.println("Time elasped: " + ((System.nanoTime()-startTime)/1000000000) + " seconds");


    boolean isPrime = true;
		for(int i=0; i<threads.length; i++){
			if(threads[i].getPrime() == false){
				isPrime = false;
			}
		}
		if(!isPrime)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
	}

}
