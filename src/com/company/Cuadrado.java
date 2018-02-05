package com.company;

public class Cuadrado extends Figura {
    public Cuadrado(int lado) {
        super(lado);
    }

    public double obtenerArea() {
        return Math.pow(lado, 2);
    }
}
