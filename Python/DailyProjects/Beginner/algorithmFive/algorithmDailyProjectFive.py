
#Para utilizar un archivo o para importar un archivo

#path permite trabajar coon rutas de manera mas eficiente que el OS
from pathlib import Path
#Aca se obtiene el directorio actual 
path = Path(__file__).parent
#Aca se combina el path para buscar el archivo dentro del directorio actual es decir: C:\Users\Alan\Documents\GitHub\Projects\Python\DailyProjects\algorithmFive\numbers.txt
path2 = path/'numbers.txt'
#Para leer el contenido del archivo se utiliza with (se utiliza asi, para que el archivo se cierre despues de utilizarse)
#.open se utiliza para abrir el archivo, se tiene que asignar como se va a utilizar, en este caso 'r' osea read(lectura)
with path2.open('r') as file: #aca guarda  el archivo abierto como file
    line1 = file.read() #.read() se utiliza para leer el contenido, tambien existe .readline() que es para leer una sola linea
                        #!!Importante!!. Devuelve una lista como valor
    line = line1.split("\n") #Aca lo que hago es eliminar los saltos de linea que se agregaron con la lectura del archivo
    list_int = [] #Aca creo una nueva lista vacia para luego convertirlos en enteros, porque estan en tipo String 
    for element in line:
        list_int.append(int(element)) #aca toma la lista vacia y le agrega los elementos uno por uno
                                        #pero los agrega como enteros
        #exactamente lo que hace es que lee elemento por elemento(que no tiene saltos de linea)
        #luego los agrega a una lista vacia como enteros(porque element es cada elemento de la lista original(sin saltos de linea))
    print(max(list_int)) #Imprime los resultados