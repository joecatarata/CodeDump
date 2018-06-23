import java.io.*;

class Main{

	public static boolean isNumeric(String message){
		for(int i=0; i<message.length(); i++){
			if(!Character.isDigit(message.charAt(i)))
				return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String message;
		while((message=br.readLine()) != null && message.length()>0){
			StringBuilder sb;
			if(!isNumeric(message)){
				sb = new StringBuilder(" ");
				for(int i=0; i<message.length(); i++){
					int ascii = (int) message.charAt(i);
					sb.append(ascii);
				}
				System.out.println(sb.reverse());
			}else{
				sb = new StringBuilder(message);
				message = sb.reverse().toString();
				sb = new StringBuilder("");
				for(int i=0; i<message.length();){
					StringBuilder temp = new StringBuilder("");
					char c;
					if(message.charAt(i) == '1'){
						temp.append((char) message.charAt(i));
						temp.append((char) message.charAt(i+1));
						temp.append((char) message.charAt(i+2));
						c = (char) Integer.parseInt(temp.toString());
						i+=3;
					}else{
						temp.append((char) message.charAt(i));
						temp.append((char) message.charAt(i+1));
						c = (char) Integer.parseInt(temp.toString());
						i+=2;
					}

					sb.append(c);
				}
				System.out.println(sb.reverse().toString());
			}
		}
	}
}
