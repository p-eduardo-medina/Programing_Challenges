def manejoString(question):
    import re                                   #Esta libreria la utilizamos para elominar espacios excesivos
    question = re.sub(' +', ' ', question)
    question = question.strip()
    if question[0].isalpha():                   #Con esta función ponemos en mayuscula la primer letra de la oración
        question = question.capitalize()
    else:
        res = question.find(next(filter(str.isalpha, question)))
        question = question[:res] + question[res].upper() + question[res + 1:]
    if question.find("¿")!=-1:                  #Verificamos que las preguntas tengan un signo "?"
        if question.find("?")==-1:
            question = question+"?"
    if question.find(",")!=-1:                  #Eliminamos los espacios antes de cada com ","
         if question[question.find(",")-1]==" ":
            index = question.find(",")-1
            question= question[:index] + question[index+1:] 
    return question


question = "tengo una pregunta.     ¿cual     es el precio"
print(manejoString(question))