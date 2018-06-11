import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println("Lumberjacks:");
        while((n--)>0){
            String[] inputs = br.readLine().split(" ");
            boolean isAscending = true;
            boolean isDescending = true;

            for(int i=0; i<inputs.length-1; i++){
                int x = Integer.parseInt(inputs[i]);
                int y = Integer.parseInt(inputs[i+1]);
                if(x > y){
                    isAscending = false;
                }
            }
            for(int i=0; i<inputs.length-1; i++){
                int x = Integer.parseInt(inputs[i]);
                int y = Integer.parseInt(inputs[i+1]);
                if(x < y){
                    isDescending = false;
                }
            }

            if((isAscending && isDescending) || isAscending || isDescending)
                System.out.println("Ordered");
            else
                System.out.println("Unordered");

        }
    }
}
