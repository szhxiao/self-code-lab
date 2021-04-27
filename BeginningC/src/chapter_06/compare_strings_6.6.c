/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 6.6
 * Comparing strings
 */

#define _STDC_WANT_LIB_EXT1_ 1
#include <stdio.h>
#include <string.h>

#define MAX_LENGTH 21  // Maximum char array length

int main(void) {
    char word1[MAX_LENGTH];  // Stores the first word
    char word2[MAX_LENGTH];  // Stores the second word

    printf("Type in the first word (maximum %d characters): ", MAX_LENGTH - 1);
    // Read the first word
    int retval = scanf("%s", word1, sizeof(word1));
    if (EOF == retval) {
        printf("Error reading the word.\n");
        return 1;
    }

    printf("Type in the second word (maximum %d characters): ", MAX_LENGTH - 1);
    // Read the second word
    retval = scanf("%s", word2, sizeof(word2));
    if (EOF == retval) {
        printf("Error reading the word.\n");
        return 2;
    }

    // Compare the words
    if (strcmp(word1, word2) == 0) {
        printf("You have entered identical words");
    } else {
        printf("%s precedes %s\n", (strcmp(word1, word2) < 0) ? word1 : word2,
               (strcmp(word1, word2) < 0) ? word2 : word1);
    }

    return 0;
}

/*
output:
Type in the first word (maximum 20 characters): Eve
Type in the second word (maximum 20 characters): Adam
Adam precedes Eve
*/