import java.util.*;

public class Main
{
    public static void main(String[] args) {
 
   
   Scanner scan = new Scanner(System.in);
   System.out.print("Digite o primeiro valor: ");
   int primeiro_valor = scan.nextInt();
   System.out.print("Digite o ultimo valor: ");
   int ultimo_valor = scan.nextInt();
   System.out.print("Digite o incremento: ");
   int incremento = scan.nextInt();
   
   int x = primeiro_valor;
   
   while (x<ultimo_valor) {
       System.out.println(x);
       x = x+incremento;
   }
    System.out.println("Acabou!");
    
  }
    
    
   
   
   
    }

