/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana07;

/**
 *
 * @author ALUMNO
 */
public class MainVehiculos {

    public static void main(String[] args) {
        Vehiculo auto = new Automovil("Toyota","Corolla",2020,4);
        Vehiculo Camion = new Camion("Volvo","JfG",2020,200);
        Vehiculo Moto = new Motocicleta("KTM","R6",2025,"CARRERA");
        
        auto.mostrarInformacion();
        Camion.mostrarInformacion();
        Moto.mostrarInformacion();
       
    }
}
