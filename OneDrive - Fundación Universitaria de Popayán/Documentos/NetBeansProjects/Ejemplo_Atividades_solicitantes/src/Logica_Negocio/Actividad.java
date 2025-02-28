/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author PC
 */
public class Actividad {

   
   public String Nombre_Actividad,id_Actividad,Descripcion_Actividad;  

    public Actividad() {
    }

    public Actividad(String Nombre_Actividad, String id_Actividad, String Descripcion_Actividad) {
        this.Nombre_Actividad = Nombre_Actividad;
        this.id_Actividad = id_Actividad;
        this.Descripcion_Actividad = Descripcion_Actividad;
    }

    public String getNombre_Actividad() {
        return Nombre_Actividad;
    }

    public void setNombre_Actividad(String Nombre_Actividad) {
        this.Nombre_Actividad = Nombre_Actividad;
    }

    public String getId_Actividad() {
        return id_Actividad;
    }

    public void setId_Actividad(String id_Actividad) {
        this.id_Actividad = id_Actividad;
    }

    public String getDescripcion_Actividad() {
        return Descripcion_Actividad;
    }

    public void setDescripcion_Actividad(String Descripcion_Actividad) {
        this.Descripcion_Actividad = Descripcion_Actividad;
    }
   
}
