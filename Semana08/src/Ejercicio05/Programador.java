package Ejercicio05;

public   class Programador extends Empleado {
	private int horasExtras;
    private double tarifaHoraExtra;
    
    public Programador(String nombre, String codigo, double salario, 
                      int horasExtras, double tarifaHoraExtra) {
        super(nombre, codigo, salario);
        this.horasExtras = horasExtras;
        this.tarifaHoraExtra = tarifaHoraExtra;
    }
    
    @Override
    public double calcularBono() {
        // Bono del programador se basa en horas extras
        return horasExtras * tarifaHoraExtra;
    }
}


}
