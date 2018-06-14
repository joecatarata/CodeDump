#include <iostream>
#include <string>
#include <stdio.h>
typedef unsigned long long ull;
using namespace std;

bool isPrime(ull n){

	if(n <= 1)
		return false;
	int i=2;
	while(i*i <= n){
		if(n%i == 0){
			return false;
		}
		i++;
	}
	return true;
}

int main(){
	ios::sync_with_stdio(false);
	string input;
	while(cin >> input){
		string reverse = "";
		
		if(input.length() > 1){
			for(auto rit = input.rbegin(); rit!=input.rend(); rit++){
				reverse += *rit;
			}
		}
		ull n = stoull(input);
		bool prime = isPrime(n);
		bool eprim = false;
		if(input.length()>1 && input != reverse)
			eprim = isPrime(stoull(reverse));
		
		cout << input;
		if(n == 0)
			cout << " is not prime." << endl;
		else if(input.length() > 1 && prime && eprim)
			cout << " is emirp." << endl;
		else if(prime)
			cout << " is prime." << endl;
		else
			cout << " is not prime." << endl;
	}
	return 0;
}
