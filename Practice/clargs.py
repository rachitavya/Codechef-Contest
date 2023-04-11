# To write a program that takes command line as argument and print sum of those arguments

import sys
print(sys.argv)
print(len(sys.argv))
sum=0
for i in range(1,len(sys.argv)):
    sum+=int(sys.argv[i])
print('sum =',sum)