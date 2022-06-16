import pandas as pd
import csv
import json
df = pd.read_csv("Mision TIC 2022\Ciclo 1 - Python\Semana 07\GLOBANT.csv")
#print(df.head())
Fecha = df["Date"]
comportamiento = []

for i in range(len(df)):
    if (df["Close"][i] - df["Open"][i]) > 0:
        comportamiento.append("SUBE")
    elif (df["Close"][i] - df["Open"][i]) < 0:
        comportamiento.append("BAJA")
    else:
        comportamiento.append("ESTABLE")

high_low = []
for i in range(len(df)):
    high_low.append((df["High"][i] - df["Low"][i])/2)

with open("Mision TIC 2022\\Ciclo 1 - Python\\Semana 07\\analisis_archivo.csv","w") as csvfile:
    csvfile.write("Fecha"+"\t"+"Comportamiento de la accion"+"\t"+"Punto medio HIGH-LOW"+"\n")
    for i in range(len(high_low)):
        if i < len(high_low):
            csvfile.write(Fecha[i]+"\t"+comportamiento[i]+"\t"+str(high_low[i])+"\n")
        else:
            csvfile.write(Fecha[i]+"\t"+comportamiento[i]+"\t"+str(high_low[i]))


jdf = {}
for i in range(len(df)):
    if df["Low"][i] == min(df["Low"]):
        ind1 = i
jdf["date_lowest_price"] = df["Date"][ind1]
jdf["lowest_price"] = df["Low"][ind1]
for i in range(len(df)):
    if df["High"][i] == max(df["High"]):
        ind1 = i
jdf["date_highest_price"] = df["Date"][ind1]
jdf["highest_price"] = df["High"][ind1]
jdf["cantidad_veces_baja"] = comportamiento.count("BAJA")
jdf["cantidad_veces_sube"] = comportamiento.count("SUBE")
jdf["cantidad_veces_estable"] = comportamiento.count("ESTABLE")
#print(jdf)

with open("Mision TIC 2022\\Ciclo 1 - Python\\Semana 07\\detalles.json","w") as jsonfile:
    json.dump(jdf,jsonfile)

