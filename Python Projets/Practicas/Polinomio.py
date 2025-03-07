import numpy as np
import matplotlib.pyplot as plt

N = 7  #Número de lados del poliedro  N>=3
listVect = []
alpha = 2*np.pi/N
for i in range(N):
    listVect.append([np.sin(i*alpha),-np.cos(i*alpha)])
V = np.array(listVect)


vecLong = np.linspace(-1,1,100)     #Vector para determinar la longitud de los lados
pP = []             
for lado in range(N):               #Crear las coordenadas del polinomio            
    for dx in vecLong:
        pP.append( [ V[lado,0] + np.tan(alpha/2)* np.cos(alpha*lado)*dx   ,  V[lado,1] + np.tan(alpha/2)* np.sin(alpha*lado)*dx ] )
pP = np.array(pP)

plt.plot(pP[:,0],pP[:,1])
plt.plot(0,0,'o')
plt.grid()
plt.show()


rot = np.linspace(0,2*np.pi,100) 

plt.ion()
for rotation in rot:
    l = 1.5
    tP = []
    for x,y in pP:
        tP.append( [ np.cos(rotation)*x - np.sin(rotation)*y  , np.sin(rotation)*x + np.cos(rotation)*y ] )
    tP = np.array(tP)
    plt.plot(tP[:,0],tP[:,1])
    plt.xlim(-l,l)
    plt.ylim(-l,l)
    plt.grid()
    plt.draw()
    plt.pause(0.001)
    plt.clf()