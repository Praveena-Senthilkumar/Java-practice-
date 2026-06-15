def rotate_array(arr, k):
    n = len(arr)
    k = k % n  
    return arr[-k:] + arr[:-k]


arr = [ ]
for i in range(10):
    num = int(input("Enter a number: "))
    arr.append(num)
k = 6
rotated_arr = rotate_array(arr, k)
print(rotated_arr)

