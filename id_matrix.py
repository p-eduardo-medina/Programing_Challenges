def decodeHuff0(s):
    if not isinstance(s, str):
        return 'INPUT_ERROR'
    A = '1'
    B = '00'
    C = '01'
    decode=''
    while s!='':
        ss,ex = '',0
        for i in range(len(s)):
            ss+=s[i]
            if ss==A:
                decode+='A'
                s = s[i+1:]                
                break
            elif ss==B:
                decode+='B'
                s = s[i+1:]
                break
            elif ss==C:
                decode+='C'
                s = s[i+1:]
                break
    print(decode)
    
#decodeHuff0("1001011")

def decodeHuff(s):
    #Preguntar si es un string
    if not isinstance(s, str):
        return 'INPUT_ERROR'    
    s = s.lower()
    
    #Ordenar el diccionario en función de las instrucciones
    
    diccString = {}
    for substring in s:
        if substring in diccString.keys():
            diccString[substring]+=1
        else:
            diccString[substring]=1
    diccString = dict(sorted(diccString.items(), key=lambda key_val: key_val[1]))
    diccString = dict(reversed(list(diccString.items())))
    
    auxDict = {}
    for keys,values in diccString.items():
        if values in auxDict.keys():
            auxDict[values].append(keys)
        else:
            auxDict[values]=[keys]
    OrderedDictionary = {}    
    for key in auxDict:
        suborder = {}
        for value in auxDict[key]:
            suborder[value] = s.find(value)
        suborder = dict(sorted(suborder.items(), key=lambda key_val: key_val[1]))
        for newKey in suborder:
            OrderedDictionary[newKey] = diccString[newKey]
    print(OrderedDictionary)
    
    #Crear el codifcador
    
    
decodeHuff("ABRACADABRA")