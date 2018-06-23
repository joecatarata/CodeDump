#include <iostream>
#include <fstream>
#include <map>
#include <string>
#include <stdio.h>
typedef unsigned long long ull;
typedef unsigned int uint;
using namespace std;


int main(){
	ios::sync_with_stdio(false);
	ofstream out("out.txt");
	int banks, debentures;
	while(cin >> banks >> debentures){
		int R[banks];
		int N[debentures][3];
		int total = 0;
		for(int i=0; i<banks; i++){
			cin >> R[i];
			
		}
		
		for(int i=0; i<debentures; i++){
			for(int j=0; j<3; j++){
				cin >> N[i][j];
			}
		}
		
//		if(total >= 0)
//			out << "s" << endl;
//		else
//			out << "n" << endl;
		
		
	}
	
}
