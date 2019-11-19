import java.io.*;


class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    if(input.contains("ss"))
      System.out.println("hiss");
    else
      System.out.println("no hiss");

  }
}
