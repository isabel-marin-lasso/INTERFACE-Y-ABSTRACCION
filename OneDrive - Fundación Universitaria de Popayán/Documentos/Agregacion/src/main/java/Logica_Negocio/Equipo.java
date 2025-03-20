/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author Santiago Lopez
 */
public class Equipo {
    
    public String nombre;
    public ArrayList<Jugador> equipojugador;

    public Equipo() {
    }

    public Equipo(String nombre, ArrayList<Jugador> equipojugador) {
        this.nombre = nombre;
        this.equipojugador = equipojugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getEquipojugador() {
        return equipojugador;
    }

    public void setEquipojugador(ArrayList<Jugador> equipojugador) {
        this.equipojugador = equipojugador;
    }
    
    
    
}
