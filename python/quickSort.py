def quickSort(mylist):
    if len(mylist) <= 1:
        return mylist

    pivot = mylist[len(mylist) // 2]
    left, equal, right = [], [], []

    for num in mylist:
        if num < pivot:
            left.append(num)
        elif num > pivot:
            right.append(num)
        else:
            equal.append(num)

    return quickSort(left) + equal + quickSort(right)
