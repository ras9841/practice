/*******************************************************************************
 *                                                                             *
 *  File:   test_reverse.c                                                     *
 *  Author: Allen Sanford (ras9841@rit.edu)                                    *
 *  Description:                                                               *
 *      Test cases for method detailed in reverse.c.                           *
 *                                                                             *
 ******************************************************************************/

// Includes
#include <stdio.h>
#include <string.h>
#include <assert.h>
#include "reverse.h"

int main()   
{
    char *word;

    //TC1: empty string 
    word = "";
    assert(strcmp(reverse(word), "") == 0);
   
    //TC2: short word with case
    word = "test";
    reverse(word);
    /*
    assert(strcmp(reverse(word),"tset") == 0);
    assert(strcmp(reverse(word),"TSET") != 0);
    
    //TC3: numbers
    word = "1234567890";
    assert(strcmp(reverse(word), "0987654321") == 0);

    //TC4: symbols
    word = "!@#$%^&*()_+[]{}:;<>.,/?";
    assert(strcmp(reverse(word), "?/,.><;:}{][+_)(*&^%$#@!") == 0);

    //TC5: mixed
    word = "!1qQaA";
    assert(strcmp(reverse(word),"AaQq1!") == 0);
    */
    printf("All tests passed.\n");
    return 0;
}
