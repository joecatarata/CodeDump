#include <iostream>
#include <fstream>
#include <map>
#include <string>
#include <stdio.h>
typedef unsigned long long ull;
typedef unsigned int uint;
using namespace std;

bool allSung(bool hasSung[], int n){
	for(int i=0; i<n; i++){
		if(!hasSung[i])
			return false;
	}
	
	return true;
}
int main(){
	ios::sync_with_stdio(false);
	ofstream out("out.txt");
	int n;
	cin >> n;
	string names[n];
	string song[16] = {
		"Happy",
		"birthday",
		"to",
		"you",
		"Happy",
		"birthday",
		"to",
		"you",
		"Happy",
		"birthday",
		"to",
		"Rujia",
		"Happy",
		"birthday",
		"to",
		"you",
		
	};
	
	for(int i=0; i<n; i++){
		cin >> names[i];		
	}

	int currIndex = 0;
	bool hasSung[n];
	for(int i=0; i<n; i++){
		hasSung[i] = false;
	}
	for(int i=0; i<16; i++){
		
		cout << names[currIndex%n] << ": " << song[i] << endl;
		hasSung[currIndex] = true;
		if(n > 16 && i == 15 && !allSung(hasSung, n)){
			i = -1; 			
		}
		

		currIndex++;
	}
}
