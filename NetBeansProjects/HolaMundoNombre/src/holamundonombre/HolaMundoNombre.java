
package holamundonombre;

import java.util.Scanner;

public class HolaMundoNombre {

    public static void main(String[] args) {
        //Esta clase permite ler datos por el teclado
        Scanner scanner = new Scanner (System.in);
        
        //mensaje para el usurio
        System.out.println("Ingrese nombre : " + "Ingrese edad: " + " Ingrese altura:");
        
        //leemos un valor entero por teclado
        String nom = scanner.nextLine();
        int edad = scanner.nextInt();
        double altura = scanner.nextDouble();
        
        
        //mostramos un mensaje y luego el valor leido
        System.out.println("Nombre: "+ nom + " Edad: "+ edad + "  Altura: " + altura );
        
    }
    
}
//