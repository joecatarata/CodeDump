#include <iostream>
#include <vector>
using namespace std;

bool findNumber(int a[], int size, int key){

    for(int i=0; i<size; i++){
        if(a[i] == key){
            return true;
        }
    }
    
    return false;
}

void sortByOne(int statues[], int size){
	int min = statues[0];
	int max = statues[0];
    int statuesNeeded=0;
    vector<int> missingStatues;
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
            missingStatues.push_back(i);
        }
    }
    cout << statuesNeeded <<" statues needed" << endl;
    if(statuesNeeded > 0){
        cout << "Raymond needs statues: ";
    }
    for(int i=0; i < missingStatues.size(); i++){
        if(i>0){
            cout <<", ";
        }
        cout << missingStatues[i];
    }
}

int main(){

	int statues[4];
	int ctr = 0;

	while (ctr<4){
		cout << "Input Statue Size #" << ctr+1 <<": ";
		cin >> statues[ctr];
		ctr++;
	}

    sortByOne(statues, 4);

	return 0;
}