def Auxfarey(n):
    dicFarey = {}
    if n == 1:
        return {'0/1':0,'1/1':1}
    else:
        dicFarey = Auxfarey(n-1)
        auxDic = {}
        for i in range(n-1):
            if not ((i+1)/n in dicFarey.values()):
             auxDic[str(i+1)+'/'+str(n)] = (i+1)/n
        ListValues = list(dicFarey.values()) + list(auxDic.values())
        ListValues.sort()
        dicFarey.update(auxDic)
        NewDict = {}
        for i in ListValues:
            NewDict[list(dicFarey.keys())[list(dicFarey.values()).index(i)]] = i
        return NewDict

def farey(n):
    return list(Auxfarey(n).keys())
n = 10
print(farey(n))