#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main(){
	ios::sync_with_stdio(false);
	int N;
	while(cin >> N){
		if(N>0){
			long answer = (N*(N+1)*(2*N+1))/6;
			cout << answer << endl;
		}else{
			break;
		}
	}
	return 0;
}

//Input
//The input contains several test cases. Each test case is composed of a single line, containing only one
//integer N, representing the number of squares in each side of the grid (1 <= N <= 100).
//The end of input is indicated by a line containing only one zero.
//Output
//For each test case in the input, your program must print a single line, containing the number of different
//squares for the corresponding input.

//Sample Input
//2
//1
//8
//0
//Sample Output
//5
//1
//204
