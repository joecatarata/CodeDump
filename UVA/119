import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main {
    public static void main(String[] args) throws IOException{
        String text = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ctr=0;
        String newText = "";
        while((newText = br.readLine()) != null){
            char[] temp = newText.toCharArray();
            String temp2 = "";
            for(int i=0; i<temp.length; i++){
                if(temp[i] == '\"'){
                    if(ctr % 2 == 0){
                        temp2 += "``";
                    }
                    else if(ctr%2==1){
                        temp2 += "\'\'";
                    }
                    ctr ++ ;
                }else{
                    temp2 += temp[i];
                }
            }
            text += String.valueOf(temp2);
            System.out.println(temp2);
        }

    }
}
