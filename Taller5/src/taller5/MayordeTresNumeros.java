package taller5;
import java.util.Scanner;
public class MayordeTresNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numA, numB, numC, numAux;
        System.out.println("Ingresar el primer numero"); 
        numA = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        numB = teclado.nextInt();
        System.out.println("Ingrese el tercer numero");
        numC = teclado.nextInt();
        if (numA > numB){
            numAux = numA;
                    
             
        }else
            numAux = numB;
        if (numAux > numC)
            System.out.println("El numero mayor es: " + numA);
        else
            System.out.println("El numero mayor es: " + numB);
        }
    }
