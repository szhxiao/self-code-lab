/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 8.5
 * A function to increase your pay
 */

#include <stdio.h>

long* income_plus(long* p_pay);  // Prototype for increase pay function

int main(void) {
    long your_pay = 30000L;
    long* pold_pay = &your_pay;
    long* pnew_pay = NULL;
    pnew_pay = income_plus(pold_pay);
    printf("Old pay = $%ld\n", *pold_pay);
    printf("New Pay = $%ld\n", *pnew_pay);

    return 0;
}

long* income_plus(long* p_pay) {
    *p_pay += 10000L;
    return p_pay;
}

/*
output:
Old pay = $40000
New Pay = $40000
*/