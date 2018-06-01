#include <string>
#include <iostream>
#include <unordered_map>

using namespace std;
int main(){
	ios::sync_with_stdio(false);
	string input = "";
	cin >> input; 
	
	unordered_map<char, string> dict;
	
	dict['A'] = "-";
	dict['B'] = "--.";
	dict['C'] = ".--";
	dict['D'] = "-.-";
	dict['E'] = ".";
	dict['F'] = "..-";
	dict['G'] = "---.";
	dict['H'] = "..--";
	dict['I'] = "-.";
	dict['J'] = "---";
	dict['K'] = "...";
	dict['L'] = ".-.";
	dict['M'] = ".-.-";
	dict['N'] = ".-..";
	dict['O'] = "..";
	dict['P'] = ".--.";
	dict['Q'] = "--..";
	dict['R'] = ".-..-";
	dict['S'] = "....-";
	dict['T'] = "-..--";
	dict['U'] = "--";
	dict['V'] = "-.-..";
	dict['W'] = "--..-";
	dict['X'] = ".-.-.";
	dict['Y'] = ".....";
	dict['Z'] = "-----";
	
	int first_size = 0;

	
	while(first_size < input.length()){
		string output = "";

		for(int i=first_size; i<input.length(); i++){
			
		}
		
		first_size++;
	}
	
	
	return 0;
}