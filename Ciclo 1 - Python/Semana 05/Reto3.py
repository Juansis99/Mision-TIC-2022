import random
import numpy as np
texto = "Today is Caturday!"
# Funcion para encriptar.
men_lista = []
men_lista_cod = []
men_lista_desord = []
men_lista_desord_cod = []
array_final = []
i = 2
while i**2 < len(texto):
    i += 1
for a in range(i**2):
    if a <= len(texto)-1:
        men_lista.append(texto[a])
        men_lista_cod.append(ord(men_lista[a]))
    else:
        men_lista.append("_")
        men_lista_cod.append(ord(men_lista[a]))
clave = list(range(i**2))
random.shuffle(clave)
for a in range(i**2):
    men_lista_desord.append(men_lista[clave[a]])
    men_lista_desord_cod.append(ord(men_lista[clave[a]]))
a = 0
for f in range(i):
    array_final.append([])
    for c in range(i):
        array_final[f].append(men_lista_desord_cod[a])
        a += 1
print(clave)
print(men_lista_desord)
print(men_lista_desord_cod)
print(array_final)

array_encriptado = array_final
clave = clave
# Funcion para desencriptar
texto_lista_cod = []
texto_lista_desord = []
texto_lista = list(range(len(array_encriptado)**2))
a = 0
for f in range(len(array_encriptado)):
    for c in range(len(array_encriptado)):
        texto_lista_cod.append(array_encriptado[f][c])
        texto_lista_desord.append(chr(texto_lista_cod[a]))
        a += 1
a=0
for i in clave:
    texto_lista[i] = texto_lista_desord[a]
    a += 1
while texto_lista[-1] == "_":
    texto_lista.pop(-1)
texto = "".join(texto_lista)

print(texto_lista_cod)
print(texto_lista_desord)
print(texto_lista)
print(texto)