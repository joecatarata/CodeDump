import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.StringBuilder;
class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(String[] words = br.readLine().split(" "); words.length > 0; words = br.readLine().split(" ")){
			String output = "";
			for(int i=0; i<words.length; i++){
				String word = words[i];
				StringBuilder sb = new StringBuilder(word);
				Character last_letter = null;
				if(i == words.length-1){

					if(sb.charAt(sb.length()-1) == '!'
					|| sb.charAt(sb.length()-1) == '.'
					|| sb.charAt(sb.length()-1) == '?'){
						last_letter = sb.charAt(sb.length()-1);
						sb.deleteCharAt(sb.length()-1);
					}
				}

				char first_letter = word.charAt(0);
				if(first_letter == 'a' || first_letter == 'A'
				|| first_letter == 'e' || first_letter == 'E'
				|| first_letter == 'i' || first_letter == 'I'
				|| first_letter == 'o' || first_letter == 'O'
				|| first_letter == 'u' || first_letter == 'U'){
					// output += sb.toString() + "ay";
					sb.append("ay");
					if(last_letter != null){
						sb.append(last_letter);
					}
					sb.append(" ");
					output += sb.toString();
				}
				else{

					sb.deleteCharAt(0);
					sb.append(first_letter);
					sb.append("ay");
					if(last_letter != null){
						sb.append(last_letter);
					}
					sb.append(" ");
					output += sb.toString();
				}

			}
			System.out.println(output);
		}


    }
}
