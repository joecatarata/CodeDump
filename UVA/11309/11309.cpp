#include <iostream>
#include <string>
using namespace std;
bool isPal(string s){
    if(s.length() == 1)
        return true;
    for(int i=0; i<s.length()/2; i++){
        if(s.at(i) != s.at(s.length()-(i+1)))
            return false;
    }
    return true;
}
int main(){
    int n;
    while(cin >> n){
        string time;
        cin >> time;
        
    }
    return 0;
}
