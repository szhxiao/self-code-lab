/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 9.1
 * Pointing to functions
 */

#include <stdio.h>

int sum(int, int);
int product(int, int);
int difference(int, int);

int main(void) {
    int a = 10;
    int b = 5;
    int result = 0;
    int (*pfun)(int, int);  // Function pointer declaration

    pfun = sum;  // Points to function sum()
    result = pfun(a, b);
    printf("pfun = sum          result = %2d\n", result);

    pfun = product;  // Points to function product()
    result = pfun(a, b);
    printf("pfun = product      result = %2d\n", result);

    pfun = difference;  // Points to function difference()
    result = pfun(a, b);
    printf("pfun = difference() result = %2d\n", result);
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
pfun = sum          result = 15
pfun = product      result = 50
pfun = difference() result =  5
*/