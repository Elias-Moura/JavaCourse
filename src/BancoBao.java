import java.util.Scanner;

public class BancoBao {
    public static void main(String[] args) {
        /*
         * Conta Bancária - Exercício básico.
         * */


        Scanner leitor = new Scanner(System.in);

        String nomeCliente = "Elias Moura";
        String tipoConta = "Corrente";
        int validador = 0;
        double saldoDisponivel = 1000.00;
        double valorRecebido;
        double valorASerTransferido;


        System.out.printf("""
                *************************************
                Dados inicias do cliente:
                                
                Nome:           %s
                Tipo de conta:  %s
                Saldo inicial:  R$ %,.2f
                *************************************
                %n""", nomeCliente, tipoConta, saldoDisponivel);


        while (validador != 4) {

            System.out.println("""
                    Operações
                                    
                    1- Consultar saldos
                    2- Receber Valor
                    3- Transferir Valor
                    4- Sair
                    """);

            validador = leitor.nextInt();

            switch (validador) {
                case 1:
                    System.out.printf("Seu saldo é R$ %,.2f%n", saldoDisponivel);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido: ");
                    valorRecebido = Math.abs(leitor.nextDouble());

                    if (valorRecebido > 0) {
                        saldoDisponivel += valorRecebido;
                        System.out.printf("Você depositou R$ %,.2f e seu novo saldo em conta é R$ %,.2f%n", valorRecebido, saldoDisponivel);
                    } else {
                        System.out.println("Você não pode depositar um valor negativa na sua conta.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor que você deseja transferir ");
                    valorASerTransferido = Math.abs(leitor.nextDouble());
                    if (valorASerTransferido > saldoDisponivel) {
                        System.out.printf("""
                                Você não pode transferir R$ %,.2f
                                pois o valor é maior que o valor disponível em conta R$ %,.2f %n"""
                                , valorASerTransferido, saldoDisponivel);
                    } else {
                        saldoDisponivel -= valorASerTransferido;
                        System.out.printf("""
                                Você transferiu R$ %,.2f e o seu novo valor em conta é R$ %,.2f%n
                                """, valorASerTransferido, saldoDisponivel);
                    }
                    break;
            }


        }
    }
}
