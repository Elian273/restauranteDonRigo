/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurantedonrigo;

/**
 *
 * @author Administrador
 */
public class RestauranteDonRigo {

    public static void main(String[] args) {
        
        Inicio inicio = new Inicio();
        
        // Evita que se pueda modificar el tamaño del JFrame
        inicio.setResizable(false);
        
        // Establece el tamaño del JFrame
        inicio.setSize(540, 397);
        
        // Mostrar la ventana
        inicio.setVisible(true);
    }
}
