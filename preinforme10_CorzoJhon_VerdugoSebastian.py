import numpy as np 

uti_op_kellogs = np.array([27834, 23789, 30189, 30967, 32501, 32701, 31665, 17155, 4614, 834])

print(np.mean(uti_op_kellogs[:2]))

dif_pro = np.mean(uti_op_kellogs[8:10]) - np.mean(uti_op_kellogs[:2])
print("El resultado de la diferencia del promedio de los 2 ultimos años, con los dos primeros años es:",dif_pro)

