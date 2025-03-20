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
public class Avion {
    
    public String marca;
    public ArrayList<Motor> listamotor;
    public ArrayList<Llanta> listallantas;
    public ArrayList<Ala> listaalas;
    public Fuselaje fuselaje;

    public Avion() {
    }

    public Avion(String marca, ArrayList<Motor> listamotor, ArrayList<Llanta> listallantas, ArrayList<Ala> listaalas, Fuselaje fuselaje) {
        this. marca=marca;
        this.listamotor = listamotor;
        this.listallantas = listallantas;
        this.listaalas = listaalas;
        this.fuselaje = fuselaje;
    }

   

    public ArrayList<Motor> getListamotor() {
        return listamotor;
    }

    public void setListamotor(ArrayList<Motor> listamotor) {
        this.listamotor = listamotor;
    }

    public ArrayList<Llanta> getListallantas() {
        return listallantas;
    }

    public void setListallantas(ArrayList<Llanta> listallantas) {
        this.listallantas = listallantas;
    }

    public ArrayList<Ala> getListaalas() {
        return listaalas;
    }

    public void setListaalas(ArrayList<Ala> listaalas) {
        this.listaalas = listaalas;
    }

    public Fuselaje getFuselaje() {
        return fuselaje;
    }

    public void setFuselaje(Fuselaje fuselaje) {
        this.fuselaje = fuselaje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    
}
