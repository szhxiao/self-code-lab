/**
 * Begining C
 * 
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

#include <stdio.h>

/**
 * Program 2.6 Cookies and kids
 */
int main() {
    int cookies = 45;                           // number of cookies in the jar
    int children = 7;                           // number of children
    int cookies_per_child = 0;                  // number of cookies per child
    int cookies_left_over = 0;                  // number of cookies left over

    // calculate how many cookies each child gets when they are divided up
    cookies_per_child = cookies / children;
    printf("You have %d children and %d cookies\n", children, cookies);
    printf("Give each child %d cookies.\n", cookies_per_child);

    // calculate how many cookies are left over
    cookies_left_over = cookies % children;
    printf("There are %d cookies left over.\n", cookies_left_over);

    return 0;
}

/*
output:
You have 7 children and 45 cookies
Give each child 6 cookies.
There are 3 cookies left over.
*/