"""
File:   py_stack.py
Author: Allen Sanford (ras9841@rit.edu)
Lang:   Python 3.5
"""
class Stack:
    """
    Outlines the structure of an array-based stack.
    """
    def __init__(self):
        """
        Constructor that initializes an empty stack.
        """
        self.stack = []
        self.size = 0
    
    def __str__(self):
        """
        Returns a space-seperated string of the stack conents.
        | -> top, [ -> bottom
        """
        return "["+" ".join((str(x) for x in self.stack))+"|"
    
    def peek(self):
        """
        Returns the top element in the stack.
        """
        return None if self.size == 0 else self.stack[-1]
    
    def pop(self):
        """
        Returns and removes the top element in the stack.
        """
        if self.size == 0:
            return None
        top = self.stack[-1]
        self.stack = self.stack[:-1] # removes top
        return top
    
    def push(self, a):
        """
        Adds an element to the top of the stack.
        """
        self.stack.append(a)
        self.size += 1
    
    def isEmpty(self):
        """
        Is this stack empty?
        """
        return True if self.size == 0 else False
        
