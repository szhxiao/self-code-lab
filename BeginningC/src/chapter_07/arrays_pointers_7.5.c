/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 7.5
 * Incrementing a pointer to an array
 */

#include <stdio.h>
#include <string.h>

int main(void) {
    char multiple[] = "a string";
    char* p = multiple;

    for (int i = 0; i < strnlen(multiple, sizeof(multiple)); ++i) {
        printf(
            "multiple[%d] = %c * (p+%d) = %c &multiple[%d] = %p p + %d = %p\n",
            i, multiple[i], i, *(p + i), i, &multiple[i], i, p + i);
    }

    return 0;
}

/*
output:
multiple[0] = a * (p+0) = a &multiple[0] = 0x7fff3a723dbf p + 0 = 0x7fff3a723dbf
multiple[1] =   * (p+1) =   &multiple[1] = 0x7fff3a723dc0 p + 1 = 0x7fff3a723dc0
multiple[2] = s * (p+2) = s &multiple[2] = 0x7fff3a723dc1 p + 2 = 0x7fff3a723dc1
multiple[3] = t * (p+3) = t &multiple[3] = 0x7fff3a723dc2 p + 3 = 0x7fff3a723dc2
multiple[4] = r * (p+4) = r &multiple[4] = 0x7fff3a723dc3 p + 4 = 0x7fff3a723dc3
multiple[5] = i * (p+5) = i &multiple[5] = 0x7fff3a723dc4 p + 5 = 0x7fff3a723dc4
multiple[6] = n * (p+6) = n &multiple[6] = 0x7fff3a723dc5 p + 6 = 0x7fff3a723dc5
multiple[7] = g * (p+7) = g &multiple[7] = 0x7fff3a723dc6 p + 7 = 0x7fff3a723dc6
*/