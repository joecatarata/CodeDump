import java.io.*;

public class FileName{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        String fileName = br.readLine();
        int ctr = 0;
        StringBuilder sb = new StringBuilder(fileName);
        for(int index = sb.indexOf("xxx", 0); index != -1; index = sb.indexOf("xxx", index)){
            ctr++;
            sb.setCharAt(index, ' ');
        }
        System.out.println(ctr);
    }
}
