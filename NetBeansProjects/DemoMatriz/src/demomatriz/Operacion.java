package demomatriz;

import java.util.Scanner;


public class Operacion {
 
    
    public void obternerMatriz (){
    
    Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa la cantidad de filas:  ");
        int f = sc.nextInt();
            System.out.println("Ingresa la cuntidad de columnas: ");
        int c = sc.nextInt();
          //Creo la matriz de filas y columnas
        int mat[][] = new int[f][c];
            int numero;
        
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
