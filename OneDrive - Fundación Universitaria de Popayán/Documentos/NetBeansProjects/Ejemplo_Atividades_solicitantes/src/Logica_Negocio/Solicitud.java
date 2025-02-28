/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author PC
 */
public class Solicitud {


 public String Nombre_Solicitante,Cedula_Solicitante,Codigo_Solicitante;
 public Actividad objetoactividad;

    public Solicitud() {
    }

    public Solicitud(String Nombre_Solicitante, String Cedula_Solicitante, String Codigo_Solicitante, Actividad objetoactividad) {
        this.Nombre_Solicitante = Nombre_Solicitante;
        this.Cedula_Solicitante = Cedula_Solicitante;
        this.Codigo_Solicitante = Codigo_Solicitante;
        this.objetoactividad = objetoactividad;
    }

    public String getNombre_Solicitante() {
        return Nombre_Solicitante;
    }

    public void setNombre_Solicitante(String Nombre_Solicitante) {
        this.Nombre_Solicitante = Nombre_Solicitante;
    }

    public String getCedula_Solicitante() {
        return Cedula_Solicitante;
    }

    public void setCedula_Solicitante(String Cedula_Solicitante) {
        this.Cedula_Solicitante = Cedula_Solicitante;
    }

    public String getCodigo_Solicitante() {
        return Codigo_Solicitante;
    }

    public void setCodigo_Solicitante(String Codigo_Solicitante) {
        this.Codigo_Solicitante = Codigo_Solicitante;
    }

    public Actividad getObjetoactividad() {
        return objetoactividad;
    }

    public void setObjetoactividad(Actividad objetoactividad) {
        this.objetoactividad = objetoactividad;
    }

    
 
 
}
