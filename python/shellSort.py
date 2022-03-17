def gapInsertionSort(mylist, start, gap):
    for i in range(start+gap, len(mylist), gap):
        nowval = mylist[i]
        index = i

    while index >= gap and mylist[index-gap] > nowval:
        mylist[index] = mylist[index-gap]
        index = index - gap

    mylist[index] = nowval


def shellSort(mylist):
    sublistcount = len(mylist) // 2
    while sublistcount > 0:
        for start in range(sublistcount):
            gapInsertionSort(mylist, start, sublistcount)
        sublistcount = sublistcount / 2
