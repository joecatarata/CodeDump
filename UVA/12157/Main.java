import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine());
        int case_number = 1;
        while((testCases--) > 0){
            int no_of_call_durations = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int milePrice = 0;
            int juicePrice = 0;
            for(String s : input){
                int call_duration = Integer.parseInt(s);
                milePrice += (call_duration/30+1)*10;
                juicePrice += (call_duration/60+1)*15;
            }

            System.out.printf("Case %d: ", case_number);
            if(milePrice < juicePrice){
                System.out.printf("Mile %d\n", milePrice);
            }else if(juicePrice < milePrice){
                System.out.printf("Juice %d\n", juicePrice);
            }else if(milePrice == juicePrice){
                System.out.printf("Mile Juice %d\n", juicePrice);
            }

            case_number++;
        }
    }
}
