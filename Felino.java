package clases;

import java.util.Scanner;

public class Felino {
    String tipo;
    double peso;
    double altura;
    String color;
    
    Felino(String tipo, double peso, double altura, String color) {
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.color = color;
    }

    void saludar() {
        System.out.println("Hola,  " + this.tipo);
    }

    void mostrarInfo() {
        System.out.println("Tipo: " + this.tipo + "\nPeso: " + this.peso + "\nAltura: " + this.altura + "\nColor: " + this.color);
    }

    void comer() {
        System.out.println("Está comiendo");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Felino 1
        System.out.println("--- Felino 1 ---");
        System.out.print("Tipo: ");
        String tipo1 = sc.nextLine();
        System.out.print("Peso: ");
        double peso1 = sc.nextDouble();
        System.out.print("Altura: ");
        double altura1 = sc.nextDouble();
        sc.nextLine(); // limpiar 
        System.out.print("Color: ");
        String color1 = sc.nextLine();
        Felino f1 = new Felino(tipo1, peso1, altura1, color1);
        f1.saludar();
        f1.mostrarInfo();
        f1.comer();

        // Felino 2
        System.out.println("\n--- Felino 2 ---");
        System.out.print("Tipo: ");
        String tipo2 = sc.nextLine();
        System.out.print("Peso: ");
        double peso2 = sc.nextDouble();
        System.out.print("Altura: ");
        double altura2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Color: ");
        String color2 = sc.nextLine();
        Felino f2 = new Felino(tipo2, peso2, altura2, color2);
        f2.saludar();
        f2.mostrarInfo();
        f2.comer();

        // Felino 3
        System.out.println("\n--- Felino 3 ---");
        System.out.print("Tipo: ");
        String tipo3 = sc.nextLine();
        System.out.print("Peso: ");
        double peso3 = sc.nextDouble();
        System.out.print("Altura: ");
        double altura3 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Color: ");
        String color3 = sc.nextLine();
        Felino f3 = new Felino(tipo3, peso3, altura3, color3);
        f3.saludar();
        f3.mostrarInfo();
        f3.comer();

        sc.close();
    }
}
