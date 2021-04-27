/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

int atoi(char s[]);
int lower(int c);

int main() {

    char ch = 'S';
    printf("%c\n", lower(ch));

    return 0;
}

/**
 * 把字符c转换为小写形式
 */
int lower(int c) {
    if(c >= 'A' && c <= 'Z') {
        return c + 'a' - 'A';
    } else {
        return c;
    }
}

/*
output:

*/