
package Libro.Cap01;
import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class HolaMundoNombre {
    public static void main(String[] args)
    {  
    Scanner scanner = new Scanner (System. in);
   
    System.out.print("Ingrese su nombre: ");
    
    String nom = scanner.nextLine() ;
    
    System.out.println("Hola Mundo: " + nom);
    }
}
