#include <iostream>
#include <string>

using namespace std;

void backtrack(string s, int *moves){
	long l = stol(s);
	if(l % 25 == 0){
		cout << *moves;
		return;
	}else{
		if(s)	
	}
}

bool isSafe(string s){
	if(s.at(0) == '0')
		return false;
	else
		return true;
}

int main(){
 	ios::sync_with_stdio(false);
 	string s;
 	cin >> s;
 	int moves = 0;
 	backtrack(s, &moves);
	return 0;
}
