package Tarea;

public class Enfermero extends Trabajador {
	private int turnosNocturnos;
	private double bonoPorTurno;
	
	
	
	public Enfermero(String nombre, String dni, double salarioBase, int turnosNocturnos, double bonoPorTurno) {
		super(nombre, dni, salarioBase);
		this.turnosNocturnos = turnosNocturnos;
		this.bonoPorTurno = bonoPorTurno;
	}



	@Override
	public double calcularSalario() {
		return salarioBase + (turnosNocturnos*bonoPorTurno);
	}

}
