package SistemadNómina;

public class Freelancer extends Empleado {
	private int horasTrabajadas;
	private double TarifaHora;
	
	
	public Freelancer(String nombre, String codigo, int horasTrabajadas, double tarifaHora) {
		super(nombre, codigo);
		this.horasTrabajadas = horasTrabajadas;
		this.TarifaHora = tarifaHora;
	}
	
	@Override
	public double calcularSalario() {
		return horasTrabajadas*TarifaHora;
	}
	
	

}



