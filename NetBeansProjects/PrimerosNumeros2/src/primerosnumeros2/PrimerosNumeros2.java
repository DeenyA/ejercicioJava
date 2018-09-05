
package primerosnumeros2;

import java.util.Scanner;


public class PrimerosNumeros2 {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa un numero:");
        
        int num = sc.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i ++;
        }
        while (i <=num );
        
    }
    
}
