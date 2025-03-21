/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Santiago Lopez
 */
public class Masajista extends SeleccionFutbol{
    
    public String Titulacion;
    public int Años_Experincia;

    public Masajista() {
        super();
    }

    public Masajista( String id, String Nombres, String Apellidos, int Edad, String Titulacion, int Años_Experincia) {
        super(id, Nombres, Apellidos, Edad);
        this.Titulacion = Titulacion;
        this.Años_Experincia = Años_Experincia;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public int getAños_Experincia() {
        return Años_Experincia;
    }

    public void setAños_Experincia(int Años_Experincia) {
        this.Años_Experincia = Años_Experincia;
    }
    
    
    
    
    public void DarMasaje()
    {
        System.out.println("Aplicando Masaje!");
    }
    
    
}
