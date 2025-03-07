#  %, .format(). f-Strings

var = 'Tom'
my_string = '\n\tThe variable is: %s :D' % var
print(my_string)

var=3.141692654
my_string = '\n\tThe value of pi is: %.2f :d' %var
print(my_string)

var=3.141692654
my_string = '\n\tThe value of pi is: %.3f :d' %var
print(my_string)

var=3.141692654
my_string = '\n\tThe value of pi is: %.4f :d' %var
print(my_string)


var=3.141692654
my_string = '\n\tThe variable is :{}'.format(var)
print(my_string)

var=3.141692654
var2 = 6.282
my_string = '\n\tThe variable is :{:.2} and {}'.format(var,var2)
print(my_string)


