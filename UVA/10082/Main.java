import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_ctr = 1;
        String[][] layout = new String[][]{
            {"`", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0","-","="},
            {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", "\\"},
            {"A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "\'"},
            {"Z", "X", "C", "V", "B", "N", "M", ",", ".", "/"}
        };
        String[] input_line = br.readLine().toUpperCase().split("");
        for(String input : input_line){
            if(input.equals(" "))
            {
                System.out.print(" ");
            }else{
                for(int i=0; i<layout.length; i++){
                    for(int j=0; j<layout[i].length; j++){
                        String key = layout[i][j];
                        if(key.equalsIgnoreCase(input)){
                            System.out.print(layout[i][j-1]);
                            break;
                        }

                    }
                }
            }

        }

    }
}
