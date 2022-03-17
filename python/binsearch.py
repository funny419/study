def binsearch(S, x):
    low, high = 0, len(S)-1
    location = -1

    loop_count = 0
    while low <= high and location == -1:
        loop_count += 1
        mid = (low + high)//2

        if x == S[mid]:
            location = mid
        elif x < S[mid]:
            high = mid - 1
        else:
            low = mid + 1

    return (location, loop_count)
