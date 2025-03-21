/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Entrenador;
import Logica_Negocio.Futbolista;
import Logica_Negocio.Masajista;
import Logica_Negocio.SeleccionFutbol;
import java.util.ArrayList;

/**
 *
 * @author Santiago Lopez
 */
public class HelperImpresion {
    
    
    public static void ImprimirConcentracion(ArrayList<SeleccionFutbol> integrantes)
    {
         for (int i=0; i<integrantes.size();i++) {
			System.out.print(integrantes.get(i).getNombres()+" "+integrantes.get(i).getApellidos()+" -> ");
			integrantes.get(i).Concentrarse();
		}

    }
    
      public static void ImprimirViajeros(ArrayList<SeleccionFutbol> integrantes)
    {
         for (int i=0; i<integrantes.size();i++) {
			System.out.print(integrantes.get(i).getNombres()+" "+integrantes.get(i).getApellidos()+" -> ");
			integrantes.get(i).Viajar();
		}

    }
      public static void IdentificarTipoObjeto(ArrayList<SeleccionFutbol> lista)
      {
          for (int i = 0; i < lista.size(); i++) {
              
              if(lista.get(i) instanceof Futbolista)
              {
                  System.out.println("Soy Futbolista");
                  System.out.println(lista.get(i).getNombres());
                  System.out.println("Jugando Futbol");
              }
              
              if(lista.get(i) instanceof Masajista)
              {
                  System.out.println("Soy Masajista");
                  System.out.println(lista.get(i).getNombres());
                  System.out.println("Haciendo Masajes");
              }
              if(lista.get(i) instanceof Entrenador)
              {
                  System.out.println("Soy Entrenador");
                  System.out.println(lista.get(i).getNombres());
                  System.out.println("Entrenando Futbol");
              }
          }
      }
}
