"""
File:   stack_sort.py
Author: Allen Sanford (ras9841@rit.edu)
Lang:   Python 3.5
"""

# Imports
from py_stack import Stack

def stack_sort(lst):
    s1 = Stack()
    s2 = Stack()
    for s in lst:
        s1.push(s)
    while s1.peek() is not None:
        tmp = s1.pop()
        while s2.peek() is not None and s2.peek() > tmp:
            s1.push(s2.pop())
        s2.push(tmp)
    return s2

print(stack_sort([]))
print(stack_sort([1, 2, 3, 4]))
print(stack_sort([4, 3, 2, 1]))
