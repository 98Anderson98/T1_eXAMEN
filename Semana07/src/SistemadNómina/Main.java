package SistemadNómina;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	ArrayList<Empleado> Empleados= new ArrayList<>();
	Empleados.add(new EmpleadoFijo("Jose larios","N00384913", 3000));
	Empleados.add(new EmpleadoTemporal("Luis Aña","N0038493", 20,100));
	Empleados.add(new Freelancer("Alejandro Mezta","N0030036", 70,25));
	
	
	   for(Empleado Emple: Empleados ) {
		
	    	Emple.mostrarDatos();
    	}
	
	}

}
