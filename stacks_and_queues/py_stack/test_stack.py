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
    pass

def testPeek():
    pass

def testPop():
    pass

if __name__ == "__main__":
    testPush()
    testEmpty()
    testPeek()
    testPop()

