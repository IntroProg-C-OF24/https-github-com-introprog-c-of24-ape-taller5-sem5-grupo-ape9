package taller5;

import java.util.Scanner;

public class PlanilladeLuz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        double costo, consumo, descuento, total;
        System.out.println("Ingrese la edad del usuario: ");
        edad = teclado.nextInt();
        System.out.println("Ingrezar el valor de costo de kilovatio/hora");
        costo = teclado.nextDouble();
        System.out.println("Ingresar el valor de consumo por mes");
        consumo = teclado.nextDouble();
        if (edad > 65) {
            descuento = (costo * consumo) * 0.1;
            total = costo * consumo - descuento;
        } else {
            total = costo * consumo;
        }
        System.out.println("El valor a cancelar es: " + total);
    }

}
