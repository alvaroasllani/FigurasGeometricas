package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Figura rectangulo;
        Figura circulo;
        Figura cuadrado;
        int cont = 0, b = 0, a = 0, l = 0;
        int r = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcular Area:");
        System.out.println("Ingrese 1 para el rectangulo, ingrese 2 para el circulo, ingrese 3 para el cuadrado");
        String num = scanner.nextLine();
        cont = Integer.parseInt(num);
        switch (cont) {
            case 1:
                System.out.print("Ingrese base: ");
                String valor = scanner.nextLine();
                b = Integer.parseInt(valor);

                System.out.print("ingrese altura : ");
                valor = scanner.nextLine();
                a = Integer.parseInt(valor);
                rectangulo = new Rectangulo(b, a);
                System.out.println("Su area es: " + rectangulo.obtenerArea());
                break;
            case 2:
                System.out.print("ingrese radio : ");
                String val = scanner.nextLine();
                r = Integer.parseInt(val);
                circulo = new Circulo(r);
                System.out.println("su area es " + circulo.obtenerArea());
                break;
            case 3:
                System.out.print("ingrese lado : ");
                String valo = scanner.nextLine();
                l = Integer.parseInt(valo);
                cuadrado = new Cuadrado(l);
                System.out.println("su area es " + cuadrado.obtenerArea());
                break;
        }


    }
}

