import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    for(int inc=0; inc<T; inc++){
      String number = br.readLine();

      int total = 0;
      int count = 0;
      for(int i=number.length()-1; i>=0; i--){
        count++;
        int temp = Character.getNumericValue(number.charAt(i));
        if(count % 2 == 0){
          temp = 2 * Character.getNumericValue(number.charAt(i));
          if(temp > 9){
            while(temp > 0){
              total += temp % 10;
              temp /= 10;
            }
          }
        }
        total += temp;
      }
      if(total % 10 == 0){
        System.out.println("PASS");
      }else{
        System.out.println("FAIL");
      }
      // System.out.println(total);
    }
  }
}
