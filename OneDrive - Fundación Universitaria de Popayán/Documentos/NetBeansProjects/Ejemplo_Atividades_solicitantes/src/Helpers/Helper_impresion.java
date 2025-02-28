/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Solicitud;

/**
 *
 * @author PC
 */
public class Helper_impresion {
 public static void ImprimirSolicitud(Solicitud objetosolicitud)
    {
        System.out.println("El nombre de la persona es:"+"\t"+objetosolicitud.getNombre_Solicitante());
        System.out.println("El apellido de la persona es:"+"\t"+objetosolicitud.getCedula_Solicitante());
        System.out.println("La cedula de la persona es:"+"\t"+objetosolicitud.getCodigo_Solicitante());
        System.out.println("El nombre de la actividad es:"+"\t"+objetosolicitud.getObjetoactividad().getNombre_Actividad());
        System.out.println("Elid de la actividad es:"+"\t"+objetosolicitud.getObjetoactividad().getId_Actividad());
        System.out.println("la descripcion de la actividad es:"+"\t"+objetosolicitud.getObjetoactividad().getDescripcion_Actividad());
      
    }
  
}
