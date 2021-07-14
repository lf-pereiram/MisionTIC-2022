import os
os.system ("cls")
import math

## RETO 1 
#Mensaje de bienvenida a la zona de WIFI
print("Bienvenido al sistema de ubicación para zonas públicas WIFI")

#Se asignan las variable para el usuario y la contrseña
usuario='51676'
password='67615'

#Recibe desde consola un usuario
usuario_ingresado = input("Ingrese usuario:  ")

#Valida si usuario es uno valido para el sistema
if usuario_ingresado == usuario:
    #Recibe desde consola un usuario
    password_ingresado = input("Ingrese password:  ")
    #Valida si contraseña es uno valido para el usuario a ingresar
    if password_ingresado == password:
        #Se crean las variables captcha para verificar si el usuario que va a ingresar al sistema realmente es una persona
        num_1_captcha = 676
        num_2_captche = int(((((6+1)*6-5)%5)**5-(5-1))/(5-1))
        captcha_ingresado = input(str(num_1_captcha) + '+' + str(num_2_captche) + '=')
        captcha = int(captcha_ingresado)

        #Valida que la suma de los captchas sea correcto
        if captcha == num_1_captcha + num_2_captche:
            #Muestra el mensaje de inicio de sesión exitosa
            print("Sesión iniciada")
        #Si la suma es incorrecta muestra mensaje de error y se sale del sistema
        else:
            print("Error")
            exit(0)
    #Si la clave es incorrecta muestra mensaje de error y se sale del sistema
    else:
        print("Error")
        exit(0)
#Si el usuario es incorrecto muestra mensaje de error y se sale del sistema
else: 
    print("Error")
    exit(0)

## FIN RETO 1 -----------------------------------------------------------------------------------


# Se ejecuta la función adivinanza de la línea 111, la cual no requiere de argumentos
def adivinanza():
    print(" ")

    # Se plantean las adivinanzas
    adiv_1 = input("Si quieres saber qué número soy , espera a que llueva. Contando los colores del arcoíris tendrás la prueba: ")

    #Se valida si la respuesta de la primera adivinanza es correcta.
    #Se retorna 1 si es ambas adivinanzas son correcta o 0 si alguna es incorrecta
    if adiv_1 == "7":

        adiv_2 = input("¿Qué cosa será aquella que mirada del derecho y mirada del revés siempre un número es?: ")
    
        #Se valida si la respuesta de la segunda adivinanza es correcta.
        if adiv_2 == '6':
        
            return 1
        
    else:
        return 0
    
# Se ejecuta op_favorita a la cual le ingresan los argumentos (b,opcion_favorita,lista), pero no necesariamente se tienen que llamar igual
def op_favorita(b,opcion_favorita,lista):
    # Si las adivinanzas fueron correctas, se llama a la función menú, sino, se imprime el menú previo (sin modificar)
    if b == 1:
        # Se ejecuta la función menú
        menu(opcion_favorita,lista)                                                                                     
    else:
        print(" ")
        print("Error")
        print(" ")
        print("MENU DE OPCIONES")
        print(" ")
        for i in range (7):                                
            print(f"{i+1}. ", lista[i])

# Se ejecuta la función menu a la cual le ingresan los argumentos (opcion_favorita,lista) 
def menu(opcion_favorita,lista):
    # Como se esá trabajando con listas entonces se debe indicar correctamente la variable del menú (el numeral 1, corresponde a la posición 0 de la lista)
    opcion_elegida=lista[opcion_favorita-1]
    
    # Se elimina la opción seleccionada de la lista
    lista.remove(opcion_elegida)

    # Se inserta la opción elegida en la primer posición de la lista
    lista.insert(0, opcion_elegida)

    # Se limpia la consola y se imprime el nuevo menú
    os.system ("cls")
    print(" ")
    print("MENU DE OPCIONES")
    print(" ")
    for i in range (7):
        print(f"{i+1}. ", lista[i])

#Se ejecuta para validar las coordenadas
def incoord(k):
    fcoor = 0
    lon = 0
    lat = float(input(f'Ingrese latitud {k}: '))
    if lat > 1.998 or lat < 1.740:
        print('Error coordenada')             
        fcoor = -1
    else:
        lon = float(input(f'Ingrese longitud {k}: '))
        if lon < -75.950 or lon > -75.689:
            print('Error coordenada')             
            fcoor = -1
    return lat, lon, fcoor

#Asignación de opciones del menú a variables
op1="Cambiar contraseña"
op2="Ingresar coordenadas actuales"
op3="Ubicar zona wifi más cercana"
op4="Guardar archivo con ubicación cercana"
op5="Actualizar registros de zona wifi desde archivo"
op6="Elegir opción de menú favorito"
op7="Cerrar sesión"

#Se crea una lista con el orden (1 al 7) de lascl opciones anteriores
lista=[op1,op2,op3,op4,op5,op6,op7]
os.system ("cls")

# Muestra tìtulo MENU OPCIONES
print(" ")
print("MENÚ DE OPCIONES")
print(" ")

# Se crea un ciclo que imprime las opciones de la lista de manera numerada para crear el menú
for i in range (7):
    print(f"{i+1}. ", lista[i])

#Se crea variable z para controlar si el menú opciones se repite o se cierra el programa
#z=1
m = 0
n = 0

