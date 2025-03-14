randomDict = {}
import random


for i in range(random.randint(0, 100)):
    randomDict[f'ELemento -> {i}'] = "{0:b}".format(i)
    
    
for i,(k,v) in enumerate(randomDict.items()):
    print(f'\n\nNumber  {i} in bits is: {randomDict[k]}')
    print(f'\t{i} is {v}')