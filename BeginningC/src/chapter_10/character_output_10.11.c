/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 10.11
 * Outputting character data
 */

#include <ctype.h>
#include <limits.h>
#include <stdio.h>

int main(void) {
    int count = 0;

    printf("The printable characters are the following:\n");

    // Iterate over all values of type char
    for (int code = 0; code <= CHAR_MAX; ++code) {
        char ch = (char)code;
        if (isprint(ch)) {
            if (count++ % 32 == 0) {
                printf("\n");
            }
            printf(" %c", ch);
        }
    }
    printf("\n");

    return 0;
}

/*
output:
The printable characters are the following:

   ! " # $ % & ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ; < = > ?
 @ A B C D E F G H I J K L M N O P Q R S T U V W X Y Z [ \ ] ^ _
 ` a b c d e f g h i j k l m n o p q r s t u v w x y z { | } ~
*/