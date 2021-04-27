/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

/**
 * 将数字n转换为字符串并保存到s中
 */
void itoa(int n, char s[]) {
    int i, sign;

    if((sign = n) < 0) {            // 记录符号
        n = -n;                     // 确保n为正
    }
    i = 0;
    do {
        s[i++] = n % 10 + '0';
    } while((n /= 10) > 0)
}
if(sing < 0) {
    s[i++] = '-';
}
s[i] = '\0';
reverse(s);


/*
output:

*/