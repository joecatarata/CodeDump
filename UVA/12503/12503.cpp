#include <iostream>
#include <fstream>
#include <vector>
#include <string>

using namespace std;

void move(string input, int &p, vector<string> &insts){
	if(input == "LEFT"){
		p--;
		insts.push_back("LEFT");
	}else if(input == "RIGHT"){
		p++;
		insts.push_back("RIGHT");
	}
}
int main(){
	ios::sync_with_stdio(false);
	int t;
	while(cin >> t){
		for(int h=0; h<t; h++){
			vector<string> insts;
			int n, p=0;
			cin >> n;
			cin.ignore(100,'\n');
			for(int x=0; x<n; x++){
				string inst;
				getline(cin, inst);
				if(inst.find("SAME AS") == inst.npos)
					move(inst, p , insts);
				else{
					int i = stoi(inst.substr(8));
					move(insts.at(i-1), p, insts);
				}
			}
			cout << p << endl;
		}
	}
	return 0;
}
