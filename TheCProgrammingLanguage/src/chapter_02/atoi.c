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
    char str[] = "hello";

    int num = atoi(str);
    printf("%d\n", num);

    return 0;
}

/**
 * 将字符串s转换为相应的整型数
 */
int atoi(char s[]) {
    int n = 0;

    for(int i = 0; s[i] >= '0' && s[i] <= '9'; i++) {
        n = 10 * n + (s[i] - '0');
    }

    return n;
}


/*
output:

*/