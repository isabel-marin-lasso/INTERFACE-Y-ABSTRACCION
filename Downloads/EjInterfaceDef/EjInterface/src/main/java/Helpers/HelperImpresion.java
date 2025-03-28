/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Circulo;
import Logica_Negocio.Cuadrado;
import Logica_Negocio.Figura;
import Logica_Negocio.Triangulo;
import java.util.ArrayList;

/**
 *
 * @author Santiago Lopez
 */
public class HelperImpresion {
    
    public static void MostrarFigura(ArrayList<Figura> listafiguras)
    {
        double area;
        
        for (int i = 0; i < listafiguras.size(); i++) {
            
            if(listafiguras.get(i) instanceof Circulo)
            {
                area=listafiguras.get(i).CalcularArea();
                System.out.println("El area es:"+area);
                listafiguras.get(i).DibujarFigura();
            }
            if(listafiguras.get(i) instanceof Triangulo)
            {
                area=listafiguras.get(i).CalcularArea();
                 System.out.println("El area es:"+area);
                 listafiguras.get(i).DibujarFigura();
            }
            if(listafiguras.get(i) instanceof Cuadrado)
            {
                area=listafiguras.get(i).CalcularArea();
                 System.out.println("El area es:"+area);
                 listafiguras.get(i).DibujarFigura();
            }
        }
    }
    
}
