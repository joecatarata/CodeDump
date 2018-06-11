import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Integer[] elements = new Integer[n];
        String[] numbers = br.readLine().split(" ");

        for(int i=0; i<numbers.length; i++){
            elements[i] = Integer.parseInt(numbers[i]);

        }
        int size = n;
        for(int i=n-1; i>0; i--){
            for(int j=i-1; j>=0; j--){
                if(elements[j] != null && elements[i] != null){
                    if(elements[j].equals(elements[i])){

                        elements[j] = null;
                        size--;
                    }
                }

            }
        }

        System.out.println(size);
        for(Integer element : elements){
            if(element != null)
                System.out.print(element+" ");
        }
    }
}
