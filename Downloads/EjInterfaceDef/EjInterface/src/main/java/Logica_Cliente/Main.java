/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Logica_Negocio.Circulo;
import Logica_Negocio.Cuadrado;
import Logica_Negocio.Figura;
import Logica_Negocio.Triangulo;
import java.util.ArrayList;

/**
 *
 * @author Santiago Lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Cuadrado cuadrado = new Cuadrado(2);
        Triangulo triangulo = new Triangulo(2, 2);
        ArrayList<Figura> figuras= new ArrayList<>();
        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(triangulo);
        HelperImpresion.MostrarFigura(figuras);
    }
    
}
