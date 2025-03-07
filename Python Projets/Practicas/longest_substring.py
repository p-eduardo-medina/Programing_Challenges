def longest_substring(digits):
    saveList = []
    for i in range(len(digits)):
        sList = []
        num = int(digits[i])
        sList.append(num)
        Flag = True
        while Flag:            
            if i<len(digits)-1:
                subNum = int(digits[i+1])
                if (num+subNum)%2!=0:
                    sList.append(subNum)     
                    num = subNum
                else:
                    Flag = False                                   
            else:
                Flag = False
            i+=1
        if len(saveList)<len(sList):
            saveList = sList
    string_list = "".join(str(element) for element in saveList)
    return string_list
            

u = longest_substring("225424272163254474441338664823")
target = "272163254"
print(f'El target es {target} y el resultado es {u}')
# substrings = 254, 272163254, 474, 41, 38, 23

u = longest_substring("594127169973391692147228678476")
target = "16921472"
print(f'El target es {target} y el resultado es {u}')
# substrings = 94127, 169, 16921472, 678, 476

u = longest_substring("721449827599186159274227324466") 
target = "7214"
print(f'El target es {target} y el resultado es {u}')
# substrings = 7214, 498, 27, 18, 61, 9274, 27, 32
# 7214 and 9274 have same length, but 7214 occurs first.
