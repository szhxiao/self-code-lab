/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

#include <stdio.h>

/**
 * Program 3.2
 * Using if statements to decide on a discount
 */
int main(void) {
    const double unit_price = 3.50;
    int quantity = 0;

    printf("Enter the number that you want to buy: ");
    scanf(" %d", &quantity);

    // Test for order quantity qualifying for a discount
    double total = 0.0;   // Total price
    if (quantity > 10) {  // 5% discount
        total = quantity * unit_price * 0.95;
    } else {  // No discount
        total = quantity * unit_price;
    }

    printf("The price for %d is $%.2f\n", quantity, total);

    return 0;
}

/*
output:
Enter the number that you want to buy: 20
The price for 20 is $66.50

Enter the number that you want to buy: 8
The price for 8 is $28.00
*/