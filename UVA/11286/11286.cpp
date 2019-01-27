#include <iostream>
#include <fstream>
#include <map>
using namespace std;

int main(){
	ios::sync_with_stdio(false);
	
	int n;
	while(cin >> n){
		if(n == 0)
			break;
		map<int, int> pop;
		int max;
		for(int i=0; i<n; i++){
			for(int j=0; j<5; j++){
				int course;
				cin >> course;
				if(pop.find(course) == pop.end()){ // new element
					pop[course] = 1;
				}else{ // element already present
					pop[course] = pop[course]+1;
				}
				if(i==0 && j==0)
					max = 1;
				else if(max < pop[course])
					max = pop[course];
			}
		}
		cout << max << endl;
		int total = 0;
		int highest[n+1];
		for(auto it = pop.begin(); it != pop.end(); it++){
//			cout <<  it->first << " "<< it->second << endl;
			if(it->second == max)
				total++;
		}
		cout << total << endl;
	}
	return 0;
}
