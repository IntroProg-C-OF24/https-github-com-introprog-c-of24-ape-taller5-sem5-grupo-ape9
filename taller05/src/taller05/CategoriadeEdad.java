package taller05;

import java.util.Scanner;

public class CategoriadeEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese edad del usuario");
        edad = teclado.nextInt();
        if (edad < 12)
            System.out.println("Es niño");
        else
            if (edad < 18)
                System.out.println("Es adolescente");
            else
                System.out.println("Es adulto");
    }
    
}
