def rotate90(matrix, n):
    """
    Rotates a NxN matrix 90 degrees about the center.
    """
    
    for layer in range(int(n/2)):
        start = layer
        end = n - 1 - layer
        for i in range(start, end):
            offset = i - start
            top = matrix[start][i]

            # top <- left
            matrix[start][i] = matrix[end-offset][start]

            # left <- bottom
            matrix[end-offset][start] = matrix[end][end-offset]

            # bottom <- right
            matrix[end][end-offset] = matrix[i][end]

            # right <- top
            matrix[i][end] = top

    return matrix
