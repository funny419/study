def makeHeap(mylist, index, n):
    left = index*2
    right = index*2 + 1
    parent = index

    if left <= n and mylist[parent] > mylist[left]:
        parent = left

    if right <= n and mylist[parent] > mylist[right]:
        parent = right

    if parent != index:
        mylist[index], mylist[parent] = mylist[parent], mylist[index]

    return makeHeap(mylist, parent, n)


def heapSort(mylist):
    mylist = [0] + mylist

    for i in range(len(mylist), 0, -1):
        makeHeap(mylist, i, len(mylist))

    for i in range(len(mylist), 0, -1):
        mylist[i], mylist[1] = mylist[1], mylist[i]
        makeHeap(mylist, 1, i-1)
