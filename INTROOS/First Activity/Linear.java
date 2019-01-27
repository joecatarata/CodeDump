
import java.util.*; 

public class Linear {
	private ArrayList<Integer> list;
	private int N, M;
	private Searcher[] threads;
	public Linear(int N, int M) {
		this.list = new ArrayList<Integer>(N);
		this.N = N;
		this.M = M;
		initalizeList();
		threads = new Searcher[M];
		initializeThreads();
	}
	
	private void initalizeList() {
		for(int i=0; i<N; i++) {
			list.add(i+1);
		}
	}
	
	private void initializeThreads() {
		int start = 0;
		int end = (int)(N/M)-1;
	
		int adder = end+1;
		for(int i=0; i<threads.length; i++) {
			if(i == threads.length-1) {
//				System.out.println(end);
				end += (N-end)-1;
//				System.out.println(end);
			}
			threads[i] = new Searcher(this.list, start, end,9993);
			start += adder;
			end += adder;
			
		} 
//		System.out.println(((N-1)-(end-adder)));
//		System.out.println(end-adder);
	}

	public void traverse() {
		for(Searcher thread : threads) {
			thread.start();
		}
	}
}
