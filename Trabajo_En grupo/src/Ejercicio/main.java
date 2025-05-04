package Ejercicio;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos estudiantes desea registrar? ");
        int nEstudiantes = sc.nextInt();
        System.out.print("¿Cuántas notas por estudiantes? ");
        int nNotas = sc.nextInt();

        Estudiante[] estudiantes = new Estudiante[nEstudiantes];

        for (int i = 0; i < nEstudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            sc.nextLine(); 
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();

            estudiantes[i] = new Estudiante(nombre, edad, nNotas);
            estudiantes[i].ingresarNotas(sc);
        }

        System.out.println("----Estudiantes aprobados( promedio >14)----");
        for (Estudiante e : estudiantes) {
            if (e.getNotaFinal() >= 14) {
                e.mostrarDatos();
            }
        }	
	}

}
