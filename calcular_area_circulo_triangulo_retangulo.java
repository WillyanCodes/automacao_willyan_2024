import java.util.Scanner;
public class Main
{
    public static float media(int n1, int n2, int n3, int n4){
        float resultado = (n1+n2+n3+n4)/4f;
        return resultado;
        
        
    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Digite 1 para calcular a area de um triângulo, 2 para círculo ou 3 para retângulo: ");
	    int opcao = scan.nextInt();
	    
	    if (opcao==1){
	        System.out.println("Vamos calcular a área de um triângulo.");
	        System.out.println("Qual a base do triângulo?");
	        int base_triangulo = scan.nextInt();
	        System.out.println("Qual é a altura do triângulo?");
	        int altura_triangulo = scan.nextInt();
	        float area_triangulo = (base_triangulo*altura_triangulo)/2;
	        System.out.println(area_triangulo);
	        
	    }
	        
	        if (opcao==2){
	            System.out.println("Vamos calcular a área de um círculo.");
	            System.out.println("Qual é o raio do círculo?");
	            float raio_circulo = scan.nextFloat();
	            double area_circulo = 3.14f * Math.pow(raio_circulo, 2);
	            System.out.println(area_circulo);
	        
	    }
	    if (opcao==3){
	        System.out.println("Vamos calcular a área de um retângulo.");
	        System.out.println("Qual a base do retângulo?");
	        float base_retangulo = scan.nextFloat();
	        System.out.println("Qual é a altura do retângulo?");
	        float altura_retangulo = scan.nextFloat();
	        float area_retangulo = base_retangulo*altura_retangulo;
	        System.out.println(area_retangulo);
	    } else {
	        System.out.println("Digite uma opção válida.");
	    }
	    
	}
}



