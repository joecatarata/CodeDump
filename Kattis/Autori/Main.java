import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split("-");
    for(String input: inputs){
      System.out.print(input.charAt(0));
    }
  }
}
