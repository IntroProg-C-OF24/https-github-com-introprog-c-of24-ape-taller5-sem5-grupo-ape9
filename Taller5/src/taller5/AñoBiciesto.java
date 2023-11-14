package taller5;
import java.util.Scanner;
public class AñoBiciesto {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        int anio;
                
        System.out.println("Ingresar el año: ");
        anio = teclado.nextInt();
        
        if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
           System.out.println("El año es Bisiesto");
        }
    }
}
