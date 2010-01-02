/*
  find_ones_recursive.c
  
  This program finds the 1's in a 32 bit integer by
  recursively dividing by 10 and looking at the remainder.
*/

#include <stdio.h>

int main() {
	int num1 = 123421211;
	int num2 = 230781000;
	int num3 = 111111111;
	int num4 = 300204203;

	printf("The number of 1's in %d is %d\n", num1, find_ones(num1, 0));
	printf("The number of 1's in %d is %d\n", num2, find_ones(num2, 0));
	printf("The number of 1's in %d is %d\n", num3, find_ones(num3, 0));
	printf("The number of 1's in %d is %d\n", num4, find_ones(num4, 0));
	
	return 0;
}

int find_ones(int num, int cnt) {
	int number = num;
	int count = cnt;
	int temp = number % 10;
	
	if( number <= 0 ) { // base case
		return count;
	}	
	else { // recursive case
		number = (number / 10);
		if( temp == 1 ){
			++count;
		}
		// recursive call
		return find_ones(number, count);
	}
}
