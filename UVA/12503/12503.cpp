#include <iostream>
#include <fstream>
#include <string>
#include <vector>
using namespace std;

void move(string s, int *p, vector<string> insts){
	if(s == "LEFT"){
		p--;
		insts.push_back("LEFT");
	}else if(s == "RIGHT"){
		p++;
		insts.push_back("RIGHT");
	}
}
int main(){
	ios::sync_with_stdio(false);
	string input;
	int t;
	while(cin >> t){
		int x;
		while((t--)>=0){
			cin >> x;
			vector<string> instructions;
			int p=0;
			bool isString = false;
			if(cin.fail()){
				cin >> input;
				isString = true;
			}

			if(isString){
				move(input, &p, instructions);
			}else{
				move(vector.at(x), &p, instructions);
			}
			
		}
	}
	
	return 0;
}