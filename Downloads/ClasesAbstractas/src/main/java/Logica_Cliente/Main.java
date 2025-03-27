/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Banano;
import Logica_Negocio.Naranja;
import Logica_Negocio.Producto;
import java.util.ArrayList;

/**
 *
 * @author Santiago Lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Naranja objNaranja= new Naranja(200);
        Banano objBanano= new Banano(150);
        
        ArrayList<Producto> listaproductos = new ArrayList<>();
        listaproductos.add(objNaranja);
        listaproductos.add(objBanano);
        
        Helpers.HelperImpresion.ImprimirInformacion(listaproductos);
    }
    
}
