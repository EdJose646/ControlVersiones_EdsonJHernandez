/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlversiones_edsonjhernandez;

/**
 *
 * @author Edson
 */
import java.util.Scanner;
public class ControlVersiones_EdsonJHernandez {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Calcular promedio");
            System.out.println("2. Saludar");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> calcularPromedio();
                case 2 -> System.out.println("¡Hola! Bienvenido al programa de control de versiones.");
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 3);
    }

    public static void calcularPromedio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la primera nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        double n2 = sc.nextDouble();
        double promedio = (n1 + n2) / 2;
        System.out.println("El promedio es: " + promedio);
    }
}
