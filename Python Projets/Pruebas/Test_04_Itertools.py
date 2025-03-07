#Iterations:

from itertools import permutations
a = [1,2,3]
perm = permutations(a,2)

#print(perm)
print(list(perm))

from itertools import combinations, combinations_with_replacement

a =[1,2,3,4]
comb = combinations(a,2)#SIN REPETICIONES
print(list(comb))
comb2 = combinations_with_replacement(a,2)
print(list(comb2))

from itertools import groupby  # :D :D

def smaller_3(x):
    return x<3
a = [1,2,3,4,5]
group_obj = groupby(a, key=smaller_3)


for key,value in group_obj:
    print(key,list(value))


persond = [{'name':'Tim','age':25},
           {'name':'Dan','age':25},
           {'name':'Lisa','age':22},
           {'name':'Clara','age':28}]

group_obj = groupby(persond, key = lambda x:x['age'])
for key,value in group_obj:
    print(key,list(value))