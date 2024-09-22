import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Você é homem ou mulher? Digite \"1\" se for mulher e digite \"2\" se for homem: ");
        String sexo = scanner.nextLine();

        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();

        System.out.print("Qual o valor das suas compras? R$ ");
        float valorCompras = scanner.nextFloat();

        float desconto = 0;

        if (sexo.equals("1")) {
            desconto = 0.05f;
        } else if (sexo.equals("2")) {
            desconto = 0.13f;
        } else {
            System.out.println("Opção de sexo inválida. Nenhum desconto será aplicado.");
        }

        float valorComDesconto = valorCompras - (valorCompras * desconto);

        System.out.println("\nOlá, " + nome + "!");
        System.out.printf("O valor total das suas compras era R$%.2f.%n", valorCompras);
        System.out.printf("Com o desconto de %.0f%%, você pagará R$%.2f.%n", desconto * 100, valorComDesconto);
    }
}
