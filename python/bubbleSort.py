def bubbleSort(mylist):
    for i in range(len(mylist)-1, 0, -1):
        for j in range(i):
            if mylist[j] > mylist[j+1]:
                tmp = mylist[j]
                mylist[j] = mylist[j+1]
                mylist[j+1] = tmp
    return mylist
