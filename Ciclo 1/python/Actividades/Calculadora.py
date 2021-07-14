operacion = input("Cual operación deseas realizar? (mult, sum, res, div, pot): ")

#multiplicacion
if operacion == "mult" or operacion == "Mult" or operacion == "MULT":
    a = float(input("numero 1: "))
    b = float(input("numero 2: "))

    print(f"{a}*{b}= ",a*b)
#suma
elif operacion == "sum" or operacion == "Sum" or operacion == "SUM":
    a = float(input("numero 1: "))
    b = float(input("numero 2: "))

    print(f"{a}+{b}= ",a+b)
#resta
elif operacion == "res" or operacion == "Res" or operacion == "RES":
    a = float(input("numero 1: "))
    b = float(input("numero 2: "))

    print(f"{a}-{b}= ",a-b)
#division
elif operacion == "div" or operacion == "Div" or operacion == "DIV":
    a = float(input("numero 1: "))
    b = float(input("numero 2: "))

    print(f"{a}/{b}= ",a/b)
#potencia    
elif operacion == "pot" or operacion == "Pot" or operacion == "POT":
    a = float(input("numero 1: "))
    b = float(input("numero 2: "))

    print(f"{a}^{b}= ",a**b)