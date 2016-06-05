"""
File:       unique_chars.py
Author:	    Allen Sanford (ras9841@rit.edu)
Language:   Python 3.5
Description:
    Determines if a string has all unique characters.
"""

import time

def dict_method(string):
    chars = {}
    for s in string:
        if s not in chars.keys():
            chars[s] = None
        else:
            print("Some characters are repeated.")
            break
    else:
        print("All characters are unique.")

def array_method(string):
    check = [0 for _ in range(0,256)]
    for s in string:
        if check[ord(s)] == 0:
            check[ord(s)] = 1
        else:
            print("Some characters are repeated.")
            break
    else:
        print("All characters are unique.")

def time_method(foo, string):
    start = time.time()
    foo(string)
    print(time.time()-start)

def main():
    string = str(input("Please input a string >> "))
    if len(string) > 256:
        print("Some characters are repeated.")
    else:
        print("Dictionary Method (Hash Map)")
        time_method(dict_method, string)
        print("Array Method")
        time_method(array_method, string)

if __name__ == "__main__":
    main()
