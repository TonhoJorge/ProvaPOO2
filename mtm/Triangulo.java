package Senai.prog_oo_java.prova2.mtm;

public class Triangulo extends Forma {

    private double base;
    private double altura;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea () {
        return (base * altura) / 2;
    }
}
