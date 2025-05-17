package Ejercicio07;
import java.util.ArrayList;

public class Main {
 public static void main(String[] args) {
     ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
     cuentas.add(new CuentaCorriente("CC-001", 1000, 500));
     cuentas.add(new CuentaAhorro("CA-001", 2000));
     
     for (CuentaBancaria cuenta : cuentas) {
         cuenta.depositar(300);
         cuenta.retirar(200);
         cuenta.mostrarInformacion();
     }
 }
}