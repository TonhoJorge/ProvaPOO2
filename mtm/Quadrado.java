package Senai.prog_oo_java.prova2.mtm;

public class Quadrado extends Forma {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea () {
        return lado * 2;
    }
}
