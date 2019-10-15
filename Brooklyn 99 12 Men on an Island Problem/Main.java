// Twelve men are on a desert island, all with identical weights except for one of them, who is slightly lighter or heavier than the others.
// The only other thing on the island is a seesaw.
// There are no scales or means to measure weight otherwise.
// Can you determine which man has the different weight?
// You only get to use the seesaw three times.

import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Man> men = new ArrayList<Man>();
    System.out.print("Input the weight of a man: ");
    int weight = Integer.parseInt(br.readLine());
    System.out.print("Input if the other man should be lighter or heavier[0 = light/1 = heavy]: ");
    int LorH = Integer.parseInt(br.readLine());
    System.out.println("Generating random man with different weight.. ");
    int randomIndex = new Random().nextInt(12);
    for(int i=0; i < 12; i++){
      if(i == randomIndex){
        if(LorH == 0)
          men.add(new Man(weight-1));
        else if(LorH == 1)
          men.add(new Man(weight+1));
      }else{
        men.add(new Man(weight));
      }
    }

    // for(Man man : men){
    //   System.out.println(men.get(men.indexOf(man)));
    // }

    System.out.println("Done!");

  }
}

class Man{
  private int weight = 0;
  public Man(int weight){
    this.weight = weight;
  }
  public String toString(){
    return Integer.toString(weight);
  }
}
