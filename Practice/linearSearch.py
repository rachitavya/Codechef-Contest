import numpy as np

def search(arr,n,num):
    for i in range(n):
        if(arr[i]==num):
            return i
    return 0

n=int(input("Input size of array - "))
arr=np.array([]).astype(int)
print('Input '+str(n)+' elements:')
for i in range(n):
    arr=np.append(arr,int(input()))
num=int(input('Input an element to search: '))
x=search(arr,n,num)
if x:
    print('Found at position '+str(x+1))
else: 
    print('Not found')
