import math

n = int(input())
nops = [0, 0] + [math.inf]*(n-1)
for i in range(2, n+1):
    t1, t2, t3 = [math.inf]*3
    t1 = nops[i-1] + 1
    if i%2 == 0: t2 = nops[i//2] + 1
    if i%3 == 0: t3 = nops[i//3] + 1
    min_ops = min(t1, t2, t3)
    nops[i] = min_ops

print(nops[n])

ns = [n]
while n!=1:
    if n%3 ==0 and nops[n]-1 == nops[n//3]:
        ns += [n//3]
        n = n//3
    elif n%2 ==0 and nops[n]-1 == nops[n//2]:
        ns += [n//2]
        n = n//2
    else:
        ns += [n-1]
        n = n - 1

print(' '.join([str(i) for i in ns][::-1]))