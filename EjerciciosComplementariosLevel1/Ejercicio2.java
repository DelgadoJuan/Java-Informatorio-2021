package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("El resultado de " + a + " + " + b + " = " + (a + b));
        System.out.println("El resultado de " + a + " - " + b + " = " + (a - b));
        System.out.println("El resultado de " + a + " * " + b + " = " + (a * b));
        System.out.println("El resultado de " + a + " / " + b + " = " + (a / b));
        System.out.println("El resultado de " + a + " % " + b + " = " + (a % b));
        scan.close();
    }
}