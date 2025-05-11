package Tarea;

public abstract class Trabajador {
	protected String nombre;
	protected String dni;
	protected double salarioBase;
	
	
	
	 public Trabajador(String nombre, String dni, double salarioBase) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salarioBase = salarioBase;
	}

	public abstract double calcularSalario();
		
		public void mostrarInformacion() {
			System.out.println("Nombre:" + nombre);
			System.out.println("DNI:"+ dni);
			System.out.println("SalarioBase:" +salarioBase);
			System.out.println("Salario:"+ calcularSalario());
			System.out.println();
		}
	}
		
	
	
	


