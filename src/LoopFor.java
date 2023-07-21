import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao= 0;
        double nota = 0;
        int totalDeNotas = 3;

        for (int i = 0; i < totalDeNotas; i++) {
            System.out.println("Diga sua avaliação para o filme ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        mediaAvaliacao = mediaAvaliacao / totalDeNotas;
        System.out.println(String.format("Média de avaliações: %.2f", mediaAvaliacao));
    }
}
