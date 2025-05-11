package SistemadNómina;

public class EmpleadoTemporal extends Empleado {
    private int diasTrabajados;
    private double pagoPordia;

    
	public EmpleadoTemporal(String nombre, String codigo, int diasTrabajados, double pagoPordia) {
		super(nombre, codigo);
		this.diasTrabajados = diasTrabajados;
		this.pagoPordia = pagoPordia;
	}



	@Override
	public double calcularSalario() {
		return diasTrabajados*pagoPordia;
	}
	

}
