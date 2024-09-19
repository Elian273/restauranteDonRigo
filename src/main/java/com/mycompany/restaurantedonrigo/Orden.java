/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantedonrigo;

/**
 *
 * @author Administrador
 */
public class Orden 
{
    String nombre, categoria;
    double precio;

    public Orden(Object nombre, Object precio, Object categoria) {
        this.nombre = (String) nombre;
        this.precio = (double) precio;
        this.categoria = (String) categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }  
}
