package taller05;

import java.util.Scanner;

public class DescuentoenCompras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precio, descuento, precioFinal;
        System.out.println("Ingrese el precio del producto");
        precio = teclado.nextDouble();
        if (precio > 100) {
            descuento = precio * 0.1;
            precioFinal = precio - descuento;
            System.out.println("Descuento del 10%, su precio final es: " + precioFinal);         
        } else {
            precioFinal = precio;
        System.out.println("No tiene descuento, su precio final es: " + precioFinal);    
                
        }
    }
}