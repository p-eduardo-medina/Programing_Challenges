# SETS
"""
#myset = {1,2,3,4,5,6}
#myset = set('hello')ç
myset = set()

myset.add(1)
myset.add(2)
myset.add(3)
#myset.remove(4)
#myset.discard(3)
#print(myset.pop()) #eLIMINA EL PRIMER VALOR DEL SET Y LO IMPRIME

for i in myset:
    print(i)

if 1 in myset: print('YES')
print(myset)

odds =  {1,3,5,7,9}
evens = {2,4,6,8,0}
primes ={2,3,5,7}
union = odds.union(evens)
print(union)

intersection = odds.intersection(primes)
print(intersection)

setA = {1,2,3,4,5,6,7,8,9}
SetB = {1,2,3,10,11,12}

diffA_B = setA.difference(SetB)
print(f'Elements in A but not in B: {diffA_B}')

diffA_B = SetB.difference(setA)
print(f'Elements in B but not in A: {diffA_B}')

symetric = setA.symmetric_difference(SetB)

print(f'The sumetric diferences between A & B \n A U B - A I B: {symetric}')
setA.intersection_update(SetB)
print(f'Intersection Update of SetA: {setA}')
print(f'Is A Subset OF B: {setA.issubset(SetB)}')
print(f'Is A superset og B : {setA.issuperset(SetB)}')
"""


setA = {1,2,3,4,5,6}
#setB = set(setA) #It doesn't point the same space in memory that A
setB = {1,2,3}
setC = {0}


a = frozenset([1,2,3,4,5]) #No se puede cambiar
a.add(2)
print(a)