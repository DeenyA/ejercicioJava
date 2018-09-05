
package alphabet;

import java.util.Arrays;
import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa tu palabra: ");    
        String world  = sc.nextLine();
        char a []= new char [world.length()];
        
        for (int i = 0; i < world.length(); i++) {
           a [i] = world.charAt(i);  
        }
      Arrays.sort(a);
      System.out.println(a);
    }
    
}

