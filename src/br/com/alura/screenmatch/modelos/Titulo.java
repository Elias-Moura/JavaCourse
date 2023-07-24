package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;

    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.printf("br.com.alura.screenmatch.modelos.Filme: %s \n", this.nome);
        System.out.printf("Ano de lançamento: %d \n", this.anoDeLancamento);
    }

    public void avalia(double nota) {
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }

    public double pegaMediaAvaliacoes(){
        return this.somaDasAvaliacoes / this.totalDeAvaliacoes;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
