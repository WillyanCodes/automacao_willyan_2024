import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Qual é a velocidade do carro? ");
        
        float n1 = scan.nextFloat();
        
        
        if (n1>=80) {
            
            float multa = n1*5;
            System.out.println("Você foi multado: R$"+ multa);
            
            
        } else {
            System.out.println("Você não foi multado.");
        
}
    }
}
