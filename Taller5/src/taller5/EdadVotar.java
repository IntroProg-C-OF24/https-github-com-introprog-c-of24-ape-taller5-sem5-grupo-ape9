package taller5;
import java.util.Scanner;
public class EdadVotar {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Igrese edad");
        edad = teclado.nextInt();
        if (edad >= 18)
            System.out.println("Puede votar");
        else 
            if (edad < 18)
                System.out.println("No puede votar");
    }
    
}
