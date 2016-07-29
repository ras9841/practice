def rotate90(matrix, n):
    """
    Rotates a NxN matrix 90 degrees about the center.
    """
    
    start = 0
    end = n
    while n > 2:
        top = matrix[start][start:end]
        // top <- left
        matrix[start][start:end] = matrix[start:end][start]
        // left <- bottom
        matrix[start:end][start] = matrix[end][start:end]
        // bottom <- right
        matrix[end][start:end] = matrix[start:end][end]
        // right <- top
        matrix[start:end][end] = top
        
        n -= 2
        start += 1
        end -= 1

    return matrix
