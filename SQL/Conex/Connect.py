
#Para conectar una base de datos a python3 se hace de la siguiente manera

#1. Primero se importa sql
import sqlite3

#2. Luego se enlasa con la base de datos o si no esta creada se crea
conex = sqlite3.connect('usuario.db')

#3. Se crear el cursor para ejecutar comandos en el sql
cs = conex.cursor()

    #Para crear una tabla

#Se utiliza execute (Seria como mandar comandos a la consola de sql)
cs.execute(''' 
    CREATE TABLE IF NOT EXISTS usuario(
    userID INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL,
    apellido TEXT NOT NULL,
    edad INTEGER
    )
''')

    #Insertar datos

cs.execute(''' 
    INSERT INTO usuario (nombre,apellido,edad)
    VALUES ("Alan", "Alzate", 16), ("Brandon", "Ossa", 17), ("Juan", "Molina", 17)
''')


#Para eliminar datos se utiliza DELETE, si se quiere eliminar la tabla completa se utiliza DELETE FROM nombre_tabla
#Si se requiere eliminar un dato en especifico se utiliza DELETE FROM nombre_tabla WHERE dato que se desea elimnar o datos, ejm: ID = 21

cs.execute(''' 
    DELETE FROM nombre_tabla
''')

cs.execute(''' 
    DELETE FROM nombre_tabla WHERE condicion_a_eliminar
''')

#Para agregar datos o editar datos se utiliza UPDATE, ej:

cs.execute(''' 
    UPDATE nombre_tabla
    SET apellido = "apellido"
    WHERE ID = 2 (aca puede ser cualquier cosa que identifique al usuario o dato)
''')


#Para concatenar python con sql se hace de la siguiente manera

nombre = "Alan"
edad = 16

#Se utiliza AND para agregar mas condiciones, tambien se puede utilizaro OR
cs.execute('SELECT * FROM usuario WHERE nombre = ? AND edad = ?', (nombre, edad))

#Si se requiere saber todos los datos que coinciden en la consola se utiliza
#fetchall(), pero si se requiere saber una fila es fetchone()

cs.fetchall()
cs.fetchone()

#Esta parte siempre tiene que estar para mostrar los resultados
conex.commit()
resu = cs.fetchall()
for fila in resu:
    print(fila)