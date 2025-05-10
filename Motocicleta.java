/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana07;

/**
 *
 * @author ALUMNO
 */
public class Motocicleta extends Vehiculo {
    private String TipodeMoto;

    public Motocicleta(String marca, String modelo, int anio, String TipodeMoto) {
        super(marca, modelo, anio);
        this.TipodeMoto=TipodeMoto;
    }
    @Override
      public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Que tipo de moto es :"+TipodeMoto);
     
    }
    
}
