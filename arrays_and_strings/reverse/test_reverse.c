/*******************************************************************************
 *                                                                             *
 *  File:   test_reverse.c                                                     *
 *  Author: Allen Sanford (ras9841@rit.edu)                                    *
 *  Description:                                                               *
 *      Test cases for method detailed in reverse.c                            *
 *                                                                             *
 ******************************************************************************/

// Includes
#include <stdio.h>
#include "reverse.h"

int main()   
{
    char *w1 = "Hello!";
    printf("Word 1: %s", w1);
    reverse(w1);
    return 0;
}
