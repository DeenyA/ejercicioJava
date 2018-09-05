import java.util.Arrays;
import java.util.Scanner;

public class BetoTestSort{
    
public static void main(String[] args){
    
 Scanner in = new Scanner(System.in);

 System.out.print("Ingresa una palabra: ");
 String world = in.nextLine();
 char letter [] = new char [world.length()];

 for(int i = 0; i < world.length() ; i++)
 {
     letter[i]=world.charAt(i);
 }
 Arrays.sort(letter);
 System.out.println(letter);
}//end main
}//end BetoTestSort