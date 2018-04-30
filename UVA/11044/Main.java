import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(String input = br.readLine(); !(input.equalsIgnoreCase("0 0 0 0")); input = br.readLine()){
            String[] values =  input.split(" ");
            int total = 1080;
            int value0 = Integer.parseInt(values[0])*(360/40);
            int value1 = Integer.parseInt(values[1])*(360/40);
            int value2 = Integer.parseInt(values[2])*(360/40);
            int value3 = Integer.parseInt(values[3])*(360/40);

            if(value0 < value1)
                total+=value0-value1;
            else
                total+=360-value1+value0;

            if(value1<value2)
                total+=360-value1+value2;
            else
                total+=(value2-value1);

            if(value2 < value3)
                total+=value2-value3;
            else
                total+=360-value3+value2;

            System.out.println(total);
        }
    }
}
