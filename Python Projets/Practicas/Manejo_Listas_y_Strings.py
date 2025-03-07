#Manejo de Listas y Strings]   
#Diseñado por Eduardo Medina.


def solution(precios, notas,x):
    diference = []                  #Aquí determinamos cuando el precio de la tienda es mayor o menor
    for sentence in notas:
        index = sentence.find("%")  #Con esto determinamos cuando el precio será diferente
        if index==-1:               # En este caso no habrá cambio en el precio
            diference.append(0)
        else:                       # Tomamos el porcentaje que será la diferencia, ya sea más caro o más barato
            option = sentence[index:len(sentence)]
            if option == "% mas alto":
                percent = int(float(sentence[0:index]))/100
                diference.append(percent)
            elif option == "% mas bajo":
                percent = -1*int(float(sentence[0:index]))/100
                diference.append(percent)
    diff = []                       #Comparamos con el precio en linea y determinamos du diferencia en función al porcentaje
    for i in range(len(precios)):
        if diference[i]>0:
            diff.append(round(precios[i]-precios[i]/(1+diference[i])))            
        elif diference[i]<0:
            diff.append(-1*round(precios[i]-precios[i]/(1+abs(diference[i]))))      
        else:
            diff.append(0)
    suma = sum(diff)                #Realizamos la suma y comprobamos si la diferencia es mayor o menor
    if suma<=x:return True
    else: return False
            
            
            
precios= [24.42, 24.42, 24.2424, 85.23]

notas=["13.157% mas alto",
"13.157% mas bajo",
"mismo que en tienda",
"19.24% mas alto"]
x = 0

s = solution(precios, notas, x)     #INvocamos la función e imprimimos el resultado
print(s)