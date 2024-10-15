
#Este algoritmo es para contar cuantas vocales, numeros o letras tiene una cadena de texto

#aca creo la lista que se le va a mostrar al usuario
ls = ["Vocales", "Numeros", "Letras"]

#el bucle while, para luego poder preguntarle al usuario si quiere seguir con la ejecucion
follow=True
while follow:
    #Aca le pido que quiere hacer utilizando la lista del principio(con index)
    contar = str(input(f"Que quieres contar, 1. {ls[0]}, 2. {ls[1]}, 3. {ls[2]}: "))
    #lo paso a .lower es decir lo paso a minisculas para poder manejarlo mejor
    contar = contar.lower()
    #creo el contado, el cual va a funcionar para mostrarle cuantas coincidencias se encuentran
    contador = 0
    #Los condicionales de cada opcion del input principal
    if contar == "1" or contar == "vocales": #Si contar es igual a 1 o contar es igual a vocales
        word = str(input("Ingresa el  texto: ")) #texto con el que se trabajara
        vocales = ["a", "e", "i", "o", "u"] #Las vocales para poder encontrar coincidencias dentro del texto
        for vc in word: # Bucle for que leera el texto
            if vc in vocales: #Aca los que hace es que si encuentra una vocal el contador incrementara 
                contador+=1
        print(f"El texto '{word}' tiene {contador} vocales") # se muestra la cantidad de coincidencias
    elif contar == "2" or contar == "numeros":
        word = str(input("Ingresa el  texto: "))
        num_list = ["0","1","2","3","4","5","6","7","8","9"]
        for num in word:
            if num in num_list:
                contador+=1
        print(f"El texto '{word}' tiene {contador} numeros")
    elif contar == "3" or contar == "letras":
        word = str(input("Ingresa el  texto: "))
        for pl in word:
                contador+=1
        print(f"El texto '{word}' tiene {contador} de Letras")
        #Para todos se utiliza casi el mismo metodo que el primero
    seguir2 = str(input("Otro conteo?, S = si, N = no: ")) #aca le pregunto si quiere seguir el bucle
    seguir2 = seguir2.lower() #Paso la respuesta a miniscula para trabajarla mejor 
    if seguir2 != "s": # Si el input de seguir2 es diferente de "s" el programa se terminara, de lo contrario volvera a ejecutarse
        print("!Gracias por usar!")
        follow=False # Termina el bucle principal
    else:
        continue