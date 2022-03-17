def mergeSort(mylist):
    if len(mylist) <= 1:
        return mylist

    mid = len(mylist)//2
    left = mylist[:mid]
    right = mylist[mid:]

    L = mergeSort(left)
    R = mergeSort(right)

    i = j = 0
    result = []
    while i < len(L) and j < len(R):
        if L[i] < R[j]:
            result.append(L[i])
            i += 1
        else:
            result.append(R[j])
            j += 1

    result += L[i:]
    result += R[j:]

    return result
