import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
    // for <-- laço de repetição Comparable
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite qual tabuada você quer: ");
    int tabuada = scan.nextInt();
    
    
    for (int i =0; i<=10; i= i + 1) {
        int resultado = tabuada * i;
        System.out.println(tabuada + " X " + i + " = "+ resultado);
  }
    
    System.out.println("Acabou!!");   
   
   
   
    }
}
