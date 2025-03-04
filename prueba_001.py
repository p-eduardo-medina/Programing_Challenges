import hashlib

s = 'CitricSheep'
suma=0
for i in s:
    i2 = ord(i)
    suma += i2
suma = str(suma)
t_value = suma.encode('utf8')
h = hashlib.sha256(t_value)
h.hexdigest()
n = int(h.hexdigest(),base=16)
print(n)
