import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ctr = 1;
		for(String input = br.readLine(); !(input.contains("#")); input = br.readLine()){
			System.out.print("Case " + ctr + ": ");
			if(input.equalsIgnoreCase("HELLO")){
				System.out.println("ENGLISH");
			}
			else if(input.equalsIgnoreCase("HOLA")){
				System.out.println("SPANISH");
			}
			else if(input.equalsIgnoreCase("HALLO")){
				System.out.println("GERMAN");
			}
			else if(input.equalsIgnoreCase("BONJOUR")){
				System.out.println("FRENCH");
			}
			else if(input.equalsIgnoreCase("CIAO")){
				System.out.println("ITALIAN");
			}
			else if(input.equalsIgnoreCase("ZDRAVSTVUJTE")){
				System.out.println("RUSSIAN");
			}
			else{
				System.out.println("UNKNOWN");
			}

			ctr++;
		}

	}
}
