import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        while((C--) > 0){
            String[] data_set = br.readLine().split(" ");
            int n = Integer.parseInt(data_set[0]);
            double avg = 0.0;
            double weight_of_student = (double) 100.0/n;
            double final_pct = 100.000;

            for(int i=1; i<data_set.length; i++){
                avg += Double.parseDouble(data_set[i]);
            }

            avg/=n;

            for(int i=1; i<data_set.length; i++){
                double grade = Double.parseDouble(data_set[i]);
                if(grade <= avg){
                    final_pct -= weight_of_student;
                }
            }

            System.out.printf("%.3f", final_pct);
            System.out.println("%");
        }
    }
}
