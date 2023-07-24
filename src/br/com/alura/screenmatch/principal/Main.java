package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Top Gun", 1970);
        meuFilme.setDuracaoEmMinutos(210);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println(meuFilme.pegaMediaAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());

        Filme outroFilme = new Filme("Corrida Maluca",1999);
        outroFilme.setDuracaoEmMinutos(40);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        Serie lost = new Serie("Lost",2000);
        lost.setTemporadas(5);

        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setVisualicoes(300);
        filtro.filtra(episodio);

        Filme eliasFilme = new Filme("Javao da massa", 2023);
        eliasFilme.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(eliasFilme);

        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(0));
    }

}