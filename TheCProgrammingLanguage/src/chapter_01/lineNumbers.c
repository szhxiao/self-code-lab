/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

int main() {
    int c, nl;

    nl = 0;
    while((c = getchar()) != EOF) {
        if(c == '\n') {
            ++nl;
        }
    }
    printf("%d\n", nl);

    return 0;
}

/*
output:

*/