fun main(){
    var utiKellogs = floatArrayOf(27834F, 23789F, 30189F, 30967F, 32501F, 32701F, 31665F, 17155F, 4614F, 834F)


//Algoritmo primera pregunta.
    var prom= ((utiKellogs[9] + utiKellogs[8]) / 2) - ((utiKellogs[0] + utiKellogs[1]) / 2)
    println("El resultado de la diferencia del promedio de los 2 ultimos años, con los dos primeros años es: $prom")

//Algoritmo segunda pregunta.
    var mayor = maximo(utiKellogs)
    var menor = minimo(utiKellogs)
    println("El resultado de la diferencia entre las utilidades operacionales del año con mayor utilidad y el año con menor utilidad es: ${mayor-menor}")

//Algoritmo tercera pregunta.
    var listaOrdenada = floatArrayOf(27834F, 23789F, 30189F, 30967F, 32501F, 32701F, 31665F, 17155F, 4614F, 834F)
    listaOrdenada.sort()
    var mediana = (listaOrdenada[4] + listaOrdenada[5])/2
    println("La mediana de la utilidad operacional durante los años de registro es: $mediana.")

//Algoritmo cuarta pregunta.
    var promTotal = promedio(utiKellogs)
    println("La media de la utilidad operacional durante los años de registro es: $promTotal")

//Algoritmo quinta pregunta.
    var cant = Array(10) { i -> i*1}
    for (i in cant){
        var total = sumatoria(utiKellogs)
        var porc = (utiKellogs[i]*100)/total
        println("El porcentaje que aporta la utilidad del año ${i+1} evaluado, es de $porc%.")
    }

//Algoritmo sexta pregunta.
    var defic = utiKellogs[9] - utiKellogs[8]
    println("El déficit en la utilidad operacional del año 2017 con respecto a la del año pasado fue de $defic millones de COP.")

//Algoritmo septima pregunta.
    for(x in cant){
        if (x==0){
            println("En el primer año no existe déficit.")
        }
        else{
            var rest = utiKellogs[0]
            defic = rest - utiKellogs[x]
            rest = utiKellogs[x]
            var porc = defic*100/sumatoria(utiKellogs)
            println("El porcentaje de déficit del año ${x+1} con respecto al año posterior es de $porc% (Porcentaje creado en base a la sumatoria total de las utilidades).")
        }
    }
}

//Funcion para hallar el mayor valor del arreglo.
fun maximo(lista: FloatArray):Float{
    var mayor = 0F
    for (i in lista){
            if (i>mayor)
                mayor=i
        }
    return mayor
}

//Funcion para hallar el menor valor del arreglo.
fun minimo(lista: FloatArray):Float{
    var menor = 0F
    for (i in lista){
        if (menor==0F)
            menor=i

        if (i<menor)
            menor=i
    }
    return menor
}
//Funcion para la sumatoria de los valores dentro del arreglo
fun sumatoria(lista: FloatArray): Float {
    var acum = 0F
    for(i in lista) {
    acum = acum + i
    }
    return acum
}

//Funcion para hallar el promedio total.
fun promedio(lista: FloatArray):Float{
    var acum = sumatoria(lista)
    var cont = 0F
    for (i in lista){
        cont +=1
    }
    return acum/cont
}


