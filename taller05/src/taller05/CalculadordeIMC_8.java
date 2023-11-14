package taller05;

import java.util.Scanner;

public class CalculadordeIMC_8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, peso, imc;
        System.out.println("Ingres altura de la persona");
        altura = teclado.nextDouble();
        System.out.println("Ingrese peso de la persona");
        peso = teclado.nextDouble();
        imc = peso / (Math.pow(altura, 2));
        if (imc < 18) {
            System.out.println("tiene bajo peso");
        } else if (imc < 25) {
            System.out.println("Su peso es saludable");
        } else if (imc < 30) {
            System.out.println("Tiene sobrepeso");
        } else {
            System.out.println("Tienes obesidad");
        }

    }

}
