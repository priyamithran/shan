a=int(raw_input())
for i in xrange (0,a):
    bal=0
    max_bal=0
    s=str(raw_input())
    for i in s:
        if(i=='('):
            bal+=1
        else:
            bal-=1
        max_bal=max(max_bal,bal)
    print "("*max_bal+")"*max_bal
