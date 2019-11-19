import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int x = Integer.parseInt(input);
    input = br.readLine();
    int y = Integer.parseInt(input);
    if(x > 0 && y > 0){
      System.out.println("1");
    }else if(x < 0 && y > 0){
      System.out.println("2");
    }else if(x < 0 && y < 0){
      System.out.println("3");
    }else if(x > 0 && y < 0){
      System.out.println("4");
    }
  }
}
