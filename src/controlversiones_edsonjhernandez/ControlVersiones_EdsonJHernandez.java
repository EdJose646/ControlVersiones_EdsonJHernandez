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

        System.out.print("Ingrese la primera nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double n2 = sc.nextDouble();

        double promedio = (n1 + n2) / 2;

        System.out.println("El promedio es: " + promedio);
    }
}
