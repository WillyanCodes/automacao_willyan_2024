import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite algum número: ");
        
        float n1 = scan.nextFloat();
        
        
        if (n1%2!=0) {
        
            System.out.println("Seu número é ímpar.");
            
            
        } else {
            System.out.println("Seu número é par.");
        
}
    }
}
