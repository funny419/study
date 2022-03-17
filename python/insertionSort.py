def insertionSort(mylist):
    for i in range(1, len(mylist)):
        index = i
        while index > 0 and mylist[index-1] > mylist[i]:
            mylist[index] = mylist[index-1]
            index -= 1
    mylist[index] = mylist[i]

    return mylist
