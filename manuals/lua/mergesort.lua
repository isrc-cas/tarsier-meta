function mergeSort(A, p, r)
    if p < r then
        local q = math.floor((p + r) / 2)
        mergeSort(A, p, q)
        mergeSort(A, q + 1, r)
        merge(A, p, q, r)
    end
end

function merge(A, p, q, r)
    local n1 = q - p + 1
    local n2 = r - q
    local left = {}
    local right = {}

    for i = 1, n1 do
        left[i] = A[p + i - 1]
    end
    for i = 1, n2 do
        right[i] = A[q + i]
    end

    left[n1 + 1] = math.huge
    right[n2 + 1] = math.huge

    local i = 1
    local j = 1

    for k = p, r do
        if left[i] <= right[j] then
            A[k] = left[i]
            i = i + 1
        else
            A[k] = right[j]
            j = j + 1
        end
    end
end

function printArray(A)
    for i = 1, #A do
        io.write(A[i] .. " ")
    end
    io.write("\n")
end

A = {11, 45, 14, 19, 19, 8, 10}

io.write("Original:\n")
printArray(A)
mergeSort(A, 1, #A)
io.write("Sorted:\n")
printArray(A)
