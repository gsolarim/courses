name = "Gabriel"
print(name)
print(type(name)) # tipo str

caracter = "G"
print(caracter)
print(type(caracter)) # tipo str

# Cadenas de texto 
name = 'Gabriel'
print(name)
name = '''Gabriel'''
print(name)
name = """Gabriel"""
print(name)

# Cadenas de texto multilínea
full_name = '''Gabriel
Solari'''
print(full_name)

full_name = """Gabriel
Solari"""
print(full_name)

# Indices de cadenas
print(name)
print(name[0])
print(name[1])
print(name[2])
# print(name[20]) Error: index fuera de rango
print(name[-1])

# Concatenación de cadenas
first_name = "Gabriel"
last_name = "Solari"
print(first_name + " " + last_name)
full_name = first_name + " " + last_name
print(full_name)
print(first_name * 5)

# Largo de cadenas
print(len(first_name))
print(len(last_name))

# Metodos
print(first_name.lower())
print(first_name.upper())
last_name = " Solari "
print(last_name.strip())