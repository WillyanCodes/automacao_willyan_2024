import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Digite por quantos dias o carro foi utilizado: ");
	    int dias = scan.nextInt();
	    
	    System.out.println("Digite quantos kms o carro percorreu: ");
	    float kms = scan.nextFloat();
	    
	    float preco = 90*dias + 0.20f*kms;
	    
	    System.out.println("O preço total a pagar é: R$" + preco);
	    
	    
	}
}
