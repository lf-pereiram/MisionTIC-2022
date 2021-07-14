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