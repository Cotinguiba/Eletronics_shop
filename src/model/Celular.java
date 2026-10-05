package model;

public class Celular extends Eletronico implements Garantia {

    //Atributo Proprio da classe
    private int memoriaRam;

    public Celular(String nome, double precoBase, String marca, int memoriaRam) {
        super(nome, precoBase, marca);
        this.memoriaRam = memoriaRam;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    //Preço base mais 5% de imposto
    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.05;
    }


    @Override
    public int getPrazoGarantiaMeses() {
        return 12;
    }

    @Override
    public String getTermosGarantia() {
        return "Garantia de " + getPrazoGarantiaMeses() + " meses contra defeitos de fabrica, garantia oferecida pelo fabricante !";
    }
}
