def fibo(n):
    a=[0,1]  #initializing with 0 and 1
    for i in range(2,n+1):
        a.append(a[i-1]+a[i-2])
    return a[n]
n=int(input())
print(fibo(n))