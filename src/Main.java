import br.com.alura.screenmatch.modelos.Filme;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Top Gun");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(210);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println(meuFilme.pegaMediaAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());

    }

}