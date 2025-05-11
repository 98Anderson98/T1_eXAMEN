package Tarea;

 public class  AdministrativoHospital extends Trabajador {
	 
	private boolean tieneCargoJefatura;

	public AdministrativoHospital(String nombre, String dni, double salarioBase, boolean tieneCargoJefatura) {
		super(nombre, dni, salarioBase);
		this.tieneCargoJefatura = tieneCargoJefatura;
	}
	
	 @Override
	    public double calcularSalario() {
	        if (tieneCargoJefatura ) {
	            return salarioBase() * 1.2;
	        } else {
	            return salarioBase();
	        }
	    }

	private double salarioBase() {
		
		return salarioBase;
	}

	
}
