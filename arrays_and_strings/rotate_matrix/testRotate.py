from rotate import rotate90

def main():
    # n = 0
    assert rotate90([],0) == []

    # n = 1
    assert rotate90([1],1) == [1]

    # n = 2
    assert rotate90([[1,2],[3,4]],2) == [[3,1],[4,2]]


main()
