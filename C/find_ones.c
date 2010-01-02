/*
	find_ones.c
	
	This program finds the 1s in a 32 bit number by
	iteratively dividing by 10 and looking at the remainder
*/

#include <stdio.h>

int main() {
	int num1 = 123421211;
	int num2 = 230781000;
	int num3 = 111111111;
	int result;

	result = find_ones(num1);
	printf("The number of 1's in %d is %d\n", num1, result );
	
	result = find_ones(num2);
	printf("The number of 1's in %d is %d\n", num2, result );
	
	result = find_ones(num3);
	printf("The number of 1's in %d is %d\n", num3, result );
	
	return 0;
}

int find_ones(int num) {
	int cnt = 0;
	int temp = 0;
	while( num > 0 ) {
		temp = num % 10;
		if( temp == 1 ){
			++cnt;
		}
		num = ( num / 10 );
	}
	return cnt;
}
