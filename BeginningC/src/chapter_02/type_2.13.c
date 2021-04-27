/**
 * Begining C
 * 
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

#include <stdio.h>

/**
 * Program 2.13 Choosing the correct type for the job 1
 */
int main(void) {
    const float Revenue_Per_150 = 4.5F;
    short JanSold = 23500;
    short FebSold = 19300;
    short MarSold = 21600;
    float RevQuarter = 0.0F;

    // calculate quarterly total
    short QuarterSold = JanSold + FebSold + MarSold;

    // output monthly sales and total for the quarter
    printf("Stock sold in\nJan: %d\nFeb: %d\nMar: %d\n", JanSold, FebSold, MarSold);
    printf("Total stock sold in first quarter: %d\n", QuarterSold);

    // calculate the total revenue for the quarter and output it
    RevQuarter = QuarterSold / 150 * Revenue_Per_150;
    printf("Sales revenue this quarter is: $%.2f\n", RevQuarter);

    return 0;
}

/*
output:
Stock sold in
Jan: 23500
Feb: 19300
Mar: 21600
Total stock sold in first quarter: -1136
Sales revenue this quarter is: $-31.50
*/