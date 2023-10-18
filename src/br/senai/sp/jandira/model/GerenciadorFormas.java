package br.senai.sp.jandira.model;

import java.util.Scanner;

public class GerenciadorFormas {

    Scanner scanner = new Scanner(System.in);

    public void menu() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("-----------------------------------");
            System.out.println("1 - Círculo          ");
            System.out.println("2 - Retângulo               ");
            System.out.println("3 - Sair                           ");
            System.out.println("-----------------------------------");

            System.out.print("Escolha uma opção: ");
            int optionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (optionMenu) {
                case 1:
                    System.out.print("Informe o valor do raio do CÍRCULO: ");
                    double raio = scanner.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    circulo.calcularPerimetro();
                    circulo.calcularArea();
                    break;

                case 2:
                    System.out.print("Informe o valor do comprimento do RETÂNGULO: ");
                    double comprimento = scanner.nextDouble();
                    System.out.print("Informe o valor da largura do RETÂNGULO: ");
                    double largura = scanner.nextDouble();
                    Retangulo retangulo = new Retangulo(comprimento, largura);
                    retangulo.calcularPerimetro();
                    retangulo.calcularArea();
                    break;

                case 3:
                    continuar = false;
                    break;

            }
        }

    }
}
