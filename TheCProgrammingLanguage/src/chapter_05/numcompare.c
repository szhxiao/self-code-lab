/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdlib.h>

/**
 * 按数值顺序比较字符串s1和s2
 */
int numcompare(char *s1, char *s2) {
    double v1, v2;

    v1 = atof(s1);
    v2 = atof(s2);
    if(v1 < v2) {
        return -1;
    } else if(v1 > v2) {
        return 1;
    } else {
        return 0;
    }
}


/*
output:

*/