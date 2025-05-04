package Prueba2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese nombre del cliente: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese edad del cliente: ");
            int edad = Integer.parseInt(sc.nextLine());

            System.out.print("¿Cuántas compras desea registrar?: ");
            int cantidad = Integer.parseInt(sc.nextLine());
            double[] compras = new double[cantidad];

            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingrese monto de compra #" + (i + 1) + ": ");
                compras[i] = Double.parseDouble(sc.nextLine());
            }

            Cliente cliente = new Cliente(nombre, edad, compras);

            System.out.println("\n✅ Datos del cliente registrado:");
            cliente.mostrarInformacion();

        } catch (NumberFormatException e) {
            System.out.println("❌ Error: Ingrese datos numéricos válidos.");
        }

        sc.close();
    }
}
