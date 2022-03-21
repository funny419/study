def mergeSort(numbers):
    n = len(numbers)
    
    if n <= 1:
        return

    mid = n // 2
    leftGroup = numbers[:mid]
    rightGroup = numbers[mid:]

    mergeSort(leftGroup)
    mergeSort(rightGroup)

    left = 0
    right = 0
    now = 0

    while left < len(leftGroup) and right < len(rightGroup):
        if leftGroup[left] < rightGroup[right]:
            numbers[now] = leftGroup[left]
            left += 1
        else:
            numbers[now] = rightGroup[right]
            right += 1

        now += 1

    while left < len(leftGroup):
        numbers[now] = leftGroup[left]
        left += 1
        now += 1
    
    while right < len(rightGroup):
        numbers[now] = rightGroup[right]
        right += 1
        now += 1

if __name__ == '__main__':
    numbers = [6,5,6,4,3,2,1]

    mergeSort(numbers)

    print(numbers)