/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

/**
 * 删除字符串尾部的空格符、制表符与换行符
 */
int trim(char s[]) {
    for(int n = strlen(s) - 1; n >= 0; n--) {
        if(s[n] != ' ' && s[n] != '\t' && s[n] != '\n') {
            break;
        }
    }
    s[n+1] = '\0';
    return n;
}



/*
output:

*/