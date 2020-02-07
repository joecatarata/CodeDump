#include <iostream>
#include <string>
using namespace std;
bool isPal(string s){
    for(int i=0; i<s.length()/2; i++){
        if(s.at(i) != s.at(s.length()-(i+1)))
            return false;
    }
    return true;
}
int main(){
    int T;
    while(cin >> T){
        char L[10001];


    }
    return 0;
}
