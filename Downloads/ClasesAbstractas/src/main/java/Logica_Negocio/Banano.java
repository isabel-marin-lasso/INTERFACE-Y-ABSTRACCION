/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Santiago Lopez
 */
public class Banano extends Producto {

    public Banano() {
    }

    
    public Banano(int precio) {
        super(precio);
    }

    @Override
    public String InformacionProducto() {
        return "El precio de la Banano es:" + "\t" + this.precio;
    }

}
