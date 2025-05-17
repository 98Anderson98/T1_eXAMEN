	package Ejercicio05;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Gerente("Carlos Pérez", "G001", 5000, 20)); 
        empleados.add(new Programador("Ana López", "P001", 3000, 10, 50)); 
        empleados.add(new Programador("Juan Martínez", "P002", 3500, 5, 60)); 
        
        for(Empleado emp : empleados) {
            emp.mostrarDatos();
        }
    }
}

