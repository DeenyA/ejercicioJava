
package primerosnumeros3;

import java.util.Scanner;

public class PrimerosNumeros3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa una cantidad: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            System.out.println(i);
            
        }
    }
    //Es necesario verificar donde te conviene un ciclo for y un ciclo while
}
