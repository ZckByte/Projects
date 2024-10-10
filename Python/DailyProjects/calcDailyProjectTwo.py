ope = ["+", "-", "*", "/"]
print(f"Que operacion deseas realizar {ope}")
operacion = str(input(""))
num1 = int(input("Ingrese el primer numero: "))
num2 = int(input("Ingrese el segundo numero: "))

resultadoS = num1 + num2
resultadoR = num1 - num2
resultadoM = num1 * num2
try:
    resultadoD = num1 / num2
except ZeroDivisionError:
    print("No se puede hacer una división entre cero")
    num1 = int(input("Ingrese el primer numero: "))
    num2 = int(input("Ingrese el segundo numero: "))
seguir = True

while seguir:
    if operacion == "+":
        print(f"El resultado de {num1} y {num2} es igual a {resultadoS}")
    elif operacion == "-":
        print(f"El resultado de {num1} y {num2} es igual a {resultadoR}")
    elif operacion == "*":
        print(f"El resultado de {num1} y {num2} es igual a {resultadoM}")
    elif operacion == "/":
        print(f"El resultado de {num1} y {num2} es igual a {resultadoD}")
    print("Quieres realizar otra operacion?, S = si, N = no.")
    seguirP = str(input(""))
    seguirP = seguirP.lower()
    if seguirP != "n":
        seguir=False
    else:
        seguir=True