	#include <iostream>
	#include <fstream>

	using namespace std;
	
	int main(){
		int N;
		ios::sync_with_stdio(false);
		cin >> N;
		for(int caseNum = 0; caseNum < N; caseNum++){
			double total=0.0, avg = 0.0;
			for(int i=0; i<12; i++){
				// cout << "Pumasok";
				double x;
				cin >> x;
				total += x;
			}
			avg = (double) total/12;
			// cout << (caseNum+1) << "" << avg << endl;	
		}
		return 0;

	}