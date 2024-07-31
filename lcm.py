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
            factors[n] += 1
        else:
            factors[n] = 1
    return factors
def lcm(nums):
    dictPrimes = {1:1}
    for i in nums:
        smalDict = prime_factors(i)
        for key,value in smalDict.items():
            if key in dictPrimes.keys():
                if value > dictPrimes[key]:dictPrimes[key] = value
            else:dictPrimes[key] = value
    sum = 1
    for k,v in dictPrimes.items():
        sum *= k**v             
    return sum
        
    
print(lcm([1, 2, 3, 4, 5, 6, 7, 8, 9]))
#2520

print(lcm([5]))
#5

print(lcm([5, 7, 11]))
#385

print(lcm([5, 7, 11, 35, 55, 77]))
#385
