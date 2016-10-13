import math as m

class Node:
    def __init__(self, dat=None, left=None, right=None):
        self.data = dat
        self.left = left
        self.right = right
    def __str__(self):
        return "("+str(self.data)+")"

class LinkedQueue:
    def __init__(self):
        self.size = 0
        self.head = None
    def __str__(self):
        s = ''
        mark = self.head
        while mark is not None:
            s+= "->"+str(mark)
            mark = mark.right
        return s

    def add(self, val):
        self.size += 1
        if self.head is None:
            self.head = Node(val)
        else:
            mark = self.head
            while mark.right is not None:
                mark = mark.right
            mark.right = Node(val,mark)
    def remove(self):
        if self.head is None:
            return None
        else:
            top = self.head
            self.head = self.head.right
            return top

class BST:
    def __init__(self, compare= lambda x,y: x<=y):
        self.head = None
        self.size = 0
        self.compare = compare
    def __str__(self):
        if self.size == 0:
            return "(X)"
        # Tree depth
        depth = m.floor(m.log(self.size)/m.log(2))+1
        # Num nodes in full tree
        num_nodes = int(-(1-2**(depth+1)))

        

        s = "\n"
        marker = 1 #[1, 2^n]: used to place newlines
        n = 0
        for val in vals:
            if val is not None:
                s += "("+str(val.data)+")\t"
            else:
                s += "(X)\t"
            d = int(2**n)
            if marker == d:
                n += 1
                s += "\n"
                marker = 0
            marker += 1
        return s
    
    def infix(self, root):
        if root is None:
            return "(X)"
        return self.infix(root.left)+str(root)+self.infix(root.right)
    

    def add(self, val):
        self.size += 1
        nval = Node(val)
        if self.head is None:
            self.head = nval
        else:
            marker = self.head
            while True:
                if self.compare(val, marker.data): # go left
                    if marker.left is None:
                        marker.left = nval
                        break 
                    else:
                        marker = marker.left
                else: # go right
                    if marker.right is None:
                        marker.right = nval
                        break
                    else:
                        marker = marker.right
            print("In add", self.head.left)
