package com.company;

public class Circulo extends Figura {

    public Circulo(double radio) {
        super(radio);
    }

    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
