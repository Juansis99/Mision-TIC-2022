import json

mi_str_json = '{"nombre":"Adriana Lucia","edad":"15","ciudad":"Medellin"}'
mi_str_json2 = {
                "nombre":"Adriana Lucia",
                "edad":"15",
                "ciudad":"Medellin"
                }


mi_json = json.loads(mi_str_json)
print(mi_json)
print("El nombre es:", mi_json["nombre"])

print(mi_str_json2["nombre"])

with open(".\\Mision TIC 2022\\Ciclo 1 - Python\\Semana 06\\Archivo.json") as unjson:
    print(unjson.read())
