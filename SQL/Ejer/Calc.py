import sqlite3
import os
try:
    path = r"C:\Users\Alan\Documents\GitHub\Projects\SQL\Ejer\historial.db"
    conex = sqlite3.connect(path)
    sq = conex.cursor()
except Exception as ex:
    print(ex)

sq.execute(''' 
    CREATE TABLE IF NOT EXISTS historial(
    opeID INTEGER PRIMARY KEY AUTOINCREMENT,
    operacion TEXT,
    resultado TEXT
    )
''')

seguir = True
print("------------------CALCULADORA------------------")
while seguir:
    operaciones = ["+", "-", "*", "/"]
    opera = str(input(f"Que operacion desea realizar? {operaciones}: "))
    if opera in operaciones:
        try:
            parametro1 = float(input("Primer numero: "))
            parametro2 = float(input("Segundo numero: "))
        except:
            continue
    else:
        continue
    resultado = None
    if opera == "+":
        resultado = parametro1 + parametro2
        print(f"El resultado es: {resultado}")
    elif opera == "-":
        resultado = parametro1 - parametro2
        print(f"El resultado es: {resultado}")
    elif opera == "*":
        resultado = parametro1 * parametro2
        print(f"El resultado es: {resultado}")
    elif opera == "/":
        try:
            resultado = parametro1 / parametro2
            print(f"El resultado es: {resultado}")
        except:
            print("Ingresa un numero valido")
            continue
    seguir2 = str(input("Desea ejecutar otra operacion?, S = si, N = no: "))
    seguir2 = seguir2.lower()
    if seguir2 != "s":
        print("!Gracias por usar!")
        seguir=False

operacione_sql = f"{parametro1} {opera} {parametro2}"
resultado_sql = f"{resultado}"
sq.execute('INSERT INTO historial (operacion, resultado) VALUES (?,?)', (operacione_sql, resultado_sql))
conex.commit()
resu = sq.fetchall()
for c in resu:
    print(c)







