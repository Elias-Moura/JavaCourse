import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        double mediaAvaliacao = 0;
        double nota = 0;
        int quantidadeLoops = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar ");
            nota = leitura.nextDouble();
            if (nota == -1) {
                break;
            }
            quantidadeLoops += 1 ;
            mediaAvaliacao += nota;
        }

        mediaAvaliacao = mediaAvaliacao/quantidadeLoops;

        System.out.println(String.format("A média foi: %.2f", mediaAvaliacao));


    }
}
