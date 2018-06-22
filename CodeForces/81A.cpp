#include <iostream>
#include <string>
#include <stack>

using namespace std;
//Glorified parenthesis balance
void reverse(string s){

	for(int i=s.length()-1; i>=0 ;i++){
		cout << s.at(i);	
	}
}
int main(){
	string input = "";
	
	cin >> input;
	stack <char> output;
	
	for(int i=0; i<input.length(); i++){
		
		if(output.empty()){
			output.push(input.at(i));
		}else{
			if(input.at(i) == output.top()){
				output.pop();
			}else{
				output.push(input.at(i));
			}
		}
		
	}
	stack <char> temp;
    while(!output.empty()){
		temp.push(output.top()); 	
		output.pop();
	}
	
	while(!temp.empty()){
		cout << temp.top();
		temp.pop();
	}
	
	
}
