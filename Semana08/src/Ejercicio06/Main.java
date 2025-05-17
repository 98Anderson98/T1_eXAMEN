package Ejercicio06;

public class Main {
    public static void main(String[] args) {
        CalculadoraBasica basica = new CalculadoraBasica();
        System.out.println("Suma (5 + 3): " + basica.sumar(5, 3));
        
        // ❌ Esto no compilará:
        // CalculadoraCientifica cientifica = new CalculadoraCientifica();
    }
}