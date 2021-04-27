/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 5.5
 * Using & operator to show array address
 */

#include <stdio.h>

int main(void) {
    int data[5];
    for (unsigned int i = 0; i < 5; ++i) {
        data[i] = 12 * (i + 1);
        printf("data[%d]  Address: %p  Contents: %d\n", i, &data[i], data[i]);
    }

    return 0;
}

/*
output:
data[0]  Address: 0x7fffddf3b650  Contents: 12
data[1]  Address: 0x7fffddf3b654  Contents: 24
data[2]  Address: 0x7fffddf3b658  Contents: 36
data[3]  Address: 0x7fffddf3b65c  Contents: 48
data[4]  Address: 0x7fffddf3b660  Contents: 60
*/