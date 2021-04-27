/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

/**
 * 打印十进制数n
 */
void printd(int n) {
    if(n < 0) {
        putchar('-');
        n = -n;
    }
    if(n / 10) {
        printd(n / 10);
    }
    putchar(n % 10 + '0');
}

int main() {
    printd(131425);

    return 0;
}

/*
output:
131425
*/