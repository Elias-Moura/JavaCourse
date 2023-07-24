package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {



    private String diretor;
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    @Override
    public int getClassificacao() {
        return (int) pegaMediaAvaliacoes();
    }

    @Override
    public String toString() {
        return String.format("Filme %s (%d)", this.getNome(), this.getAnoDeLancamento());
    }
}
