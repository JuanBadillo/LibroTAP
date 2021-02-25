/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;
import java.util.Scanner;
/**
 *
 * @author juanm
 */
public class EsMayorQue21 {
    public static void main(String[] args)
        {
        // esta clase permite leer datos por teclado
        Scanner scanner = new Scanner (System. in);
        // mensaje para el usuario
        System.out.print("Ingrese su nombre: ");
        // leemos un valor entero por teclado
        String nom = scanner.nextLine() ;
        // mostramos un mensaje y luego el valor leido
        System.out.println("Hola Mundo: " + nom);

        }
}
