result = 2**4
print(result)

zeros = [0,2]*10 #(0,2)*10,  AB*10
print(zeros)

def foo(a,b,*args, **kwargs):
    print(a,b)
    for arg in args:
        print(arg)
    for key in kwargs:
        print(key, kwargs[key])
    
foo(1,2,3,4,5,six=6,sseven=7)

numbers = [1,2,3,4,5]

*beginning, bef_LAst,last = numbers
print(beginning)
print(bef_LAst,last)

beginning, *last = numbers

print(beginning)
print(last)

beginning, *middle, last = numbers
print(beginning)
print(middle)
print(last)


my_tuple = (1,2,3)
my_list = [4,5,6]

new_lis = [*my_tuple, *my_list]
print(new_lis)

my_dica = {'a':1, 'b':2, 'c':3}
my_dicb = {'d':4, 'e':5, 'f':6}

new_dic = {**my_dica,**my_dicb}
print(new_dic)



