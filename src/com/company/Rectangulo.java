package com.company;

public class Rectangulo extends Figura {

    public Rectangulo(int base, int altura) {
        super(base, altura);

    }
    public double obtenerArea() {
        return base * altura;
    }

}

