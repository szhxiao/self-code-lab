/**
 * Begining C
 * 
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

#include <stdio.h>

/**
 * Program 2.7 Division with float values
 */
int main(void) {
    float plank_length = 10.0F;
    float piece_count = 4.0F;
    float piece_length = 0.0F;

    piece_length = plank_length / piece_count;
    printf("A plank %f feet long can be cut into %f pieces %f feet long.\n",
            plank_length, piece_count, piece_length);
    
    printf("A plank %.2f feet long can be cut into %.0f pieces %.2f feet long.\n",
            plank_length, piece_count, piece_length);

    return 0;
}

/*
output:
A plank 10.000000 feet long can be cut into 4.000000 pieces 2.500000 feet long.
A plank 10.00 feet long can be cut into 4 pieces 2.50 feet long.
*/