
package figuras;

import java.util.Scanner;


public class Figuras {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa tus seis digitos a sumar: "); 
         int arr[] = new int [7];
         int s; 
         int sum = 0;
         for(int a=0;a<=6; a ++){
             s = sc.nextInt();
             arr[a]= s;
         }
         for(int b=0;b<=6; b ++ )
         {
            sum += arr[b];
         }
         if (sum % 2 ==0){
            System.out.println("Es par");
             System.out.println("El resultado es: ");
             for(int c =0; c<=6; c ++)
             {
                 System.out.print(arr[c]+" "+ arr[c]+ " ");
             }
    }
         else{
             
                 System.out.println("es impar");
                 System.out.println("El resultado es : ");
                 for (int i = 6; i >= 0; i--) {
                     System.out.print(arr[i]+" "+ arr[i]+ " ");
             }
                  for(int c =0; c<=6; c ++)
             {
                 System.out.print(arr[c]+" "+ arr[c]+ " ");
             }
                 }
    }
    
}
