package confe;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Solicitar datos al usuario
            System.out.print("Ingrese nombre del estudiante: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese edad del estudiante: ");
            int edad = Integer.parseInt(sc.nextLine());

            System.out.print("¿Cuántas notas desea registrar?: ");
            int cantidadNotas = Integer.parseInt(sc.nextLine());
            double[] notas = new double[cantidadNotas];

            for (int i = 0; i < cantidadNotas; i++) {
                System.out.print("Ingrese nota #" + (i + 1) + ": ");
                notas[i] = Double.parseDouble(sc.nextLine());
            }

            // Crear el objeto estudiante
            Estudiante estudiante = new Estudiante(nombre, edad, notas);

            System.out.println("\n✅ Datos del estudiante registrado:");
            estudiante.mostrarInformacion();

        } catch (NumberFormatException e) {
            System.out.println("❌ Error: Ingrese solo números donde corresponde.");
        }

        sc.close();
    }
}