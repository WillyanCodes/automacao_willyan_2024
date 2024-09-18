import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite algum ano: ");
        
        int ano = scan.nextInt();
        
        
        if  ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
        
            System.out.println(ano + " é bisssexto.");
            
            
        } else {
            System.out.println(ano + " não é bissexto.");
        
}
    }
}
