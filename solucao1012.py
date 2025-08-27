
valores = input().split()
A = float(valores[0])
B = float(valores[1])
C = float(valores[2])

pi = 3.14159
area_tri_ret = A*C/2
area_circ = pi* C**2
area_trap = ((A+B)* C)/2
area_quad = B**2
area_ret = A*B

print("TRIANGULO: {:.3f} ".format(area_tri_ret))
print("CIRCULO: {:.3f} ".format(area_circ))
print("TRAPEZIO: {:.3f} ".format(area_trap))
print("QUADRADO: {:.3f} ".format(area_quad))
print("RETANGULO: {:.3f} ".format(area_ret))