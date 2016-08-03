/**
 *  File: test.cpp
 *  Author: Allen Sanford (ras9841@rit.edu)
 *  Description: 
 *      Simple test file that validates the functionality of the Node class
 *      defined in "node.h". The Node class can be used as a linked list.
 *  Date Created: 08/03/16
 */

#include <iostream>
#include "node.h"

int main() 
{
    Node<int> n1 (1);
    Node<char> n2 ('c');

    std::cout << n1.getData() << "\n";
    std::cout << n2.getData() << "\n";
    
    return 0;
}
