/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Banano;
import Logica_Negocio.Naranja;
import Logica_Negocio.Producto;
import java.util.ArrayList;

/**
 *
 * @author Santiago Lopez
 */
public class HelperImpresion {
    
    public static void ImprimirInformacion(ArrayList<Producto> listapro)
    {
        for (int i = 0; i < listapro.size(); i++) {
            
            if(listapro.get(i ) instanceof Naranja || listapro.get(i ) instanceof Banano)
            {
                String re= listapro.get(i).InformacionProducto();
                System.out.println(re);
            }
             
        }
        
    }
}
