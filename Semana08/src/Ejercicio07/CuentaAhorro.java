package Ejercicio07;

public class CuentaAhorro extends CuentaBancaria {
    public CuentaAhorro(String numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }
    
    @Override
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("[AHORRO] Depósito: +" + monto);
    }
    
    @Override
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("[AHORRO] Retiro: -" + monto);
        } else {
            System.out.println("¡Fondos insuficientes!");
        }
    }
}