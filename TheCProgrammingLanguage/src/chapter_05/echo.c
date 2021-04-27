/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

/**
 * 回显程序命令行参数
 */
main(int argc, char *argv[]) {
    // version: 1st
    for(int i = 1; i < argc; i++) {
        printf("%s%s", argv[i], (i < argc-1) ? " " : "");
    }
    printf("\n");

    return 0;
}


/*
output:

*/