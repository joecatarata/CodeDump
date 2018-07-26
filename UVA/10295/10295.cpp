#include <iostream>
#include <map>

using namespace std;

int main(){
	ios::sync_with_stdio(false);
	int m, n;
	cin >> m >> n;
	map<string, int> words;
	for(int i=0; i<m; i++){
		string s;
		int x;
		cin >> s >> x;
		words[s] = x;
	}
	
	for(int i=0; i<n; i++){
		string desc = "";
		int total = 0;
		do{
			cin >> desc;
			if(words.find(desc) != words.end()){
					total += words[desc];
			}
		}while(desc != ".");
		cout << total << endl;
	}
	
	return 0;
}