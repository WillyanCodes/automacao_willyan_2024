import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) {
       
   
    Scanner scan = new Scanner(System.in);
    System.out.println("Qual foi a sua nota?");
    float nota = scan.nextFloat();
    
    System.out.println("Qual foi o total de falta que você teve?");
    int faltas = scan.nextInt();
    
    
    
    if (nota >= 6) {
      if (faltas<=20) {
          System.out.println("APROVADO");
          
      } else { 
          System.out.println("REPROVADO");
          
      }
      
      } else { 
          System.out.println("REPROVADO");
          
      }
    }
}


