import numpy as np 

uti_op_kellogs = np.array([27834, 23789, 30189, 30967, 32501, 32701, 31665, 17155, 4614, 834])

#Algoritmo primera pregunta
dif_pro = np.mean(uti_op_kellogs[8:10]) - np.mean(uti_op_kellogs[:2])
print("El resultado de la diferencia del promedio de los 2 ultimos años, con los dos primeros años es:",dif_pro)

#Algoritmo segunda pregunta
dif_maxmin = np.max(uti_op_kellogs) - np.min(uti_op_kellogs)
print("El resultado de la diferencia entre las utilidades operacionales del año con mayor utilidad y el año con menor utilidad es:",dif_maxmin)

#Algoritmo tercera pregunta
a = print("La mediana de la utilidad operacional durante los años de registro es:",np.median(uti_op_kellogs))
print(a)

#Algoritmo cuarta pregunta
print("La media de la utilidad operacional durante los años de registro es:",np.mean(uti_op_kellogs))
print(a)

#Algoritmo quinta pregunta
for i in range(0,10):
    total = np.sum(uti_op_kellogs)
    por=(uti_op_kellogs[i]*100)/ total
    print("El porcentaje que aporta la utilidad del año",i+1,"evaluado, es de",por,"%.")

#Algoritmo sexta pregunta
defic = uti_op_kellogs[9:0:-10] - uti_op_kellogs[8:9]
print("El déficit en la utilidad operacional del año 2017 con respecto a la del año pasado fue de",defic,"millones de COP.")

#Algoritmo septima pregunta
for x in range(0,10):
    if x==0:
        rest = uti_op_kellogs[x]
        print("En el primer año no existe déficit.")
    else:
        defic = rest - uti_op_kellogs[x]
        rest = uti_op_kellogs[x]
        por = defic/ total
        print("El porcentaje de déficit del año",i+1,"con respecto al año posterior es de",por,"%.")
