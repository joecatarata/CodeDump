import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    for(int i=0; i<N; i++){
      String input = br.readLine().replaceAll("\\s+", "");
    //   if(input.charAt(1) == '+'){
    //     System.out.println((Character.getNumericValue(input.charAt(0)) + Character.getNumericValue(input.charAt(2))));
    //   }else{
    //     System.out.println("skipped");
    //   }
    // }
      if(input.contains("+")){
        String[] nums = input.split("\\+");
        // System.out.println("pumasok");
        System.out.println((Integer.parseInt(nums[0]) +(Integer.parseInt(nums[1]))));
      }else{
        System.out.println("skipped");
      }
    }
  }
}
