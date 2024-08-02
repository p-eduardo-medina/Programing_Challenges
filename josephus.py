import numpy as np

def josephus(people):
    p = np.ones(people, dtype = int) 
    flag, live,i= True, True, 0
    while flag:
        if i >= people: i = i%people
        if p[i] != 0:
            if  not live:p[i] = 0        
            live = not live        
        i+=1
        if sum(p)==1:
            flag = False
    for i in range(len(p)):
        if p[i]!=0:return i+1

print(f'El resultado es {josephus(100)}')
#19