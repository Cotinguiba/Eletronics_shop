package model;

public class Notebook extends Eletronico implements Garantia {

    //Atributo proprio da classe
    private String processador;

    public Notebook(String nome, double precoBase, String marca, String processador) {
        super(nome, precoBase, marca);
        this.processador = processador;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    //Preço base mais 10% de imposto
    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.10;
    }

    @Override
    public int getPrazoGarantiaMeses() {
        return 24;
    }

    @Override
    public String getTermosGarantia() {
        return "Garantia de " + getPrazoGarantiaMeses() + " meses contra defeitos de fabrica, garantia oferecida pelo fabricante !";
    }
}
