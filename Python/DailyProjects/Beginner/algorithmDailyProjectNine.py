#Check if a number is Evenr or Odd

num = int(input("Input number: "))
if num % 2 == 1: #Lo que se hace es hacer un división modulada es decir, que cuando se divide en 2
                #Si deja algun resultado es decir no tiene divisor, quedara 1 como resultante, lo que viene siendo que es impar
    print("The number is ODD")
else:
    print("The number is EVEN")