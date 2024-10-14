ls = ["Vocales", "Numeros", "Letras"]
follow=True
while follow:
    contar = str(input(f"Que quieres contar, 1. {ls[0]}, 2. {ls[1]}, 3. {ls[2]}: "))
    contar = contar.lower()
    contador = 0
    if contar == "1" or contar == "vocales":
        word = str(input("Ingresa el  texto: "))
        vocales = ["a", "e", "i", "o", "u"]
        for vc in word:
            if vc in vocales:
                contador+=1
        print(f"El texto '{word}' tiene {contador} vocales")
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
    seguir2 = str(input("Otro conteo?, S = si, N = no: "))
    seguir2 = seguir2.lower()
    if seguir2 != "s":
        print("!Gracias por usar!")
        follow=False