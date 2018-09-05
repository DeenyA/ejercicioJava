package transpuesta;

import java.util.Random;
import java.util.Scanner;

public class Operacion {
    static int f = 0;
    static int c = 0;
    Scanner sc = new Scanner(System.in); 
    public void obtenerDimención (){
        
        System.out.println("Ingresa la cantidad de filas:");
        f = sc.nextInt();
        System.out.println("Ingresa la cantida de columnas: ");
        c = sc.nextInt();
        int mat [][] = new int [f][c];
      
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                //Solicitamos la serie de numeros
                    System.out.print("Ingresa el numero:  ");
                    int nu = sc.nextInt();
                        mat[i][j] = nu;
           } 
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
               System.out.print(mat[i][j] + "\t" );
            }
            System.out.println();
        }
        
       
       System.out.println("La matriz transpuesta es: ");
        for(int j = 0; j < mat[0].length; j++){
            for(int i = 0; i < mat.length; i++){
                System.out.print(" " + mat[i][j] + " ");
            }
            System.out.println();
        }
        
        
         if (f != 0 && c != 0 ){
             
               for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                //Solicitamos la serie de numeros
                    System.out.print("Ingresa el numero:  ");
                    int nu = sc.nextInt();
                        mat[i][j] = nu;
           } 
        }
            for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
               System.out.print(mat[i][j] + "\t" );
            }
            System.out.println();
        }
        }
 
    }
 
}
