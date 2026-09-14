def binarySearch(arr,x):
    low = 0
    high = len(arr) - 1
    while(low <= high):
        mid = (low + high) // 2
        if (arr[mid] == x):
            return mid
        elif (arr[mid] < x):
            low = mid + 1
        else:
            high = mid -1
    return -1
arr = [0,1,2,3,4,5,6,7,8,9,10]
cantim = 7

print(binarySearch(arr, cantim))