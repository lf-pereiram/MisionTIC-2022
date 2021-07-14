a = 186
b = 85
c = 91
d = 4

bool1 = True
bool2= False

# Operadores de Relación
print(a<b)
print(a==c)
print(d<b)
print(d!=a)
print(c>=b)
print((b*d)<a)

# Operadores Aritméticos
e = a+c
print(e)

f = e*d
print(f)

g = (b-d)/(c*c)
print(g)

h = (g - ((c+d)*d))/3
print(h)

x = ((f+h-a)*-2)/5
print(x)

y = x-d
print(y)

z = f/3
print(z)

p = (((a*10)-e)*2)/5
print(p)

# Operadores booleanos
i = (a<c) and bool1
print(i)

j = ((a+h)!=e) or bool2
print(j)

k = (a==a) and bool1
print(k)

l = (a<=h) and bool1
print(l)

m = True or (False and False)
print(m)

print(((((6+1)*6-5)%5)**5-(5-1))/(5-1))