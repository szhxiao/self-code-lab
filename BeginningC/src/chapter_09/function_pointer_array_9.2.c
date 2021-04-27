/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 9.2
 * Arrays of Pointers to functions
 */

#include <stdio.h>

int sum(int, int);
int product(int, int);
int difference(int, int);

int main(void) {
    int a = 10;
    int b = 5;
    int result = 0;
    int (*pfun[3])(int, int);  // Function pointer array declaration

    pfun[0] = sum;
    pfun[1] = product;
    pfun[2] = difference;

    for (int i = 0; i < 3; i++) {
        result = pfun[i](a, b);
        printf("result = %2d\n", result);
    }
    result = pfun[1](pfun[0](a, b), pfun[2](a, b));
    printf("The product of the sum and the difference = %2d\n", result);
    return 0;
}

int sum(int x, int y) {
    return x + y;
}

int product(int x, int y) {
    return x * y;
}

int difference(int x, int y) {
    return x - y;
}

/*
output:
result = 15
result = 50
result =  5
The product of the sum and the difference = 75
*/