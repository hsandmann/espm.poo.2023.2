#include <stdio.h>


int main() {

	int x = 10;
	int shift = 1;
	printf("ola mundo: %d\n", x);
	printf("x is at: %p\n", (void *) &x);
	printf("next pos mem: %p and the content is: %d\n", (&x + shift), *((int*)(&x + shift)) );
	
}
