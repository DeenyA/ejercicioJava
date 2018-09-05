package multiplicacion;

import java.util.Scanner;

public class Operacion {

    public void obternerMatriz() {

        Scanner sc = new Scanner(System.in);
       
        System.out.println("Ingresa la cantidad de filas de A:");
        int f = sc.nextInt();
        System.out.println("Ingresa la cantida de columnas de A: ");
        int c = sc.nextInt();
        int mat[][] = new int[f][c];

        System.out.println("Segunda Matriz ");
        System.out.println("Ingresa el numero de filas de B: ");
        int f1 = sc.nextInt();
        System.out.println("Ingresa el numero de columnas de B");
        int c1 = sc.nextInt();
        int mat2[][] = new int[f1][c1];
        int f3 = f;
        int c3 = c1; 
            int fil_m1 = mat.length;
            int col_m1 = mat[0].length;
 
         int fil_m2 = mat.length;
         int col_m2 = mat2[0].length;
         int multiplicacion [][] = new int [fil_m1][col_m2];
        
        if (c == f1) {
         // Arreglo A
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    //Solicitamos la serie de numeros
                    System.out.print("Ingresa valor de A :  ");
                    int nu = sc.nextInt();
                    mat[i][j] = nu;
                }
            }
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(mat[i][j] + "\t");
                }
                System.out.println();
            }
                            //TRANSPUESTA
            for (int i = 0; i <= f1 - 1; i++) {
                for (int j = 0; j <= c1 - 1; j++) {
                    System.out.print("Ingresa valor B:  ");
                    mat2[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i <= f1 - 1; i++) {
            for (int j = 0; j <= c1 - 1; j++) {
                System.out.print(mat2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("La multiplicación es :");
                for(int i =0;i < fil_m1;i++ ){
               for(int j = 0;j<col_m2;j++){
             for(int k = 0;k<col_m1;k++) {
                 multiplicacion[i][j] = multiplicacion[i][j] + mat[i][k] * mat2[k][j];
             }
               System.out.print(multiplicacion [i][j] +  " \t");
           }
             System.out.println();   
         }
        } else {
         System.out.println("Tienen que ser de la misma dimención que tu columan");
      }
    }
}
