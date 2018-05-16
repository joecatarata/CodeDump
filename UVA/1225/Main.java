import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num_of_data_sets = Integer.parseInt(br.readLine());

        while((num_of_data_sets--)>0){
            int N = Integer.parseInt(br.readLine());
            int digit_count = 10;
            int[] count = new int[digit_count];
            for(int i=0; i<count.length; i++){
                count[i] = 0;
            }

            for(int i=1; i<=N; i++){
                int x = i;
                while(x>0){
                    count[x%10] = count[x%10] + 1;
                    x/=10;
                }
            }
            for(int num : count){
                System.out.print(num + " ");
            }
            System.out.print("\n");
            
        }
    }
}
