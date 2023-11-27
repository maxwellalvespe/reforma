package com.authsecurity.exampleinicial.domain.model;

public class Comodo implements Medicao {
    private double altura;
    private double largura;
    private double comprimento;

    public Comodo(double comprimento,
                  double largura,
                  double altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }


    @Override
    public String toString() {
        return "Comodo{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                '}';
    }
}
