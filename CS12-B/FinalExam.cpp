#include <iostream>

using namespace std;

bool findNumber(int a[], int size, int key){

    for(int i=0; i<size; i++){
        if(a[i] == key){
            return true;
        }
    }
    
    return false;
}

int sortByOne(int statues[], int size){
	int min = statues[0];
	int max = statues[0];
    int statuesNeeded=0;
    //Get min and max
    for(int i=0; i<size; i++){
        if(min >= statues[i]){
            min = statues[i];
        }
        if(max <= statues[i]){
            max = statues[i];
        }
    }
    for(int i=min; i<max; i++){
        if(!(findNumber(statues, 4, i))){
            statuesNeeded++;
        }
    }
	return statuesNeeded;
}

int main(){

	int statues[4];
	int ctr = 0;

	while (ctr<4){
		cout << "Input Statue Size #" << ctr+1 <<": ";
		cin >> statues[ctr];
		ctr++;
	}

    cout << "Statues needed: " << sortByOne(statues, 4);

	return 0;
}