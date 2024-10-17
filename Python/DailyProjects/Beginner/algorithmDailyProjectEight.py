#Promedio
follow=True
while follow:
    print("------------Avarage------------")
    try:
        num1 = int(input("Number 1: "))
        num2 = int(input("Number 2: "))
        num3 = int(input("Number 3: "))
    except:
        continue
    avarage = (num1+num2+num3)/3 #Para sacar el promedio se suman todos los numeros y se divide por la cantidad de numeros
    print(f"Avarage is {avarage}")
    seguir2 = str(input("Again?, S = yes, N = not: ")) 
    seguir2 = seguir2.lower() 
    if seguir2 != "s":
        print("!Thanks For Use!")
        follow=False 
    else:
        continue
