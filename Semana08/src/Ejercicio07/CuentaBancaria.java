	package Ejercicio07;

public abstract class CuentaBancaria {
		
	protected String numeroCuenta;
    protected double saldo;
    
    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }
    
    
    public abstract void depositar(double monto);
    public abstract void retirar(double monto);
    
    
    public void mostrarInformacion() {
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: " + saldo);
        System.out.println();
    }

}
	