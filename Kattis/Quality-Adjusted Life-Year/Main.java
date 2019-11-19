import java.io.*;

// The QALY for each period in which the quality of life is constant is simply the product of the quality of life and the length of the period (in years).
// We wish to know the amount of QALY accumulated by a person at the time of death, given the complete history of this person.
class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    double accumulated = 0.0;
    for(int i=0; i<N; i++){
      String[] inputs = br.readLine().split(" ");
      double q = Double.parseDouble(inputs[0]);
      double y = Double.parseDouble(inputs[1]);
      accumulated += (q*y);
    }
    System.out.println(accumulated);

  }
}
