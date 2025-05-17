package Ejercicio07;

public class CuentaCorriente extends CuentaBancaria {
private double limiteSobregiro;
    
    public CuentaCorriente(String numeroCuenta, double saldoInicial, double limiteSobregiro) {
        super(numeroCuenta, saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }
    
    @Override
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("[CORRIENTE] Depósito: +" + monto);
    }
    
    @Override
    public void retirar(double monto) {
        if (monto <= saldo + limiteSobregiro) {
            saldo -= monto;
            System.out.println("[CORRIENTE] Retiro: -" + monto);
        } else {
            System.out.println("¡Fondos insuficientes (incluye sobregiro)!");
        }
    }

}