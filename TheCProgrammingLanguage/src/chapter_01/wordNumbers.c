/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

#define IN 1        // 在单词内
#define OUT 0       // 在单词外

int main() {
    int c, nl, nw, nc, state;

    state = OUT;
    nl = nw = nc = 0;
    while((c = getchar()) != EOF) {
        ++nc;
        if(c == '\n') {
            ++nl;
        }

        if(c == ' ' || c == '\n' || c == '\t') {
            state = OUT;
        } else if(state == OUT) {
            state = IN;
            ++nw;
        }
    }
    printf("%d\t%d\t%d\n",nl, nw, nc);

    return 0;
}

/*
output:

*/