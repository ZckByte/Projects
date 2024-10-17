#Generate file with different name
import random #Importa la libreria random
import string #Importa la libreria string
Name = random.choices(string.hexdigits,k = 10) # Aca se utiliza la libreria random con el metodo .choices
                        #Lo que hace es seleccionar mas de un caracter, luego se utiliza la libreria String
                        #Con el metodo .hexdigits (letras, numeros) con una cantidad de 10 caracteres en
                        #en parametro de choicese
                        #!Devuelve el valor como lista!
Name = ''.join(Name) #Lo que se hace aca es ajustar el nombre a una string 
                    #Es decir que agrege '' a name es decir que quedaria como un string
file = open(f'Python/DailyProjects/Beginner/algorithmSeven/{Name}.txt', 'x') 
        #Aca se utiliza un metodo build de python, open, funciona para crear, escribir y leer archivos
        #Lo que hago es concatenar el string para que me permita colocar el nombre generado en "Name"
        #Lo extiendo como .txt y le agrego "x" es decir que se cree un archivo
file.write(f'{Name}') #Este metodo sirve para escribir en el archivo
                    #Es decir que aca escribo lo mismo que esta en el nombre del archivo
file.close()    #Es importante cerrar los archivos por recursos
