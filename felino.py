class Felino:
    def __init__(self, tipo, peso, altura, color):
        self.tipo = tipo
        self.peso = peso
        self.altura = altura
        self.color = color

    def saludar(self):
        print(f"    Hola, {self.tipo}")

    def mostrarInfo(self):
        print("     Tipo:", self.tipo,
              "\n     Peso:", self.peso, 
              "\n     Altura:", self.altura,
              "\n     Color:", self.color)

    def comer(self):
        print(" Está comiendo")


# Felino 1
print("--- Felino 1 ---")
tipo1 = input("Tipo de felino: ")
peso1 = float(input("Peso: "))
altura1 = float(input("Altura: "))
color1 = input("Color: ")
felino1 = Felino(tipo1, peso1, altura1, color1)
felino1.saludar()
felino1.mostrarInfo()
felino1.comer()

# Felino 2
print("\n--- Felino 2 ---")
tipo2 = input("Tipo de felino: ")
peso2 = float(input("Peso: "))
altura2 = float(input("Altura: "))
color2 = input("Color: ")
felino2 = Felino(tipo2, peso2, altura2, color2)
felino2.saludar()
felino2.mostrarInfo()
felino2.comer()

# Felino 3
print("\n--- Felino 3 ---")
tipo3 = input("Tipo de felino: ")
peso3 = float(input("Peso: "))
altura3 = float(input("Altura: "))
color3 = input("Color: ")
felino3 = Felino(tipo3, peso3, altura3, color3)
felino3.saludar()
felino3.mostrarInfo()
felino3.comer()
