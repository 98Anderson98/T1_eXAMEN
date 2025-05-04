package Prueba2;

public class Cliente {
    private String nombre;
    private int edad;
    private double[] compras;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(String nombre, int edad, double[] compras) {
        this.nombre = nombre;
        this.edad = edad;
        this.compras = compras;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double[] getCompras() {
        return compras;
    }

    // Método para calcular el total de compras
    public double calcularTotal() {
        double suma = 0;
        for (double c : compras) {
            suma += c;
        }
        return suma;
    }

    // Método para mostrar la información del cliente
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.print("Compras: ");
        for (double c : compras) {
            System.out.print(c + " ");
        }
        System.out.println("\nTotal de compras: S/ " + String.format("%.2f", calcularTotal()));
    }
}
