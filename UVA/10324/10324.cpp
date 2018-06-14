#include <iostream>
#include <fstream>
#include <string>
#include <algorithm>
using namespace std;

bool isSame(string input, int max, int min){
	
	for(int i=min; i<=max; i++){
		if(input.at(min) != input.at(i)){
			return false;
		}	
	}
	return true;
}
int main(){
	ofstream out("out.txt");
	int case_num = 1;
	string input;
	while(getline(cin, input)){
		
		
		if(input.empty()){
			break;
		}
			
		
		int n, i, j;
		cin >> n;
		cout << "Case " << case_num++ << ":\n";
		for(int x=0; x<n; x++){
			cin >> i >> j;
			
			if(isSame(input, max(i,j), min(i,j))){
				cout << "Yes\n";
			}else{
				cout << "No\n";
			}
		}
		
		cin.ignore();
	}
}
