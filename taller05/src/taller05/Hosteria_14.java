package taller05;

import java.util.Scanner;

public class Hosteria_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dias;
        double costoDiario, descuento, subtotal, total;
        System.out.println("Ingrese los dias que se hospedara ");
        dias = teclado.nextInt();
        System.out.println("Ingrese el costo diario de la habitacion");
        costoDiario = teclado.nextDouble();
        subtotal = dias * costoDiario;
        descuento = 0;
        if (dias > 15)
            descuento = subtotal * 0.2;
        else 
            if (dias >10)
                descuento = subtotal * 0.15;
            else
                if (dias > 5)
                    descuento = subtotal * 0.1;
        total = subtotal - descuento;   
        System.out.println("subtotal: " + subtotal);
        System.out.println("descuento: " + descuento);
        System.out.println("El precio final es: " + total);
         
        
        
                
    }
    
}
