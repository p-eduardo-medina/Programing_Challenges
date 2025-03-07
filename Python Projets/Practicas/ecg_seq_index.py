def factors(n):    
    from functools import reduce
    return list(reduce(list.__add__, 
                ([i, n//i] for i in range(1, int(n**0.5) + 1) if n % i == 0)))
def ecg_seq_index(n):
    initList = [1,2]
    value = 4
    while not n in initList:          
        for i in range(1,value):
            if not i in initList:
                for j in initList:
                    iF,jF = factors(i),factors(j)
                    iF,jF = iF[1:],jF[1:]
                    if bool(set(iF) & set(jF)):
                        intersection = list(set(iF).intersection(jF))                          
                        if set(intersection).issubset(initList):
                            initList.append(i)
                        else: initList.append(intersection)
                        break
                                
        value += 1
        
                
                        
    return None

ecg_seq_index(3)