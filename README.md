# Actividad2Entornos
 By Santi Corrales, Eric Galatanu y Quim Pueyo

-Declaración de la Matriz
Primero declaro la matriz 5x5

-Relleno de la Matriz con Números Aleatorios
Luego hago un for con variables i y j, que recorren las filas y columnas de la matriz, para rellenar-la con numeros aleatorios del 1 al 100, para eso utilizo el Random

-Impresión de la Matriz
Y por ultimo vuelvo a hacer un for para printar por pantalla la matriz con los numeros aleatorios

Esta parte del código realiza una búsqueda de un número en una matriz quinto dimensional (de tipo matriz [5][5]), pidiendo al usuario que ingrese el número que desea encontrar.

1er Entrada del usuario: Se le pide al usuario que introduzca un número para buscar en la matriz (buscarnumero).

2n Inicializa de una bandera: Declaro una variable booleana numeroEncontrado para verificar si el número se encuentra dentro de la matriz.

3er Búsqueda en la matriz: Utilizo dos bucles for para recorrer cada elemento de la matriz. El primer bucle recorre las filas (i), y el segundo recorre las columnas (j).

Si el número de la matriz en la posición [i][j] es igual al número buscado (buscarnumero), se imprime la posición en la que se encontró y se cambia el valor de numeroEncontrado a true.

Paso resultado de la búsqueda:
- Si el número se encuentra, se muestra la posición en la que se encuentra en la matriz.
- Si después de recorrer toda la matriz el número no se encuentra, se imprime un mensaje
indicando que el número no existe en la matriz.

Por último para realizar la suma de la matriz

Se declara una variable suma_matriz de tipo entero, y se inicializa con el valor 0. Esta variable almacenará el total de la suma de los elementos de la matriz.

Después comienza un bucle for que se ejecuta 5 veces, ya que el índice i va desde 0 hasta 4 (es decir, recorre las 5 filas de la matriz). La variable i representa el índice de las filas.

Dentro del primer bucle, hay un segundo bucle for que también se ejecuta 5 veces. Este bucle recorre las columnas de cada fila, ya que la variable j es el índice de las columnas.

En cada iteración del segundo bucle (es decir, para cada elemento de la matriz), se toma el valor matriz[i][j] (el elemento en la fila i y columna j de la matriz), y se suma a la variable suma_matriz. El operador += agrega el valor de matriz[i][j] a suma_matriz.

Una vez que se han recorrido todas las filas y columnas, y se ha calculado la suma de todos los elementos de la matriz.
