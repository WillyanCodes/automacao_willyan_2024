import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       System.out.print("Digite a medida do lado a: ");
       float a = scan.nextFloat();
       System.out.print("Digite a medida do lado b: ");
       float b = scan.nextFloat();
       System.out.print("Digite a medida do lado c: ");
        float c = scan.nextFloat();
        
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("O triângulo existe");
            
            if (a==b && b==c) {
                System.out.println("O triângulo é equilátero.");
                
            } else {
                if(a==b || b==c || a==c) {
                    System.out.println("O triângulo é isósceles.");
                } else { 
                    System.out.println("O triângulo é escaleno.");
            }
            }
            
        } else {
            System.out.println("O triângulo não existe");
        }
        }
        
        
    }

