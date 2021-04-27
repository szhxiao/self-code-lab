/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

int main() {
    /* 
    // version: 1st
    int c;

    c = getchar();
    while(c != EOF) {
        putchar(c);
        c = getchar();
    }
    */
    
    // version: 2nd
    int c;
    while((c = getchar()) != EOF) {
        putchar(c);
    }

    return 0;
}

/*
output:

*/