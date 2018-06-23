#include <iostream>
#include <fstream>
#include <string>
#include <stdio.h>
typedef unsigned long long ull;
using namespace std;


int main(){
	ios::sync_with_stdio(false);
	
	int T = 0, case_num = 1;
	while(cin >> T){
		while((T--) >= 0){
			int n, prev, curr, high=0, low=0;
			cin >> n;
			for(int i=0; i<n; i++){
				if(i==0){
					cin >> prev;
					curr = prev;
				}else{
					prev = curr;
					cin >> curr;
					if(prev < curr)
						high++;
					else if(prev > curr)
						low++;
				}
			}
		
			cout << "Case " << case_num++ << ": " << high << " " << low << endl;
		}
	}
}
