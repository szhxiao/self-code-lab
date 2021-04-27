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

/**
 * 通过x, y坐标构造一个点
 */
struct point makepoint(int x, int y) {
    struct point temp;

    temp.x = x;
    temp.y = y;

    return temp;
}

/**
 * 将两个点相加
 */
struct point addpoint(struct point p1, struct point p2) {
    p1.x += p2.x;
    p1.y += p2.y;

    return p1;
}


struct rect {
    struct point pt1;
    struct point pt2;
};

/**
 * 如果点p在矩形r内，则返回1，否则返回0
 */
int ptinrect(struct point p, struct rect r) {
    return p.x >= r.pt1.x && p.x < r.pt2.x
            && p.y >= r.pt1.y && p.y < r.pt2.y;
}

int main() {
    struct rect screen;
    struct point middle, *pp;

    pp = &middle;

    screen.pt1 = makepoint(0, 0);
    screen.pt2 = makepoint(6, 4);
    middle = makepoint((screen.pt1.x + screen.pt2.x) / 2,
                       (screen.pt1.y + screen.pt2.y) / 2);
    printf("the middle point of (%d, %d) and (%d, %d) is (%d, %d)\n",
            screen.pt1.x, screen.pt1.y, screen.pt2.x, screen.pt2.y, pp->x, pp->y);

    return 0;
}

/*
output:
the middle point of (0, 0) and (6, 4) is (3, 2)
*/