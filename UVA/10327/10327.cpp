#include <iostream>
#include <string>
#include <stdio.h>
typedef unsigned long long ull;
using namespace std;

int bubbleSort(int a[], int n){
	int flips = 0;
	for(int i=n-1; i>=1; i--){
		
		for(int j=i-1; j>=0; j--){
			if(a[j+1] < a[j]){
				int temp = a[j+1];
				a[j+1] = a[j];
				a[j] = temp;
				flips++;
			}
		}
	}
	return flips;
}

int main(){
	ios::sync_with_stdio(false);
	int n;
	while(cin >> n){
		int ctr = 0;
		int array[n];
		for(int i=0; i<n; i++){
			cin >> array[i];
		}
		int flips = bubbleSort(array, n);
		cout << "Minimum exchange operations : " << flips << endl;
	}
	return 0;
}
