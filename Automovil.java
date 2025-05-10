/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana07;

/**
 *
 * @author ALUMNO
 */
 public class Automovil extends Vehiculo {
     private int cantidadPuertas;

    public Automovil(String marca, String modelo, int anio, int cantidadPuertas) {
        super(marca, modelo, anio);
        this.cantidadPuertas=cantidadPuertas;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Canridad de puertas:"+cantidadPuertas);
     
    }
     
    
}
