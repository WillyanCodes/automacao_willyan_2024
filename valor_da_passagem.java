import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Quantos kms você percorrerá? ");
        
        double kms = scan.nextDouble();
        
        
        if  (kms<=200) {
            
            double soma1 = (kms * 0.50);
            System.out.println("O preço da passagem será: R$"+ soma1);
            
            
        } else {
            
            double soma2 = (kms * 0.45);
            System.out.println("O preço da passagem será: R$"+ soma2);
        
}
    }
}
