package SistemadNómina;

public class EmpleadoFijo extends Empleado {
	private double SalarioMensual;
	
	
	
	public EmpleadoFijo(String nombre, String codigo, double salarioMensual) {
		super(nombre, codigo);
		this.SalarioMensual = salarioMensual;
	}



	@Override
	
	public double calcularSalario() {
		return SalarioMensual;
	}
	
	


}
