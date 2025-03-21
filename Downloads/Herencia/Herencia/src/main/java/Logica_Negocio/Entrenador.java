/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Santiago Lopez
 */
public class Entrenador extends SeleccionFutbol{
    
    
    public String id_Fedeeracion;

    public Entrenador() {
        super();
    }

    public Entrenador( String id, String Nombres, String Apellidos, int Edad, String id_Fedeeracion) {
        super(id, Nombres, Apellidos, Edad);
        this.id_Fedeeracion = id_Fedeeracion;
    }

    public String getId_Fedeeracion() {
        return id_Fedeeracion;
    }

    public void setId_Fedeeracion(String id_Fedeeracion) {
        this.id_Fedeeracion = id_Fedeeracion;
    }
    
    
    public void DirigirPartido()
    {
        System.out.println("Dirigiendo Partido");
    }
    
     public void DirigirEntrenamiento()
    {
        System.out.println("Dirigiendo Entrenamiento");
    }
}
