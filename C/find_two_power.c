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
