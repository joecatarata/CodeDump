#include <iostream>
#include <unordered_map>
#include <vector>
#include <cstring>
using namespace std;

int main(){
	vector<int> list1;
	vector<int> list2;
	
	int T;
	while(cin >> T){
		unordered_map<int, int> list1;
		unordered_map<int, int> list2;
		int N, M;
		cin >> N >> M;
		int numToBeRemoved = 0;
		for(int i=0; i<N; i++){
			int num;
			cin >> num;
			if(list1.find(num) == list1.end())// num is not on map
			{
				list1[num] = 1;
			}else{
				list1[num]++;
			}
		}
		for(int i=0; i<M; i++){
			int num;
			cin >> num;
			if(list2.find(num) == list2.end())
			{
				list2[num] = 1;
			}else{
				list2[num]++;
			}
		}
		for(auto it = list1.begin(); it != list1.end(); i++)}{
			if(list2.find(it->first))
			
		}
	return 0;
}