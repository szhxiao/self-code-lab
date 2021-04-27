/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 11.7
 * Sorting integers using a binary tree
 */

#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>

typedef struct BiTNode BiTNode;

// Struct type definition
struct BiTNode {
    long item;        // The data item
    int count;        // Number of copies of item
    BiTNode* pleft;   // Pointer to left node
    BiTNode* pright;  // Pointer to right node
};

// Function prototypes
BiTNode* create_node(long value);               // Create a tree node
BiTNode* add_node(long value, BiTNode* pnode);  // Insert a new node
void list_nodes(BiTNode* pnode);                // List all nodes
void free_nodes(BiTNode* pnode);                // Release memory

int main(void) {
    long newvalue = 0;
    BiTNode* proot = NULL;
    char answer = 'n';

    do {
        printf("Enter the node value: ");
        scanf(" %ld", &newvalue);
        if (!proot) {
            proot = create_node(newvalue);
        } else {
            add_node(newvalue, proot);
        }

        printf("Do you want to enter another (y or n)? ");
        scanf(" %c", &answer, sizeof(answer));
    } while (tolower(answer) == 'y');

    printf("The value in ascending sequence are:\n");
    list_nodes(proot);
    free_nodes(proot);

    return 0;
}

/**
 * Create a binary tree node
 *
 * @param value node value
 * @return binary tree node
 */
BiTNode* create_node(long value) {
    BiTNode* pnode = (BiTNode*)malloc(sizeof(BiTNode));
    pnode->item = value;   // Set the value
    pnode->count = 1;      // Set the count
    pnode->pleft = NULL;   // No left nodes
    pnode->pright = NULL;  // No right nodes
    return pnode;
}

/**
 * Add a new node to the tree
 *
 * @param value node value
 * @param pnode the pointer of binary tree node
 * @return binary tree node
 */
BiTNode* add_node(long value, BiTNode* pnode) {
    // If there's no node
    if (!pnode) {
        return create_node(value);
    }

    // Value equals current node, increment count and return the same node
    if (value == pnode->item) {
        ++pnode->count;
        return pnode;
    }

    // Value less than curent node, create a left node and return it
    if (value < pnode->item) {
        if (!pnode->pleft) {
            pnode->pleft = create_node(value);
            return pnode->pleft;
        } else {
            return add_node(value, pnode->pleft);
        }
    } else {
        if (!pnode->pright) {
            pnode->pright = create_node(value);
            return pnode->pright;
        } else {
            return add_node(value, pnode->pright);
        }
    }
}

/**
 * List the node values in ascending sequence
 *
 * @param pnode the binary tree node
 */
void list_nodes(BiTNode* pnode) {
    if (pnode->pleft) {
        list_nodes(pnode->pleft);
    }

    printf("%10d x %10ld\n", pnode->count, pnode->item);

    if (pnode->pright) {
        list_nodes(pnode->pright);
    }
}

/**
 * Release memory allocated to nodes
 *
 * @param pnode the binary tree node
 */
void free_nodes(BiTNode* pnode) {
    // If there's no node
    if (!pnode) {
        return;
    }

    // If there's a left sub-tree
    if (pnode->pleft) {
        free_nodes(pnode->pleft);
    }

    // If there's a right sub-tree
    if (pnode->pright) {
        free_nodes(pnode->pright);
    }

    // Free current node memory
    free(pnode);
}

/*
output:
Enter the node value: 56
Do you want to enter another (y or n)? y
Enter the node value: 33
Do you want to enter another (y or n)? y
Enter the node value: 77
Do you want to enter another (y or n)? y
Enter the node value: -10
Do you want to enter another (y or n)? y
Enter the node value: -5
Do you want to enter another (y or n)? y
Enter the node value: 200
Do you want to enter another (y or n)? y
Enter the node value: -10
Do you want to enter another (y or n)? n
The value in ascending sequence are:
         2 x        -10
         1 x         -5
         1 x         33
         1 x         56
         1 x         77
         1 x        200
*/