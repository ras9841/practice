"""
File:   test_stack.py
Author: Allen Sanford (ras9841@rit.edu)
Lang:   Python 3.5
"""

from py_stack import Stack

def testPush():
    s = Stack()
    assert str(s) == "[|"
    s.push(1)
    assert str(s) == "[1|"
    s.push(2)
    s.push(3)
    assert str(s) == "[1 2 3|"

def testEmpty():
    s = Stack() 
    assert s.isEmpty()
    s.push(1)
    assert not s.isEmpty()

def testPeek():
    s = Stack()
    assert s.peek() == None
    for i in range(1,6): 
        s.push(i)
    assert s.peek() == 5

def testPop():
    s = Stack()
    assert s.pop() == None
    for i in range(1,4):
        s.push(i)
    assert s.pop() == 3
    assert s.pop() == 2
    assert s.pop() == 1
    assert s.isEmpty()

if __name__ == "__main__":
    testPush()
    testEmpty()
    testPeek()
    testPop()
