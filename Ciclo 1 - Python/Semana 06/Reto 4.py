#Texto = lista_texto # linea para asegurar la entrada del reto
Texto = ["Hola,", "hola", "holas","-", "hola", "hola", "hola", "hola", " hola,", "Hola,", "HoLa,", "HOLA", "cabra", " cabra", "cabra ", "CABRA", "CABRA", "CABRA", "Azul,", " Azul,", "AZUL", "AZul", "Azul,"] # esta linea es a modo de ejmplo de input para el reto
#print(Texto) # visualizacion para verificación
Texto_aux_lista = []
for i in range(len(Texto)):
    Texto_aux = list(Texto[i].lower()) 
    if Texto_aux.count("-") >0:
        Texto_aux.remove("-")
    if Texto_aux.count("¿") >0:
        Texto_aux.remove("¿")
    if Texto_aux.count("?") >0:
        Texto_aux.remove("?")
    if Texto_aux.count(".") >0:
        Texto_aux.remove(".")
    if Texto_aux.count(",") >0:
        Texto_aux.remove(",")
    if Texto_aux.count("¡") >0:
        Texto_aux.remove("¡")
    if Texto_aux.count("!") >0:
        Texto_aux.remove("!")
    if Texto_aux.count(":") >0:
        Texto_aux.remove(":")
    if Texto_aux.count('"') >0:
        Texto_aux.remove('"')
    if Texto_aux.count('–') >0:
        Texto_aux.remove('–')
    if Texto_aux.count('') >0:
        Texto_aux.remove('')
    if Texto_aux.count(' ') >0:
        Texto_aux.remove(' ')
    if len(Texto_aux) != 0:
        Texto_aux_lista.append("".join(Texto_aux))
Texto = Texto_aux_lista
#print(Texto) # visualizacion para verificación
Palabras_unicas = sorted(list(set(Texto)))
print(Palabras_unicas) # visualizacion para verificación
Palabra_conteo = []
for i in Palabras_unicas:
    Palabra_conteo.append([i,Texto.count(i)])
#print(Palabra_conteo) # visualizacion para verificación
num_aux = []
for i in range(len(Palabra_conteo)):
    num_aux.append(Palabra_conteo[i][1])
num_aux = sorted(num_aux)
#print(num_aux) # visualizacion para verificación
list_aux = []
Palabra_conteo_aux = Palabra_conteo
cont_int = 0
cont_aux = -1
cont_ext = len(Palabra_conteo_aux)
while cont_ext > 0:
    for i in range(cont_ext):
        if Palabra_conteo_aux[cont_int][1] == num_aux[cont_aux]:
            list_aux.append(Palabra_conteo_aux[cont_int])
            cont_aux -= 1
            Palabra_conteo_aux.pop(i)
            cont_ext = len(Palabra_conteo_aux)
            cont_int = 0
            #print(Palabra_conteo_aux) # visualizacion para verificación
            break
        else:
            cont_int += 1
Palabra_conteo_ord = list_aux[:3]#ojo cambiar a 20 en el reto
lista_conteo = Palabra_conteo_ord # linea para asegurar la salida del reto
#print(Palabra_conteo_ord) # visualizacion para verificación
