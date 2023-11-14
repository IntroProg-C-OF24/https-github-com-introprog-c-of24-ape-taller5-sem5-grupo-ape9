package taller05;

import java.util.Scanner;

public class costodePedido {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad;
        double costo, costoUnitario;
        String descripcion;
        System.out.println("Ingresar descripcion del articulo: ");
        descripcion = teclado.nextLine();
        System.out.println("Ingrese la cantida de unidades");
        cantidad = teclado.nextInt();
        System.out.println("Ingrese el costounitario");
        costoUnitario = teclado.nextDouble();
        costo = cantidad * costoUnitario;
        if (cantidad > 50) {
            costo *= 0.85;        
            System.out.println("Descuento del 15% costo final es : " + cantidad + descripcion + "es de " + costo);
        }else{
            System.out.println("El costo " + cantidad + descripcion + "es de" + costo);
        }
    }
}    
