/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Santiago Lopez
 */
public class Naranja extends Producto {

    public Naranja()
    {
        
    }
    
    public Naranja(int precio) {
        super(precio);
    }
    

    @Override
    public String InformacionProducto() {
        return "El precio de la Naranja es:"+"\t"+this.precio;
    }
    
}
