package model;

public abstract class Eletronico {

    private String nome;
    private double precoBase;
    private String marca;


    //Construtor
    public Eletronico(String nome, double precoBase, String marca) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.marca = marca;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public String getMarca() {
        return marca;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Metodo abstrato
    public abstract double calcularPrecoFinal();

    //Metodo concreto
    public void exibirDetalhes() {
        IO.println();
    }
}
