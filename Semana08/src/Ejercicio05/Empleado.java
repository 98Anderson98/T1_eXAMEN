package Ejercicio05;

public abstract class Empleado {
	protected String nombre;
    protected String codigo;
    protected double salario;
    
    public Empleado(String nombre, String codigo, double salario) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.salario = salario;
    }
    
    // Método abstracto para calcular bono (diferente en cada subclase)
    public abstract double calcularBono();
    
    // Método para calcular salario total (salario base + bono)
    public double calcularSalarioTotal() {
        return salario + calcularBono();
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Salario base: " + salario);
        System.out.println("Bono: " + calcularBono());
        System.out.println("Salario total: " + calcularSalarioTotal());
        System.out.println();
    }

}
