import math

m = int(input())
den = [1, 3, 4]
miCoins = [0] + [math.inf]*m

for i in range(1, m+1):
    for j in den:
        if i>=j:
            coins = miCoins[i-j]+1
            if coins < miCoins[i]:
                miCoins[i] = coins

print(miCoins[m])