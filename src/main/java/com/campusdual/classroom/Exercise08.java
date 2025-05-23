package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
        int y = 5;
        whileLoop(y);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num) {
        int x = 0;
        while (x < num) {
            int contador = 0;
            contador++;
            System.out.println(x + " < " + num + ". El proximo ciclo valdra: " + (contador + x));
            x = x + contador;
        }
    }
}