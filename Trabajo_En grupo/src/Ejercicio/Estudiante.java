package Ejercicio;
import java.util.Scanner;


public class Estudiante {

	private String nombre;
    private int edad;
    private double[] notas;
    private double notaFinal;

    public Estudiante(String nombre, int edad, int cantidadNotas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = new double[cantidadNotas];
    }

    public void ingresarNotas(Scanner sc) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("N" + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }
        notaFinal = suma / notas.length;
    }
    //holaaaa

   

    public void mostrarDatos() {
        System.out.printf("Nombre: %s, Edad: %d, promedio: %.2f\n", nombre, edad, notaFinal);
    }
}


