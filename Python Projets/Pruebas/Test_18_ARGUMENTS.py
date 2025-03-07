def print_name(name):
    print(name)
    
def foo(a,b,c, d = 4): #d as default value
    print(f'a = {a},b = {b}, c = {c}, d = {d}')

foo(b=1,a=2,c=3) #Keyword arguments
print_name('Lalo')

def foo2(a,b, *argumentos,**kw_argumentos):
    print(a,b)
    for arg in argumentos:
        print(arg)
    for key in kw_argumentos:
        print(key,kw_argumentos[key])
        
foo2(1,2,3,4,5,6,7,8,9, six=6,seven=7)

def foo3(a,b,*,c,d):
    print(a,b,c,d)
    
foo3(1,2,c=3,d=4)

def foo4(*args,last):
    for arg in args:
        print(arg)
    print(last)
    
foo4(1,2,3,4,last = 100)

def foo5(a,b,c):
    print(a,b,c)
    
my_list=[1,2,3]
my_dic = {'a':1, 'b':2, 'c':3}
foo5(*my_dic.values()) #Must match the parameters in function
#   =
foo5(**my_dic)

def foo6():
    global number
    x = number
    number=3
    print('number inside function: ',x)


number = 1
foo6()
print(number)



    



