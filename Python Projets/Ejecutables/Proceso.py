import matplotlib 
import matplotlib.pyplot as plt 
from matplotlib.patches import Rectangle 
import random
import time

x_Coord = [[1.5, 1.5],[3, 3 ],[0,4.25],[0,4.25]]
y_Coord = [[0, -4.25], [0,-4.25],[-1.5,-1.5],[-3,-3]]
random_Num = []

#Genera numeros aleatorios para el rack
i = 0
while i<5:
    x = random.randint(1, 9)
    if not (x in random_Num):
        random_Num.append(x)
        i+=1
    
  
fig = plt.figure(1) 
ax = fig.add_subplot(111)
 
for i, x_points in enumerate(x_Coord):
    y_points = y_Coord[i]    
    # Plot a graph
    ax.plot(x_points, y_points, linestyle='dashed', color = 'b')

num_Racks = 9
racks_Status = {}
for i in range(num_Racks):
    name = str(i+1)
    racks_Status[name] = 0

coord_Rect = [[0.25,-0.25],
              [1.75,-0.25],
              [3.25,-0.25],
              [0.25,-1.75],
              [1.75,-1.75],
              [3.25,-1.75],
              [0.25,-3.25],
              [1.75,-3.25],
              [3.25,-3.25]]
x_Rect = [0.75,2.25,3.75,0.75,2.25,3.75,0.75,2.25,3.75]
y_Rect = [-0.75,-0.75,-0.75,-2.25,-2.25,-2.25,-3.75,-3.75,-3.75]
plt.plot(x_Rect, y_Rect, "o", color="black")
for i, (x, y) in enumerate(zip(x_Rect, y_Rect)):
    plt.text(x+0.1, y, i+1, color="black", fontsize=12)

print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n... Motor en camino a la estación ...")
time.sleep(1.5)
print("...")
time.sleep(1.5)
print("...")
time.sleep(1.5)
print("...")
for k in racks_Status.keys():
    if int(k) in random_Num:
        racks_Status[k] = 1

for i, (k, v) in enumerate(racks_Status.items()):    
    if racks_Status[k] != 0:
        rn = random.randint(1,9)
        color_rect = "green" if rn%2 == 0 else "yellow"
        rect = matplotlib.patches.Rectangle((coord_Rect[i][0], coord_Rect[i][1]), 
                                     1, -1, 
                                     color = color_rect) 
        ax.add_patch(rect)
print("Estatus actual del Rack")
plt.title("Verde -> Sorte en uso   ||   Amarillo -> Proximo sorte")
plt.show(block=False)
print("Click para continuar")
plt.waitforbuttonpress(0)


print("...\n\nEl operador está colocando nuevos materiales en la estación ...")
time.sleep(1.5)
print("...")
time.sleep(1.5)
print("...")
time.sleep(1.5)
print("...")

while True:
    x = random.randint(1, 9)
    if not(x in random_Num):
        racks_Status[str(x)] = 1
        rect = matplotlib.patches.Rectangle((coord_Rect[x-1][0], coord_Rect[x-1][1]), 
                                 1, -1, 
                                 color ="yellow") 
        ax.add_patch(rect)
        break


plt.title("Verde -> Sorte en uso   ||   Amarillo -> Proximo sorte")
plt.show(block = False)
plt.pause(1)
print("\n\n... El operador colocó los materiales correspondientes...")
print("...")
print("...")
print("...")
print("... Nuevo Sorte proximo a usar...")
print("...")
time.sleep(1.5)
print("...")
time.sleep(1.5)
print("...")

plt.title("Verde -> Sorte en uso   ||   Amarillo -> Proximo sorte")
plt.show(block = False)
print("Click para continuar")
plt.waitforbuttonpress(0)


print("Fin de la simulación")
plt.pause(1)
plt.close()
