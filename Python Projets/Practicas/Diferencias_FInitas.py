import numpy as np
import matplotlib.pyplot as plt
#matplotlib inline

n = 10
h = (5-0) / n

# Get A
A = np.zeros((n+1, n+1))
A[0, 0] = 1
A[n, n] = 1
for i in range(1, n):
    A[i, i-1] = 1
    A[i, i] = -2
    A[i, i+1] = 1

print(A)

# Get b
b = np.zeros(n+1)
b[1:-1] = -9.8*h**2
b[-1] = 50
print(b)

# solve the linear equations
y = np.linalg.solve(A, b)

t = np.linspace(0, 5, 11)

plt.figure(figsize=(10,8))
plt.plot(t, y)
plt.grid()
plt.plot(0, 0, 'ro')
plt.plot(5, 50, 'ro')
plt.title('Ejemplo de Método de Diferencias Finítas')
plt.xlabel('tiempo ')
plt.ylabel('Altura')
plt.show()