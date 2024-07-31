def truncatable(n):
    return 0



print(truncatable(9137))
# "left"
# Because 9137, 137, 37 and 7 are all prime.
"""
print(truncatable(5939))
# "right"
# Because 5939, 593, 59 and 5 are all prime.

print(truncatable(317))
# "both"
# Because 317, 17 and 7 are all prime and 317, 31 and 3 are all prime.

print(truncatable(5))
# "both"
# The trivial case of single-digit primes is treated as truncatable from both directions.

print(truncatable(139))
# False
# 1 and 9 are non-prime, so 139 cannot be truncatable from either direction.

print(truncatable(103))
# False
# Because it contains a 0 digit (even though 103 and 3 are primes).
"""