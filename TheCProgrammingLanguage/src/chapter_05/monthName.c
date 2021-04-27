/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

char *month_name(int n);

int main() {
    printf("%s", month_name(9));

    return 0;
}

/**
 * 返回第n个月份的名字
 */
char *month_name(int n) {
    static char *name[] = {
        "Illegal month",
        "January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"
    };

    return (n < 1 || n > 12) ? name[0] : name[n];
}

/*
output:
September
*/