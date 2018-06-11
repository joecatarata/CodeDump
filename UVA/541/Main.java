import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for(int N = Integer.parseInt(br.readLine()); N!=0; N = Integer.parseInt(br.readLine())){
            String[][] matrix = new String[N][N];
            for(int i=0; i<N; i++){
                matrix[i] = br.readLine().split(" ");
            }
            int[] sum_of_rows = new int[N];
            int[] sum_of_cols = new int[N];
            int oddCtr = 0;
            int oddCtr2 = 0;
            for(int i=0; i<N; i++){
                int sum_of_row = 0;
                for(int j=0; j<N; j++){
                    sum_of_row+=Integer.parseInt(matrix[i][j]);

                }
                sum_of_rows[i] = sum_of_row;

                if(sum_of_row%2==1)
                    oddCtr++;
            }
            for(int i=0; i<N; i++){
                int sum_of_col = 0;
                for(int j=0; j<N; j++){
                    sum_of_col+=Integer.parseInt(matrix[j][i]);
                }
                sum_of_cols[i] = sum_of_col;
                if(sum_of_col%2==1)
                    oddCtr2++;
            }
            int row_to_be_changed = -1;
            int col_to_be_changed = -1;
            if(oddCtr > 1 || oddCtr2 > 1){
                System.out.println("Corrupt");
            }else if(oddCtr == 1 || oddCtr2 == 1){
                for(int i=0; i<N; i++){
                    if(sum_of_rows[i]%2 == 1){
                        row_to_be_changed = i+1;
                        break;
                    }
                }
                for(int i=0; i<N; i++){
                    if(sum_of_cols[i]%2 == 1){
                        col_to_be_changed = i+1;
                        break;
                    }
                }
                System.out.printf("Change bit (%d,%d)\n", row_to_be_changed, col_to_be_changed);
            }else{
                System.out.println("OK");
            }
        }



    }
}
