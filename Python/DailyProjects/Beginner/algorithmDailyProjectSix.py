#Check username
print("----Check an Username----") #Este algoritmo sirve para verificar si un nombre de usuario es valido
                                    #A partir de unas condiciones
user_check = str(input("Input your username: "))
def check_name(username): #Se define la funcion 
    if len(username) > 4 and len(username) < 15: #Si el nombre de usuario es mayor a 4 y menor de 15 caracteres
        if username.isalnum(): #Si es nombre de usuario es alphanumerico (letras y numeros)
            if username[0].islower(): #Si la primera es una letra
                print("Username is valid") #Si cumple con estas condiciones el usuario sera valido
            else:
                print("Username is invalid") #De lo contrario el usuario es invalido
        else:
            print("Username is invalid")
    else:
        print("Username is invalid")
user = user_check
follow=True
while follow:
    check_name(user)
    follow2= str(input("Wish follow?, s = yes, n = not: ")).lower()
    if follow2 != "s": 
        print("!Thanks For Use!")
        follow=False
    else:
        continue