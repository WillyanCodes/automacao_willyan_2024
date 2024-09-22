import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a 1 nota: ");
        
        float n1 = scan.nextFloat();
        
        System.out.println("Digite a 2 nota: ");
        float n2 = scan.nextFloat();
        
        System.out.println("Digite a 3 nota: ");
        float n3 = scan.nextFloat();
        
        System.out.println("Digite a 4 nota: ");
        float n4 = scan.nextFloat();
        
        float media = n1+n2+n3+n4;
        
        if (media>=7) {
            System.out.println("Você passou.");
            
        } else {
            System.out.println("Você reprovou. ");
        
}

        
   
   
   
   
   
   
    }
}