MatCoor = [[0,0],[0,0],[0,0]]   #Matriz de 3x2 para ingresar las coordenadas actuales lat y long
#Matriz de 4x3 para ingresar las coordenadas actuales lat, long y promedio de usuario
MatCoorwi = [[0,0,0],[0,0,0],[0,0,0],[0,0,0]]
fcoor = 0


# Inicia el ciclo while
while True:
    
    # Se usa función try para controlar que no se ingresen valores diferentes a número entero
    try:
        print(" ")
        # Entrada de opción del menú
        opcion_ingresada = int(input("Elija una opción: "))
        
        # Se evalúa que el número ingresado esté dentro de la numeración del menú, sino se se imprime mensaje de Error y termina el programa
        if opcion_ingresada in range(1,8):

            #Permite al usuario modificar su contraseña actual
            if opcion_ingresada == 1:
                conf_actual = input("Confirmar la contraseña actual: ")
                #Confirma que la contraseña ingresada por el usuario es la misma que esta en el sistema
                if conf_actual != password:
                    print("Error")
                    break
                else:
                    temp = input("Ingrese nueva contraseña: ")
                    #Confirma que la contraseña nueva ingresada por el usuario es diferente que la que esta en el sistema
                    if temp != password:
                        password = temp
                    else:
                        print("Error")
                        break
                    os.system ("cls")
                    print(" ")
                    print("MENU DE OPCIONES")
                    print(" ")
                    for i in range (7):
                        print(f"{i+1}. ", lista[i])

            elif opcion_ingresada == 2:
                if fcoor == 0:   #Ingresado por primera vez
                    for ci in range(3):
                        MatCoor[ci][0], MatCoor[ci][1], fcoor = incoord(ci+1)
                        if fcoor == -1:
                            break
                if fcoor == 1:  #Ya entró previamente
                    #Validación: -Coordenada occidente -Coordenada sur
                    conta = 1
                    occ = [MatCoor[0][1],1]
                    sur = [MatCoor[0][0],1]
                    print(f"C. occidental ",occ)
                    print(f"C. sur ",sur) 
                    
                    for ci in MatCoor:
                        print(f'coordenada [latitud,longitud] {conta} : {ci[0]},{ci[1]}')
                        if ci[1] > sur[0]:
                            sur[0] = ci[1]
                            sur[1] = conta
                        
                        if ci[1] < occ[0]:
                            occ[0] = ci[1]
                            occ[1] = conta
                        conta += 1      
                    print(f'La coordenada {sur[1]} es la que está más al sur')
                    print(f'La coordenada {occ[1]} es la que está más al occidente ')            
                    sopc = int(input('Presione 1,2 o 3 para actualizar la respectiva coordenada\npresione 0 para regresar al menu: '))  
                    if sopc >0 and sopc <=3:
                        MatCoor[sopc-1][0], MatCoor[sopc-1][1], fcoor = incoord(sopc)                
                        if fcoor == -1:
                            break
                    elif sopc == 0:
                        pass
                    else:
                        print('Error actualización')            
                        break
                if fcoor == -1:
                    break
                fcoor = 1
                os.system ("cls")
                print(" ")
                print("MENU DE OPCIONES")
                print(" ")
                for i in range (7):
                    print(f"{i+1}. ", lista[i])
            
            elif opcion_ingresada == 3:
                print("Usted ha elegido la opción ",opcion_ingresada)
                break

            elif opcion_ingresada == 4: 
                print("Usted ha elegido la opción ",opcion_ingresada)
                break
            
            elif opcion_ingresada == 5:
                print("Usted ha elegido la opción ",opcion_ingresada)
                break

            # Se evalúa si la opción elegida es opción favorita (6)
            elif opcion_ingresada == 6:
                opcion_favorita = int(input("Seleccione opción favorita: "))

                # Se evalúa si la opciòn favorita ingresada está del 1 al 5, sino se imprime mensaje de Error y termina el programa
                if opcion_favorita in range (1,6):
                    
                    # Si la opción es válida se modifica la posición de la opción favorita, sino se se imprime mensaje de Error y termina el programa
                    if opcion_favorita == 1:

                        #Se invoca la función adivinanza para confirmar la opción favorita
                        b = adivinanza()
                        # Se llama a la función op_favorita a la cual se le ingresan los argumentos b, opcion_favorita y la lista
                        op_favorita(b,opcion_favorita,lista)

                    elif opcion_favorita == 2:
                        b = adivinanza()
                        op_favorita(b,opcion_favorita,lista)

                    elif opcion_favorita == 3:
                        b = adivinanza()
                        op_favorita(b,opcion_favorita,lista)

                    elif opcion_favorita == 4:
                        b = adivinanza()
                        op_favorita(b,opcion_favorita,lista)

                    elif opcion_favorita == 5:
                        b = adivinanza()
                        op_favorita(b,opcion_favorita,lista)
                    else:
                        print("Error")
                        break
                else:
                    print("Error")
                    break                 
            elif opcion_ingresada == 7: #Si se selecciona la opción 7, se limpia el menú, sale mensaje de cierre de sesión y termina programa
                os.system("cls")
                print("hasta pronto")
                break
        else:
            print(" ")
            print("Error")
            print(" ")
            
            #se establece contador para intentos fallidos
            n = n + 1
            
            if n == 3:
                break
            else:
                print("MENU DE OPCIONES")
                print(" ")
                for i in range (7):
                    print(f"{i+1}. ", lista[i])

    except ValueError: #Si se ingresa un valor diferente de entero y se cierra el programa
            print("Error")