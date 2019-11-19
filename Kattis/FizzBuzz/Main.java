import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int x = Integer.parseInt(input[0]);
    int y = Integer.parseInt(input[1]);
    int n = Integer.parseInt(input[2]);

    for(int i=1; i<=n; i++){
      String output = "";
      if(i % x == 0){
        output += "Fizz";
      }
      if(i % y == 0){
        output += "Buzz";
      }
      if(output.equals("")){
        output += i;
      }
      System.out.println(output);
    }
  }
}
