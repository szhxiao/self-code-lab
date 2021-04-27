/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 8.3
 * Calculating an average using functions
 */

#include <stdio.h>

#define MAX_COUNT 50

/**
 * Calculating the sum of array elements
 *
 * @param x array elements
 * @param n the number of elements in array x
 * @return the sum of array elements
 */
double sum(double x[], size_t n) {
    double sum = 0.0;
    for (size_t i = 0; i < n; ++i) {
        sum += x[i];
    }

    return sum;
}

/**
 * Calculating the average of array elements
 *
 * @param x array elements
 * @param n the number of elements in array x
 * @return the average of elements
 */
double average(double x[], size_t n) {
    return sum(x, n) / n;
}

/**
 * To read in data items and store in data array
 *
 * @param data data items
 * @param max_count the maximum data items
 * @return the number of items stored
 */
size_t get_data(double* data, size_t max_count) {
    size_t nValues = 0;
    printf("How many values do you want to enter (Maximum %zd)? ", max_count);
    scanf("%zd", &nValues);

    if (nValues > max_count) {
        printf("Maximum count exceeded, %zd items will be read.", max_count);
        nValues = max_count;
    }

    for (size_t i = 0; i < nValues; ++i) {
        scanf("%lf", &data[i]);
    }

    return nValues;
}

int main(void) {
    double samples[MAX_COUNT] = {0.0};
    size_t sampleCount = get_data(samples, MAX_COUNT);
    double average_data = average(samples, sampleCount);
    printf("The average of the values you entered is: %.2lf\n", average_data);

    return 0;
}

/*
output:
How many values do you want to enter (Maximum 50)? 5
1.0 2.0 3.0 4.0 5.0
The average of the values you entered is: 3.00
*/