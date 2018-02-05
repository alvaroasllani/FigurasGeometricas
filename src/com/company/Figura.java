package com.company;

abstract public class Figura {
    protected int base, altura, lado;
    protected double radio;

    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Figura(int lado) {
        this.lado = lado;
    }
    public Figura(double radio) {
        this.radio = radio;
    }

     public abstract double obtenerArea();
}
