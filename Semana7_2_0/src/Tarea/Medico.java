package Tarea;

public class Medico extends Trabajador {
	
	private int pacientesAtendidos;
	private double pagoPorPaciente;
	
	public Medico(String nombre, String dni, double salarioBase, int pacientesAtendidos, double pagoPorPaciente) {
		super(nombre, dni, salarioBase);
		this.pacientesAtendidos = pacientesAtendidos;
		this.pagoPorPaciente = pagoPorPaciente;
	}
	
	@Override
	public double calcularSalario() {
		return salarioBase + (pacientesAtendidos*pagoPorPaciente);
	}
	
	public void RecetarMedicina() {
		System.out.println(" 1 de Paracetamol cada 8 horas");
		
	}
	

}
