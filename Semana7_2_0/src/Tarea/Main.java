package Tarea;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Trabajador> Traja= new ArrayList<>();
		Traja.add(new Medico("Jose larios","75107317",3500 ,500,70 ));
		Traja.add(new Enfermero("Yimmy Diaz","7561923",1500,50,70));
		Traja.add(new TecnicoLaboratorio("Alejandro Mezta","6876783", 2000,30,35));
		Traja.add(new AdministrativoHospital ("Anderson Tito","6876783",1500,true));
		
		for(Trabajador Traba :Traja) {
			Traba.mostrarInformacion();
			System.out.println();
		}

	}

}
