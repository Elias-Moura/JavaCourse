package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Top Gun", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Corrida Maluca",1999);
        outroFilme.avalia(6);
        Filme eliasFilme = new Filme("Javao da massa", 2023);
        eliasFilme.avalia(10);
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(eliasFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme filme) {
                System.out.println("classificação " + filme.getClassificacao());
            }
        }

    }
}
