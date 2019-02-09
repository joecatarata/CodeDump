import java.util.concurrent.*;

public class PrimeSolver extends Thread{
  private boolean isPrimeVar;
  private long high, low, key;
  private int id;
  public PrimeSolver(long low, long high, long key, int id){
    this.isPrimeVar = true;
    this.low = low;
    this.high = high;
    this.key = key;
    this.id = id;
  }

  @Override
  public void run(){
    try{
      this.isPrimeVar = isPrime();
      Thread.sleep(50);

    }
    catch(InterruptedException ie){
    }

  }

  public boolean isPrime() throws InterruptedException{
    for(long i=low; i<=high; i++){
      // uncomment for console logging
      // System.out.println("Thread " + this.id + " Current Number: " + i); 
      if(this.key%i==0)
        return false;
    }
    return true;
  }

  public boolean getPrime(){
    return this.isPrimeVar;
  }

}
