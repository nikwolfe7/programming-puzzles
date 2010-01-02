/*
  find_two_power.c

  This program determines the powers of two between 1 and 10000000
  using a fast bitwise algorithm. Since all powers of two have only 1 bit
  set in a binary representation, the bitwise AND of that number and
  a number 1 less than it will return all zeros. 

  For instance,
	
	01000	= 8
	00111 	= 7
	
		01000
	+	00111
	--------------
		00000
*/

#include <stdio.h>

int is_power_of_two();

int main() {
	int i = 1;
	while( ++i < 10000000 )
	{
		if( is_power_of_two( i ) ) 
			printf("%d\n",i);
	}
}

int is_power_of_two(int num) {
	int ret = (num & (num-1));
	if( ret == 0 ){ 
		return 1;
	}
	else {
		return 0;
	}
}
