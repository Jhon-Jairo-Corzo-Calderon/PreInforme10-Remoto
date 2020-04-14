import numpy as np 

uti_op_kellogs = np.array([27834, 23789, 30189, 30967, 32501, 32701, 31665, 17155, 4614, 834])

#Algoritmo primera pregunta
dif_pro = np.mean(uti_op_kellogs[8:10]) - np.mean(uti_op_kellogs[:2])

print("El resultado de la diferencia del promedio de los 2 ultimos años, con los dos primeros años es:",dif_pro)

#Algoritmo segunda pregunta
dif_maxmin = np.max(uti_op_kellogs) - np.min(uti_op_kellogs)

print("El resultado de la diferencia entre las utilidades operacionales del año con mayor utilidad y el año con menor utilidad es:",dif_maxmin)


