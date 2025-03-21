/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Santiago Lopez
 */
public class Futbolista extends SeleccionFutbol {

    public String Dorsal;
    public String Posicion;

    public Futbolista() {
        super();
    }

    public Futbolista(String id, String Nombres, String Apellidos, int Edad, String Dorsal, String Posicion) {
        super(id, Nombres, Apellidos, Edad);
        this.Dorsal = Dorsal;
        this.Posicion = Posicion;
    }

    public String getDorsal() {
        return Dorsal;
    }

    public void setDorsal(String Dorsal) {
        this.Dorsal = Dorsal;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }
    
    

    public void JugarPartido() {
        System.out.println("Jugando partido!");
    }

    public void Entrenar() {
        System.out.println("Entrenando!");
    }
}
