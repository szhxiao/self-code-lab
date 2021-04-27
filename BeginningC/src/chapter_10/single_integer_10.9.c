/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 10.9
 * Variations on a single integer
 */

#include <stdio.h>

int main(void) {
    int k = 678;

    // Display formats as heading then display the values
    printf("%%d\t%%o\t%%x\t%%X\n");
    printf("%d\t%o\t%x\t%X\n", k, k, k, k);
    printf("\n|%%8d\t|%%-8d\t|%%+8d\t|%%08d\t|%%-+8d\t|\n");
    printf("\n|%8d\t|%-8d\t|%+8d\t|%08d\t|%-+8d\t|\n", k, k, k, k, k);

    return 0;
}

/*
output:
%d      %o      %x      %X
678     1246    2a6     2A6

|%8d    |%-8d   |%+8d   |%08d   |%-+8d  |

|     678       |678            |    +678       |00000678       |+678 |
*/