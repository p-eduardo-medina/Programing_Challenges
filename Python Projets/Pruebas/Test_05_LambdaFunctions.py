# lambda: The argument is an expression  :D

add01 = lambda x: x-10

print(add01(5))

mult = lambda x,y: x*y
print(mult(2,7))

points2D = [(1,2),(15,1),(5,-1),(10,4)]

def sort_by_y(x):
    return x[1]

points2d_sorted = sorted(points2D,
                         key = lambda x:x[1]) #=> key = sort_by_y))

points2d_sorted = sorted(points2D,
                         key = lambda x: sum(x) )
print(points2D)
print(points2d_sorted)

#map(funct, seq)

a = [1,2,3,4,5]
b = map(lambda x: 2*x,a)
print(list(b))

c = [x*2 for x in a] #Solo usar con list, dict, etc.
print(c)

#Filter function, return if condition is TRUE

a = [1,2,3,4,5,6]
b = filter(lambda x:x%2==0,a)
print(list(b))
c = [x for x in a if x%2==0]
print(list(c))

#Reduce function
from functools import reduce
product_a = reduce(lambda x,y:x*y, a )
print(a)
print('1*2 -> 2*3 ->6*4 ->24*5 ->120*6 = {}'.format(product_a))

