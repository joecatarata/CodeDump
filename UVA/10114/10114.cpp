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
	double downPayment, loanAmount;
	int duration, depRecCount;
	

	while(cin >> duration >> downPayment >> loanAmount >> depRecCount){
		map<int, double> depRecords;
		bool isSet[depRecCount];
	
		for(int i=0; i<depRecCount; i++){
			
			int month;
			double rate;
			cin >> month >> rate;
			depRecords[month] = rate;
		}
		double carValue = loanAmount;
		for(int i=0; i<depRecords.size(); i++){
			if(depRecords.find(i) == depRecords.end()){
				depRecords[i] = depRecords[i-1];
			}
			
			
		}
	}
	
}
