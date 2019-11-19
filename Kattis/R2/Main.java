import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    System.out.println((Integer.parseInt(input[1])*2)-Integer.parseInt(input[0]));
  }
}
