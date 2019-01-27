#include <iostream>
#include <map>
#include <set>
#include <vector>
using namespace std;

int main(){
	ios::sync_with_stdio(false);
	int K, case_num = 1;
	cin >> K;
	map<int, int> percentages;
	set<int> unique;
	while(K-- > 0){
		int N;
		cin >> N;
		vector<vector<int>> stamps;
		int total;
		for(int i=0; i<N; i++){
			int M;
			cin >> M;
			for(int j=0; j<M; j++){
				int A;
				cin >> A;
				stamps[i].push_back(A);
				auto it = unique.find(A);
				if(it == unique.end()){
					unique.insert(A);
					total++;
				}
			}
		}
		
//		for(int i=0; i<stamps.size(); i++){
//			vector<int> fs = stamps.at(i);
//			for(int j=0; j<fs.size(); j++){
//				int A;
//				if(unique.contains(A) != )
//			}
//		}
	}
	
	return 0;
}
