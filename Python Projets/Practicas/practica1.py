#Función generadora
def fibonacci(N): #Solo será útil una vez, generadores se usan mejor cuando son guiados por indice 'i'
    a,b = 0,1
    for i in range(N):        
        yield b
        a,b = b,a+b
        

### Paquete y función parte del paquete de error 
class numeroMayorQue(Exception):
    def __init__(self, message,value):
        self.message = message
        self.value = value  
class numeroMenorQue(Exception):
    def __init__(self, message,value):
        self.message = message
        self.value = value   
def probar_Valor(x,max,min):
    if x > max:
        raise numeroMayorQue(f'El valor {x} es mayor que: {max}',x) #Mensaje de error y valor
    if x<= min:
        raise numeroMenorQue(f'El valor {x} es menor que: {min}',x) 
    else:
        dict,i,nums = {},1,x
        while x>0:
            dict[str(i)] = x%10
            x = int(x/10)
            i*=10
        dic_Items_Reversed = list(dict.keys())[::-1]
        dict = {k: dict[k] for k in dic_Items_Reversed}#Invertir diccionario
        print('\n',f'El numero es: {nums} = ',dict)
        return dict

        
            
                


#Código Principal 
val_Max,val_Min = 1000,10
fib             = fibonacci(20)

for Num in fib:
    try:   
        dict = probar_Valor(Num,val_Max,val_Min)
    except numeroMayorQue as e:
        print('\nMensaje de error: <<{}>>. El valor {} no es válido, es muy GRANDE '.format(e.message, e.value))
    except numeroMenorQue as e:
        print('\nMensaje de error: <<{}>>. El valor {} no es válido, es muy PEQUEÑO '.format(e.message, e.value))
    