/**
 * Begining C
 * 
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

#include <stdio.h>

/**
 * Program 2.5 Calculations with cookies
 */
int main(void) {
    int cookies = 5;
    int cookie_calories = 125;               // Calories per cookie
    int total_eaten = 0;

    int eaten = 2;
    cookies = cookies - eaten;
    total_eaten = total_eaten + eaten;
    printf("\nI have eaten %d cookies. There are %d cookies left", eaten, cookies);

    eaten = 3;
    cookies = cookies - eaten;
    total_eaten = total_eaten + eaten;
    printf("\nI have eaten %d more. Now there are %d cookies left\n", eaten, cookies);
    printf("\nTotal energy consumed is %d calories.\n", total_eaten * cookie_calories);


    return 0;
}

/*
output:

I have eaten 2 cookies. There are 3 cookies left
I have eaten 3 more. Now there are 0 cookies left

Total energy consumed is 625 calories.
*/