import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    for(String[] inputs = br.readLine().split(" "); !inputs[0].equals("0"); inputs = br.readLine().split(" ")){
      int H=0,U=0,D=0,F=0;
      for(int i=0; i<inputs.length; i++){
        switch(i){
          case 0: H = Integer.parseInt(inputs[i]); break;
          case 1: U = Integer.parseInt(inputs[i]); break;
          case 2: D = Integer.parseInt(inputs[i]); break;
          case 3: F = Integer.parseInt(inputs[i]); break;
        }
      }
      Tester t = new Tester(H,U,D,F);
      t.test();
    }
  }

  static class Tester{
    private int H,U,D,F;
    public Tester(int H, int U, int D, int F){
      this.H = H;
      this.U = U;
      this.D = D;
      this.F = F;
      // System.out.printf("H = %d, U = %d, D = %d, F = %d\n", H,U,D,F);
    }
    public void test(){
      double adder = U;
      double decrementer = F;
      decrementer /= 100;
      decrementer *= U;
      // System.out.println(decrementer);
      double totalHeight = 0.0;
      int day = 0;

      do{
        day++;
        // if(U > H){
        //   System.out.println("success on day " + day);
        //   return;
        // }
        totalHeight += adder;
        if(totalHeight > H){
          System.out.println("success on day " + day);
          return;
        }
        totalHeight -= D;
        // System.out.printf(("Day ") + day + (": ") + ("THeight: %.2f - %d = %.2f") + (" Adder: %.2f") + (" D: ") + D + (" Fatigue decrement: %.2f") + "\n", totalHeight+D, D, totalHeight, adder, decrementer);
        adder -= decrementer;
        if(adder < 0){
          adder = 0;
        }
      }while(totalHeight >= 0);
      System.out.println("failure on day " + (day));


      return;
    }
  }
}
