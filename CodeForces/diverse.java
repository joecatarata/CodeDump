import java.io.*;

public class diverse{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);
        boolean[] present = new boolean[101];
        String[] secondLine = br.readLine().split(" ");
        int size = 0;
        boolean[] partOfGroup = new boolean [n];

        for(int i=0; i<present.length; i++){
            present[i] = false;
        }

        for(int i=0; i<partOfGroup.length; i++){
            partOfGroup[i] = false;
        }

        for(int i=0; i<secondLine.length; i++){
            int rating = Integer.parseInt(secondLine[i]);
            if(!present[rating] && size < k){
                size++;
                present[rating] = true;
                partOfGroup[i] = true;
            }
        }

        if(size >= k){
            System.out.println("YES");
            for(int i=0; i<partOfGroup.length; i++){
                if(partOfGroup[i]){
                    System.out.print((i+1) + " ");
                }
            }
        }else{
            System.out.println("NO");
        }

    }
}
