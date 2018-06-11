import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int length = Integer.parseInt(br.readLine()); length > 0; length = Integer.parseInt(br.readLine())){
            String[] input = br.readLine().split(" ");
            String pointed_where = "+x";
            int last_segment_value = 0;
            for(int j=1; j<=length-1; i++){
                String bend_where = input[length-j];
                if(bend_where.equals("+y")){

                    if(pointed_where.equals("+x")){
                        pointed_where = "+y";
                    }else if(pointed_where.equals("-x")){
                        pointed_where = "+y"
                    }else if(pointed_where.equals("+y")){

                    }else if(pointed_where.equals("-y")){

                    }else if(pointed_where.equals("+z")){

                    }else if(pointed_where.equals("-z")){

                    }

                }

                if(bend_where.equals("-y")){

                    if(pointed_where.equals("+x")){
                        pointed_where = "-y";
                    }else if(pointed_where.equals("-x")){
                        pointed_where = "-y"
                    }else if(pointed_where.equals("+y")){
                        
                    }else if(pointed_where.equals("-y")){
                        pointed_where = "-x"
                    }else if(pointed_where.equals("+z")){

                    }else if(pointed_where.equals("-z")){

                    }

                }
            }
        }
    }
}
