package SistemadNómina;

public abstract class Empleado {
	protected String nombre;
	protected String codigo;
	
	public Empleado(String nombre, String codigo) {
		
		this.nombre  = nombre;
		this.codigo = codigo;
	}
	
	//Obligo a las subclases a implementar su propia logica de calculo de Salario
        public abstract double calcularSalario();
		
		public void mostrarDatos() {
			
		System.out.println("Nombre:" + nombre);
		System.out.println("Codigo:"+ codigo);
		System.out.println("Salario:"+ calcularSalario());
		System.out.println();
		}
        
	
	
	

}



