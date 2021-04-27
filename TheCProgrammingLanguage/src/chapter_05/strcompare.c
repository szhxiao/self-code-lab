/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

int strcompare(char *s, char *t);

int main() {

    return 0;
}

/**
 * 根据s按照字典顺序小于、等于或大于t的结果分别返回负整数、0或正整数
 */
int strcompare(char *s, char *t) {

    /**
     * version: 1st
     * 使用数组下标实现
     */
    int i;

    for(i = 0; s[i] == t[i]; i++) {
        if(s[i] == '\0') {
            return 0;
        }
    }
    return s[i] - t[i];

    /**
     * version: 2nd
     * 使用指针方式实现
     */
    for( ; *s == *t; s++, t++) {
        if(*s == '\0') {
            return 0;
        }
    }
    return *s - *t;

}

/*
output:

*/