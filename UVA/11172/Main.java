import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        while(testCases!=0){
            testCases--;
            String[] input = br.readLine().split(" ");
            String relation = "";
            int value1 = Integer.parseInt(input[0]);
            int value2 = Integer.parseInt(input[1]);
            if(value1<value2){relation="<";}else if(value1>value2){relation=">";}else{relation="=";}
            System.out.println(relation);
        }
    }
}
