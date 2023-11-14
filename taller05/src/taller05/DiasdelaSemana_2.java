package taller05;

import java.util.Scanner;

public class DiasdelaSemana_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia;
        System.out.println("Ingrese numero del dia");
        dia = teclado.nextInt();
        if (dia == 1)
            System.out.println("lunes");
        else
            if (dia == 2)
                System.out.println("Martes");
            else
                if (dia == 3 )
                    System.out.println("Miercoles");
                else
                    if (dia == 4)
                        System.out.println("Jueves");
                    else
                        if (dia == 5)
                            System.out.println("Viernes");
                        else
                            if (dia == 6)
                                System.out.println("Sabado");
                           else
                                if (dia == 7)
                                    System.out.println("Domingo");
                                else
                                    if (dia > 7)
                                        System.out.println("El numero ingresado no existe");
                                            
                                
    }                                
}    

