/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

int strlength(char *str);

int main() {
    printf("%d", strlength("hello, world"));

    return 0;
}

/**
 * 返回字符串s的长度
 */
int strlength(char *s) {
    /*
    // version: 1st
    int n;

    for(n = 0; *s != '\0'; s++) {
        n++;
    }

    return n;
    */
    
    // version: 2nd
    char *p = s;

    while(*p != '\0') {
        p++;
    }

    return p - s;
}

/*
output:
12
*/