def analyseList(List, el, Deep, dict):
    for i in List:
        if type(i)==list:
            analyseList(i,el,Deep+1,dict)
        else:
            if i == el:
                if  Deep in dict.keys():dict[Deep] +=1
                else: dict[Deep] = 1   
            else: dict[Deep] = 0                    
    return dict

def freq_count(lst, el):
    dictLevels = {}
    dictLevels, ListLevels = analyseList(lst, el, 0, dictLevels), []     
    for k,v in dictLevels.items():
        ListLevels.append([k,v])
    return ListLevels

print(freq_count([1, [2], 1, [[2]], 1, [[[2]]], 1, [[[[2]]]]], 2))
#[[0, 0], [1, 1], [2, 1], [3, 1], [4, 1]]