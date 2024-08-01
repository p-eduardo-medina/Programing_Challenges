def truncatable(n):
    ns = str(n)
    for i in ns:
        if i=='0':
            print('false')
            return 0
    Flag = []
    Flag.append(LeftTruncatable(n))
    Flag.append(RightTruncatable(n))
    if Flag[0] and Flag[1]:
        print('both')
    else:
        if Flag[0]:
            print('left')
        elif Flag[1]:
            print('right')
        else:
            print('false')        
    return 0

def LeftTruncatable(n):
    sn = str(n)
    for i in range(len(sn)):
        num = int(sn[i:])
        factors = prime_factors(num)
        if len(factors)!=1:return False
    return True

def RightTruncatable(n):
    sn = str(n)
    for i in range(len(sn)-1,-1,-1):
        num = int(sn[0:i+1])
        factors = prime_factors(num)
        if len(factors)!=1:return False
    return True
    
    

def prime_factors(n):
    i = 2
    factors = {}
    while i * i <= n:
        if n % i:
            i += 1
        else:
            n //= i
            if i in factors.keys():
                factors[i] += 1
            else:
                factors[i] = 1
    if n > 1:
        if n in factors.keys():
            factors[n] +=1 
        else:
            factors[n] = 1
    return factors


truncatable(9137)
# "left"
# Because 9137, 137, 37 and 7 are all prime.

truncatable(5939)
# "right"
# Because 5939, 593, 59 and 5 are all prime.

truncatable(317)
# "both"
# Because 317, 17 and 7 are all prime and 317, 31 and 3 are all prime.

truncatable(5)
# "both"
# The trivial case of single-digit primes is treated as truncatable from both directions.

truncatable(139)
# False
# 1 and 9 are non-prime, so 139 cannot be truncatable from either direction.

truncatable(103)
# False
# Because it contains a 0 digit (even though 103 and 3 are primes).
