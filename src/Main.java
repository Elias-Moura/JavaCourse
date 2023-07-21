import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que você pretende investir: ");
        double valor = scanner.nextDouble();

        System.out.println(String.format("""
                Olá, %s. 
                Tudo bem?
                
                Você tem %d anos de idade.
                
                Seu investimento de R$ %.2f está sendo processado...                
                """, nome, idade, valor));
    }
}