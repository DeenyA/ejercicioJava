package demomatriz;

import java.util.Scanner;

public class DemoMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa la cantidad de filas:  ");
        int filas = sc.nextInt();
            System.out.println("Ingresa la cuntidad de columnas: ");
        int columnas = sc.nextInt();
        //Creo la matriz de filas y columnas
        int mat[][] = new int[filas][columnas];
        //Creamos la matriz transpuesta
          int[][] transpuesta = new int[mat[0].length][mat.length];
            int numero;
                 for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                //Generamos los numero aleatorios
                numero = (int) (Math.random() * 1000);
                //Asignno el numero a la matriz
                mat[i][j] = numero;
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
