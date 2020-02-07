#include <iostream>
#include <vector>
#include <string>
using namespace std; 

void split(string str, vector<string> &out, string delim)
{
    
}

int main(){
	ios_base::sync_with_stdio(false);
	cout << "gumana" << endl;
	vector<string> dict;
	string input;
	while(cin >> input){
		if(input == "#")
			break;

		dict.push_back(input);
	}
	string puzzle;
	int ctr=0;
	while(cin >> puzzle){
		if(puzzle == "#")
			break;

		bool possible = true;
		for(auto it=dict.begin(); it != dict.end(); it++){
			string word = *it;

		}
	}
	return 0;
}