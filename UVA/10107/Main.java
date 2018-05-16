import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int number;
        String input;
        while((input =br.readLine()) != null){
            int answer;
            number = Integer.parseInt(input.trim());
            numbers.add(number);
            Collections.sort(numbers);
            if(numbers.size() % 2 == 0){
                int x = numbers.get(numbers.size()/2);
                int y = x-1;
                answer = (numbers.get(x)+numbers.get(y)) / 2;
            }else{
                int x = numbers.size()/2;
                answer = numbers.get(x);
            }
            System.out.println(answer);
        }
    }
}
