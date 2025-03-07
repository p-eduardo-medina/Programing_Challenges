def noPrefix(words):
    flag = True
    for i in range(len(words)):
        subWords = words[i+1:]
        for j in range(len(subWords)):
            if words[i] in subWords[j]:
                print("BAD SET")
                print(subWords[j])
                return
    print('GOOD SET')
    return

words = ['aab', 'aac', 'aacghgh', 'aabghgh']
noPrefix(words)