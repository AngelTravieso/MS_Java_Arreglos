package org.example;

public class EjemploArreglos {
    public static void main(String[] args) {
        // Declarar arreglo de 4 posiciones
        int[] numeros = new int[4];

        // asignar datos a las posiciones del arreglo
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("15"); // -> auto unboxing
        numeros[2] = (int)3L; // -> se puede pero haciendo un cast forzado
        numeros[3] = -1;
        //numeros[4] = 5; // -> esto arroja una excepcion

        // arreglo[indice]
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];
        // int m = numeros[4]; // -> fuera del rango
        
        // longitud
        int longitud = numeros.length;
        System.out.println("longitud = " + longitud);
        
        // acceder al ultimo elemento
        int ultimoElemento = numeros[numeros.length - 1];
        System.out.println("ultimoElemento = " + ultimoElemento);

        // imprimir resultado
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}