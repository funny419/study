def selectionSort(mylist):
    for i in range(len(mylist)-1):
        minIdx = i
        for j in range(i+1, len(mylist)-1):
            if mylist[j] < mylist[minIdx]:
                minIdx = j
        temp = mylist[minIdx]
        mylist[minIdx] = mylist[i]
        mylist[i] = temp

    return mylist
