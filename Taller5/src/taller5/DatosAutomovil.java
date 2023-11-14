/*
Problema 13
Elaborar una solución que permita leer los datos de un automóvil (marca, origen y costo) 
imprima el impuesto por pagar y el precio de venta (incluido el impuesto). 
Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, 
y si es de USA, 8%
*/

package taller5;
import java.util.Scanner;
public class DatosAutomovil {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        String marca, pais;
        double costo, impuesto, total;
        System.out.println("Ingresa la marca de tu carro");
        marca = put.nextLine();
        System.out.println("Ingresa el pais de origen de tu fierro viejo");
        pais = put.nextLine();
        System.out.println("Ingresa el costo del carro");
        costo = put.nextDouble();
        System.out.println("=====DATOS DEL AUTOMOVIL=====");
        System.out.println("Marca: "+marca);
        System.out.println("Pais de Origen: "+pais);
        if (pais.equals("Alemania")){
            impuesto = costo * 0.2;
            total = costo + impuesto;
            System.out.println("Costo: "+costo);
            System.out.println("Impuesto: "+impuesto);
            System.out.println("TOTAL: "+total);
        }    
        else { 
            if (pais.equals("Japon")){
                impuesto = costo * 0.3;
                total = costo + impuesto;
                System.out.println("Costo: "+costo);
                System.out.println("Impuesto: "+impuesto);
                System.out.println("TOTAL: "+total);
            }
            else {
                if (pais.equals("Italia")){
                    impuesto = costo * 0.15;
                    total = costo + impuesto;
                    System.out.println("Costo: "+costo);
                    System.out.println("Impuesto: "+impuesto);
                    System.out.println("TOTAL: "+total);
                }    
                else {
                    if (pais.equals("USA")){
                        impuesto = costo * 0.2;
                        total = costo + impuesto;
                        System.out.println("Costo: "+costo);
                        System.out.println("Impuesto: "+impuesto);
                        System.out.println("TOTAL: "+total);
                    }    
                    else{
                        System.out.println("Costo: "+costo);
                        System.out.println("TOTAL: "+costo);
                    }
                }
            }
        }
    }   
}

    
