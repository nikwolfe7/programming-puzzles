/*
  greatest_common_divisor.c
  
  This greatest common divisor program uses Dijkstra's explanation 
  of the GCD algorithm from the 0th chapter of 'A Discipline of Programming'
*/
#include <stdio.h>

int main() {
	int i, j;
	i = 111; j = 259;
	printf("The GCD of %d and %d is %d\n", i, j, gcd(i,j)); 
	
	i = 4; j = 4;
	printf("The GCD of %d and %d is %d\n", i, j, gcd(i,j));
	
	i = 4; j = 5;
	printf("The GCD of %d and %d is %d\n", i, j, gcd(i,j));
	
	i = 0; j = 5234;
	printf("The GCD of %d and %d is %d\n", i, j, gcd(i,j));
	
	i = 37; j = 25;
	printf("The GCD of %d and %d is %d\n", i, j, gcd(i,j));
	
	i = -64; j = 256;
	printf("The GCD of %d and %d is %d\n", i, j, gcd(i,j));
	
	i = -4; j = -14;
	printf("The GCD of %d and %d is %d\n", i, j, gcd(i,j));
	return 0;
}

int gcd(int x, int y) {
	x = abs(x);
	y = abs(y);
	if( x == 0 || y == 0 ) {
		return 0;
	}
	else if( x == y ) {
		return x;
	}
	else if( x > y ) {
		return gcd(( x - y ), y);
	}
	else {
		return gcd(x, ( y - x ));	
	}
}
