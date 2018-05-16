import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(String input = br.readLine(); input != null; input = br.readLine()){
            System.out.println(input.replaceAll("[^A-Za-z]+", " ").trim().split(" ").length);
        }
    }
}
