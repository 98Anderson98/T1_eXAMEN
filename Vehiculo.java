/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana07;

/**
 *
 * @author ALUMNO
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    
    public void mostrarInformacion(){
        System.out.println("Marca "+ marca);
        System.out.println("Moedelo "+ modelo);
        System.out.println("Año "+ anio);
    }
    
}
