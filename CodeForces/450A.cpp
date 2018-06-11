#include <iostream>
#include <string>


using namespace std;
int main(){
	
	int max = 0;
	int n, m;
	cin >> n;
	cin >> m;
	int arr[n];
	for(int i=0; i<n; i++){
		
		cin >> arr[i];
		if(i==0)
			max = arr[i];
		if(max <= arr[i])
			max = arr[i];
	}
	
	for(int i=n-1; i>=0; i--){
		if(arr[i] == max){
			cout << i+1;
			break;
		}
	}
	return 0;	
}

