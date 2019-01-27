
import java.util.ArrayList;

public class Searcher extends Thread{
	private int start, end;
	private int key;
	private ArrayList<Integer> list;
	public Searcher(ArrayList<Integer> list, int start, int end, int key) {
		this.list = list;
		this.start = start;
		this.end = end;
		this.key = key;
	}
	
	@Override
	public void run() {
		for(int i=0; i<list.size(); i++) {
		}
		
	}

}
