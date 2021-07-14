#Entero
num1 = int(input("Ingresa un numero1: "))
print(type(num1))
num2 = int(input("Ingresa un numero2: "))
print(type(num2))
print(f"Suma del num1 + num2 =",num1+num2) 

#Flotante
a = float(input("Ingresa un numero con decimal: "))
print(type(a))
print(f"{a}^3 =",a**3)

#Booleano
a = int(input("Ingresa un número: "))
print(f"Num1:",a)
b = int(input("Ingresa otro número: "))
print(f"Num2:",b)
expr = bool(input("Ingresa un booleano: "))
print(a>b or expr)


#Cadena
cadena = input("Ingresa tú nombre: ")
print(type(cadena))
print(cadena)