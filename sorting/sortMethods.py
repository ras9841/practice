def bubbleSort(lst):
    """
    Time complexity:    O(n^2)
    Space complexity:   O(1)
    """
    size = len(lst)
    for _ in range(size):
        swapping = True
        while swapping:
            for i in range(size-1):
                if lst[i] < lst[i+1]:
                    lst[i], lst[i+1] = lst[i+1], lst[i]
                else:
                    swapping = False
    return lst

def selectionSort(lst):
    """
    Time complexity:    O(n^2)
    Space complexity:   O(1)
    """
    size = len(lst)
    for i in range(size):
        max_val = lst[i]
        max_loc = i
        for j in range(i+1,size):
            if lst[j] > max_val:
                max_loc = j
                max_val = lst[j]
        lst[i], lst[max_loc] = max_val, lst[i]
    return lst

def mergeSort(lst):
    """
    Time complexity:    O(nlog(n))
    Space complexity:   Depends on type stored in list
    """
    if len(lst) < 2:
        return lst
    mid = int(len(lst)/2)
    left = mergeSort(lst[:mid])
    right = mergeSort(lst[mid:])
    return merge(left, right)

def merge(lst_a, lst_b):
    """
    Helper function for mergeSort. Contains the merging logic.
    """
    merged = []

    size_a = len(lst_a)
    size_b = len(lst_b)
    
    a = b = 0
    while a < size_a and b < size_b:
        if lst_a[a] > lst_b[b]:
            merged.append(lst_a[a])
            a += 1
        else:
            merged.append(lst_b[b])
            b += 1

    while a < size_a:
        merged.append(lst_a[a])
        a += 1
    while b < size_b:
        merged.append(lst_b[b])
        b += 1

    return merged

def quickSort(lst):
    """
    Time complexity:    O(nlog(n)) av, O(n^2) worst
    Space complexity:   O(log(n))
    Note: like mergeSort in the average case, but spacially constant.
    """
    if len(lst) < 2:
        return lst

    pivot = lst[-1]
    # Partitioning
    q = 0
    for i in range(len(lst)-1):
        if lst[i] <= pivot:
            lst[i], lst[q] = lst[q], lst[i]
            q += 1
    lst[-1], lst[q] = lst[q], pivot
  
  left  = lst[:q]
    right = lst[q+1:]

    return quickSort(left) + [pivot] +  quickSort(right)


