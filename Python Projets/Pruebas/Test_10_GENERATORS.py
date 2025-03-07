def mygenerator():
    yield 1
    yield 2
    yield 3

g = mygenerator()

#print('The sum og the generator is: {}'.format(sum(g)))

#print('The reversed sorted list ofthe generator is: {}'.format(sorted(g,reverse=True)))

def countdown(num):
    print('Starting...')
    while num>0:
        yield num
        num-=1
        
cd = countdown(4) #Don't print anything if only run so far

Value = next(cd)
print(Value)
print(next(cd))
    
import sys   
def first(n):
    nums = []
    num = 0
    while num<n:
        nums.append(num)
        num +=1
    return nums

def first_Generator(n): #This function avoids the use of the list nums = []
    num = 0
    while num<n:
        yield num
        num +=1
print(f'Type of the generator: {type(first_Generator(2))}')
print(f'Sum of the function Generator: {sum(first_Generator(10))}')    
#print(sys.getsizeof(first(10000000)))              # = 89095160
print(sys.getsizeof(first_Generator(10000000)))     # = 104


def fibonacci(n):
    a,b = 0,1
    while n>0:
        yield a
        a,b = b,a+b
        n-=1
fib = fibonacci(10)
i = 1
for Num in fib:
    print(f'The fibonacci number in position {i} is: {Num}')
    i+=1
print('\n\n')     
mygenerator = (i for i in range(100000) if i%2==0)
print(sys.getsizeof(mygenerator))
    
mylist = [i for i in range(100000) if i%2==0]
print(sys.getsizeof(mylist))

