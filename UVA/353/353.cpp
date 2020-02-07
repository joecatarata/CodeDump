#include <iostream>
#include <unordered_map>
using namespace std;

bool isPalindrome(string s){
	for(int i=0; i<s.length()/2; i++){
		if(s.at(i) != s.at(s.length()-(i+1))){
			return false;
		}
	}
	return true;
}


int main(){

	string input;
	while(cin >> input){
		int total = 0;
		string temp = input;
		unordered_map<string, int> isPresent;
		for(int i=0; i<input.length(); i++){
			for(int j=0; j<input.length(); j++){
				string substring = input.substr(i,input.length()-j);

				if(isPresent.find(substring) == isPresent.end()){
					isPresent[substring];
					if(isPalindrome(substring)){
						total++;
					}
				}
			}
		}
		cout << "The string \'" << input << "\' contains " << total <<" palindromes."<<endl;
	}
	return 0;
}
