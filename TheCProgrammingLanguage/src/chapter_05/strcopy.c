/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

void strcopy(char *s, char *t);

int main() {
    

    return 0;
}

/**
 * 将指针t指向的字符串复制到指针s指向的位置
 */
void strcopy(char *s, char *t) {

    /**
     * version: 1st
     * 使用数组下标实现
     */
    int i;

    i = 0;
    while((s[i] = t[i]) != '\0') {
        i++;
    }

    /**
     * version: 2nd
     * 使用指针方式实现
     */
    while((*s = *t) != '\0') {
        s++;
        t++;
    }

}

/*
output:

*/