/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana07;

/**
 *
 * @author ALUMNO
 */
public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String marca, String modelo, int anio, double capacidadCarga) {
        super(marca, modelo, anio);
        this.capacidadCarga=capacidadCarga;
    }
    @Override
     public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Cantidad de Carga:"+capacidadCarga);
     
    }
    
    
}
