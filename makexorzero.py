a=int(input())
for i in range(0,a):
    x=int(input())
    s=list(raw_input())
    b=s.count('1')
    if b%2==0:
        print x-b
    else:
        print b

