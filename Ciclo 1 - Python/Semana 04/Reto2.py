# Canino o felino mayor desde 9 años
# Equino o bobino mayor desde 16 años
nombres = ["Martin","Milú","Anastasia","Lupita","Tomasa","Pelusa","Genoveva","Motita"]
tipos = ["canino","canino","felino","felino","felino","canino","bobino","roedor"]
edades = [12,9,10,8,9,2,14,1]
pesos = [33,26,4,5,5,6,106.4,0.34]
diccionario = {}
cont_can_fel = 1
beneficiarios_can_fel = {}
beneficiarios_can_fel_alt = {}
cont_equ_bov = 1
beneficiarios_equ_bov = {}
beneficiarios_equ_bov_alt = {}
suma_can_fel = 0
suma_equ_bov = 0
for i in range(len(nombres)):
    diccionario[str(i+1)] = [nombres[i],tipos[i],edades[i],pesos[i]]
for key in diccionario:
    if diccionario[key][1] != "roedor": 
        if ((diccionario[key][1] == "canino" or diccionario[key][1] == "felino") and diccionario[key][2] >= 9):
            beneficiarios_can_fel_alt[str(cont_can_fel)] = diccionario[key]
            beneficiarios_can_fel[str(cont_can_fel)] = [0,0,0]
            beneficiarios_can_fel[str(cont_can_fel)][0] = diccionario[key][0]
            beneficiarios_can_fel[str(cont_can_fel)][1] = diccionario[key][1]
            beneficiarios_can_fel[str(cont_can_fel)][2] = diccionario[key][3]
            cont_can_fel += 1
        elif ((diccionario[key][1] == "equino" or diccionario[key][1] == "bobino") and diccionario[key][2] >= 16):
            beneficiarios_equ_bov_alt[str(cont_can_fel)] = diccionario[key]
            beneficiarios_equ_bov[str(cont_can_fel)] = [0,0,0]
            beneficiarios_equ_bov[str(cont_can_fel)][0] = diccionario[key][0]
            beneficiarios_equ_bov[str(cont_can_fel)][1] = diccionario[key][1]
            beneficiarios_equ_bov[str(cont_can_fel)][2] = diccionario[key][3]
            cont_equ_bov += 1
for i in range(len(beneficiarios_can_fel)):
    suma_can_fel += beneficiarios_can_fel_alt[str(i+1)][2]
if suma_can_fel == 0:
    promedio_can_fel = None
else:
    promedio_can_fel = suma_can_fel/len(beneficiarios_can_fel)
for i in range(len(beneficiarios_equ_bov)):
    suma_equ_bov += beneficiarios_equ_bov_alt[str(i+1)][2]
if suma_equ_bov == 0:
    promedio_equ_bov = None
else:
    promedio_equ_bov = suma_equ_bov/len(beneficiarios_can_fel)
print(diccionario)
print(beneficiarios_can_fel)
print(beneficiarios_equ_bov)
print(promedio_can_fel)
print(promedio_equ_bov)