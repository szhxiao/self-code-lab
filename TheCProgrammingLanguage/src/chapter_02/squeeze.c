/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

void squeeze(char s[], int c);

int main() {

    char str[] = "hello";
    squeeze(str, 'l');
    printf("%s\n", str);

    return 0;
}

/**
 * squeeze()
 * 从字符串s中删除字符c
 */
void squeeze(char s[], int c) {
    int i, j;

    for(i = j = 0; s[i] != '\0'; i++) {
        if(s[i] != c) {
            s[j++] = s[i];
        }
    }
    s[j] = '\0';
}

/*
output:
heo
*/