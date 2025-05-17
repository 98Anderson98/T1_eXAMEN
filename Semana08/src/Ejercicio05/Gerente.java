package Ejercicio05;

public class Gerente extends Empleado {
    private double porcentajeBono;
    
    public Gerente(String nombre, String codigo, double salario, double porcentajeBono) {
        super(nombre, codigo, salario);
        this.porcentajeBono = porcentajeBono;
    }
    
    @Override
    public double calcularBono() {
        // Bono del gerente es un porcentaje de su salario
        return salario * porcentajeBono / 100;
    }
}