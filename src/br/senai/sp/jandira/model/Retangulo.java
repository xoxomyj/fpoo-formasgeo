package br.senai.sp.jandira.model;

public class Retangulo implements FormasGeometricas{
    private double comprimento;
    private double largura;

    public Retangulo(double largura, double comprimento) {
        this.comprimento = comprimento;
        this.largura = largura;


    }

    @Override
    public void calcularArea() {
        double area = comprimento * largura;
        System.out.println("A área do PERÍMETRO é: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * (comprimento + largura);
        System.out.println("O perímetro do RETÂNGULO é: " + perimetro);
    }
}
