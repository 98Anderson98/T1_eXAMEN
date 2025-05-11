package Tarea;

public class TecnicoLaboratorio extends Trabajador {
	private int pruebasRealizadas;
	private double pagoPorPrueba;
	
	public TecnicoLaboratorio(String nombre, String dni, double salarioBase, int pruebasRealizadas,
			double pagoPorPrueba) {
		super(nombre, dni, salarioBase);
		this.pruebasRealizadas = pruebasRealizadas;
		this.pagoPorPrueba = pagoPorPrueba;
	}
	
	@Override
	public double calcularSalario() {
		return salarioBase + (pruebasRealizadas*pagoPorPrueba);
	}

}
