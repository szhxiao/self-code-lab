/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>
#include <math.h>

struct point {
    int x;
    int y;
};

int main() {
    struct point pt = {3, 4};
    double dist;

    dist = sqrt((double)pt.x * pt.x + (double)pt.y * pt.y);

    printf("%d, %d\n", pt.x, pt.y);
    printf("the distance is %.2f", dist);

    return 0;
}

/*
output:
3, 4
the distance is 5.00
*/