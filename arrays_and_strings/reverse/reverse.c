/*******************************************************************************
 *                                                                             *
 *  File:   reverse.c                                                          *
 *  Author: Allen Sanford (ras9841@rit.edu)                                    *
 *  Description:                                                               *
 *      Takes a ASCII string and reverses the order the character appear.      *
 *                                                                             *
 *******************************************************************************/

// Includes
#include <stdio.h>
#include <string.h>
#include "reverse.h"

char *reverse(char *word)   
{
    size_t length = strlen(word);
    if (length)
    {
        char temp[length+1];
        char *ptr = &word[length-1];
        for (size_t i=0; i<length+1; i++)
        {
            temp[i] = *(ptr--);
        }
        word = temp;
    }
    return word;
}

