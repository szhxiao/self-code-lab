/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <string.h>

/**
 * 倒置字符串s中各个字符的位置
 */
void reverse(char s[]) {
    int c;

    for(int i = 0, j = strlen(s) - 1; i < j; i++, j--) {
        c = s[i];
        s[i] = s[j];
        s[j] = c;
    }
}


/*
output:

*/