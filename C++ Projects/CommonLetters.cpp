#include <iostream>
#include <string.h>
using namespace std;

void checkCommonLetters(char s1[], char s2[]){
    unsigned int lettersS1[256] = { 0 };
    unsigned int lettersS2[256] = { 0 };
    int total = 0;
    bool common = false;
    //Increment the value at index = asciiValue of current letter
    for(int i=0; i<strlen(s1); i++){
        lettersS1[(unsigned char)s1[i]]++;
    }

    for(int i=0; i<strlen(s1); i++){
        lettersS2[(unsigned char)s2[i]]++;
    }

    //Print common letters
    for(int i=0; i<256; i++){
        if(lettersS1[i]>0 && lettersS2[i]>0){
            total++;
            cout << "Quantity: " << lettersS1[i]+lettersS2[i] << " Letter: " << char(i) << endl;
            common = true;
        }
    }
    cout << "Total Number of Common Characters: " << total << endl;


    if(!common){
        cout << "No common letters!" << endl;
    }
}

int main(){

    char s1[50];
    char s2[50];

    cout << "Input String #1: ";
    cin >> s1;
    cout << "Input String #2: ";
    cin >> s2;
    checkCommonLetters(s1, s2);
}
