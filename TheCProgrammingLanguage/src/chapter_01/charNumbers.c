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
    long nc;

    nc = 0;
    while(getchar() != EOF) {
        ++nc;
    }
    printf("%ld\n", nc);
    */

    // version: 2nd
    double nc;

    for(nc = 0; getchar() != EOF; ++nc) {

    }
    printf("%.0f\n", nc);

    return 0;
}

/*
output:

*/