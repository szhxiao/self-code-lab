/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>
#include <ctype.h>

int main() {
    int c;

    while((c = getchar()) != EOF) {
        putchar(tolower(c));
    }

    return 0;
}

/*
output:

*/