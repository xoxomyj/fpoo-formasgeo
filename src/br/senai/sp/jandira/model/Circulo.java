package br.senai.sp.jandira.model;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Circulo implements FormasGeometricas{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do CIRCULO é: " + area);

    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * Math.PI * raio;
        System.out.println("O perímetro do CIRCULO é: " + perimetro);
    }
}
