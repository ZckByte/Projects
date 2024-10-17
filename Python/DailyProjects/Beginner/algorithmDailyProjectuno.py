
#Este algoritmo es para saber que numero es mayor de tres predefinidos

num1=12
num2=45 #Aca se definen
num3=60

print("El numero mayor es...")

if num1>num2 and num1>num3:  #Dice: si el numero 1 es mayor que el numero dos Y el numero 1 es mayor que el numero 3
    print(f"El mayor es {num1}") #Dira que el mayor es el tres
elif num2>num1 and num2>num3:
    print(f"El mayor es {num2}")
else:
    print(f"El mayor es {num3}") #Se sigue el mismo algoritmo para los tres, pero si no es el numero 1 ni el 
                                    #numero 2 el mayor, el mayor sera el 3