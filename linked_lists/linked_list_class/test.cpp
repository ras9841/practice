/**
 *  File: test.cpp
 *  Author: Allen Sanford (ras9841@rit.edu)
 *  Description: 
 *      Simple test file that validates the functionality of the LinkedList 
 *      class defined in "linkedlist.h".
 *  Date Created: 08/03/16
 */

#define IOSTREAM_H
#include <iostream>
#include "linkedlist.h"

int main() 
{
    LinkedList<int> lst;

    for (size_t i=5; i<11; ++i) lst.append(i);

    std::cout << lst.getHead() << "\n";
    lst.printList();

    return 0;
}
