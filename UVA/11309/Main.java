import java.util.*;
import java.io.*;
class Main{
    static boolean isPal(String s){


        // for(int i=0; i<sb.length(); i++){
        //     if(sb.charAt(i) != '0')
        //         break;
        //     if(sb.charAt(i) == '0')
        //         sb.deleteCharAt(i);
        // }
        // s.replaceAll("^0+", "");
        StringBuilder sb = new StringBuilder(s);
        if(!sb.equals("0000"))
            sb = new StringBuilder(s.replaceAll("^0+", ""));

        for(int i=0; i<sb.length()/2; i++){
            if(sb.charAt(i) != sb.charAt(sb.length()-(i+1)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        // PrintStream fileStream = new PrintStream("filename.txt");
        // System.setOut(fileStream);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(String input = br.readLine(); input != null; input = br.readLine()){
            int n = Integer.parseInt(input);
            for(int x=0; x<n; x++){
                String inputTime = br.readLine();
                StringBuilder sb = new StringBuilder(inputTime);
                do{

                    String[] time = inputTime.split(":");
                    int hours = Integer.parseInt(time[0]);
                    int minutes = Integer.parseInt(time[1]);
                    minutes++;
                    if(minutes == 60){
                        hours++;
                        minutes = 0;
                    }
                    if(hours == 24)
                        hours = 0;
                    if(hours>9)
                        if(minutes>9)
                            inputTime = hours+":"+minutes;
                        else{
                            inputTime = hours+":0"+minutes;
                        }
                    else{
                        if(minutes>9)
                            inputTime = "0"+hours+":"+minutes;
                        else
                            inputTime = "0"+hours+":0"+minutes;
                    }
                }while(!isPal(inputTime.replaceAll(":", "")));
                System.out.println(inputTime);
            }
        }
    }
}
