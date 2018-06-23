#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int isNumeric(char message[]){
	int i=0;
	for(i=0; i<strlen(message); i++){
		if(message[i] >= '0' && message[i] <= '9'){
			return 0;
		}
	}
	return 1;
}

void encode(char message[]){
	char output[81] = "";
	int i, length = strlen(message);

	for(i=0; i<length; i++){
		if(message[length-1-i] == "\n")
			continue;
		output[i] = message[length-1-i];
	}
	printf("%s\n", output);
}
int main(){
	char message[81]  = "";

	while(fgets(message, 81, stdin)){
		if(message[0] == '\n')
			break;

		encode(message);
	}
	return 0;
}
