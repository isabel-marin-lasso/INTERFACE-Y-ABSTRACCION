/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Santiago Lopez
 */
public class Motor {

    public String tamaño;
    public String id_motor;
    public String posicion;

    public Motor() {
    }

    public Motor(String tamaño, String id_motor, String posicion) {
        this.tamaño = tamaño;
        this.id_motor = id_motor;
        this.posicion = posicion;
    }

    

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getId_motor() {
        return id_motor;
    }

    public void setId_motor(String id_motor) {
        this.id_motor = id_motor;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    

}
