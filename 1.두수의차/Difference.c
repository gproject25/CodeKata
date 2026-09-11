#include <stdio.h>

int solution(int num1, int num2){
    int answer = num1 - num2;
    return answer;
}

int main(){
    printf("%d\n", solution(2, 3));
    return 0;
}