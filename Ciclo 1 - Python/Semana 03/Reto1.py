Pc = 60.1
Pf = -24.4
Pp = 30.5
Pdes = 2*Pc + 1*Pp + 2*Pf
Psob = 0.6*Pc + 1*Pp + 4*Pf
Psal = 0.5*Pc + 0.7*Pp + 2*Pf
edad = int(input('Indicar la edad del paciente: '))
peso = float(input('Indicar el peso del paciente en kilogramos: '))
if 5 <= edad <= 10:
    if 16 <= peso <= 28:
        dias = int((28-peso)*1000//Psal+1)
        print(f"El estado nutricional del paciente es C y se requieren {dias} días de dieta para que alcance el peso máximo")
    elif peso < 16:
        dias = int((22-peso)*1000//Pdes+1)
        print(f'El estado nutricional del paciente es A y se requieren {dias} días de dieta para que alcance un peso saludable')
    else:
        dias = int((24-peso)*1000//Psob+1)
        print(f'El estado nutricional del paciente es B y se requieren {dias} días de dieta para que alcance un peso saludable')
if 10 < edad <= 13:
    if 30 <= peso <= 50:
        dias = int((50-peso)*1000//Psal+1)
        print(f"El estado nutricional del paciente es C y se requieren {dias} días de dieta para que alcance el peso máximo")
    elif peso < 30:
        dias = int((32-peso)*1000//Pdes+1)
        print(f'El estado nutricional del paciente es A y se requieren {dias} días de dieta para que alcance un peso saludable')
    else:
        dias = int((43-peso)*1000//Psob+1)
        print(f'El estado nutricional del paciente es B y se requieren {dias} días de dieta para que alcance un peso saludable')
if 13 < edad <= 17:
    if 51 <= peso <= 63:
        dias = int((63-peso)*1000//Psal+1)
        print(f"El estado nutricional del paciente es C y se requieren {dias} días de dieta para que alcance el peso máximo")
    elif peso < 51:
        dias = int((56-peso)*1000//Pdes+1)
        print(f'El estado nutricional del paciente es A y se requieren {dias} días de dieta para que alcance un peso saludable')
    else:
        dias = int((58-peso)*1000//Psob+1)
        print(f'El estado nutricional del paciente es B y se requieren {dias} días de dieta para que alcance un peso saludable')
