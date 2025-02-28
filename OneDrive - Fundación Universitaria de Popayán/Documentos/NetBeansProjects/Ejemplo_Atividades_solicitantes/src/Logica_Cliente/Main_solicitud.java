/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.Helper_validacion;
import Logica_Negocio.Actividad;
import Logica_Negocio.Solicitud;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main_solicitud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Nombre_Actividad, id_Actividad, Descripcion_Actividad;
        String Nombre_Solicitante, Cedula_Solicitante, Codigo_Solicitante;
        int rta, conteo;
        Actividad objetoactividad;
        Solicitud objetosolicitud;
        
        System.out.println("ingresa el nombre de la actividad:");//Nombre_Actividad
        Nombre_Actividad= sc.nextLine();

        rta = Helper_validacion.ValidarVacio(Nombre_Actividad);

        while (rta > 0) {
          System.out.println("ingresa el nombre de la actividad: ");
         Nombre_Actividad= sc.nextLine();
            rta = Helper_validacion.ValidarVacio(Nombre_Actividad);
        }

        conteo = Helper_validacion.ValidarTodo(Nombre_Actividad);

        while (conteo != 0) {
            System.out.println("ingresa el nombre de la actividad: ");
            Nombre_Actividad = sc.nextLine();
            conteo = Helper_validacion.ValidarTodo(Nombre_Actividad);

        }

        System.out.println("Digite el id del la actividad: ");//id del la actividad
        id_Actividad= sc.nextLine();

        rta = Helper_validacion.ValidarTodoLetra(id_Actividad);

        while (rta > 0) {
            System.out.println("Digite el id del la actividad: ");
            id_Actividad = sc.nextLine();
            rta = Helper_validacion.ValidarTodoLetra(id_Actividad);
        }

        conteo = Helper_validacion.ValidarTodoLetra(id_Actividad);

        while (conteo != 0) {
            System.out.println("Digite el id del la actividad: ");
            id_Actividad = sc.nextLine();
            conteo = Helper_validacion.ValidarTodoLetra(id_Actividad);

        }

        System.out.println("Digite la descripcion de la actividad: ");//descripcion
       Descripcion_Actividad= sc.nextLine();

        rta = Helper_validacion.ValidarVacio(Descripcion_Actividad);

        while (rta > 0) {
            System.out.println("Digite la descripcion de la actividad: ");
            Descripcion_Actividad = sc.nextLine();
            rta = Helper_validacion.ValidarVacio(Descripcion_Actividad);
        }

        conteo = Helper_validacion.ValidarTodo(Descripcion_Actividad);

        while (conteo != 0) {
            System.out.println("Digite la descripcion de la actividad: ");
            Descripcion_Actividad = sc.nextLine();
            conteo = Helper_validacion.ValidarTodo(Descripcion_Actividad);

        }
        objetoactividad = new Actividad(Nombre_Actividad, id_Actividad, Descripcion_Actividad);

        System.out.println("Digite el nombre del solicitante: ");//Nombre_Solicitante
        Nombre_Solicitante = sc.nextLine();

        rta = Helper_validacion.ValidarVacio(Nombre_Solicitante);

        while (rta > 0) {
            System.out.println("Digite el nombre del solicitante: ");
            Nombre_Solicitante = sc.nextLine();
            rta = Helper_validacion.ValidarVacio(Nombre_Solicitante);
        }

        conteo = Helper_validacion.ValidarTodo(Nombre_Solicitante);

        while (conteo != 0) {
            System.out.println("Digite el nombre del solicitante: ");
            Nombre_Solicitante = sc.nextLine();
            conteo = Helper_validacion.ValidarTodo(Nombre_Solicitante);

        }

        System.out.println("Digite la cedula del solicitante");//Digite la cedula del solicitante
         Cedula_Solicitante= sc.nextLine();
        rta = Helper_validacion.ValidarTodoLetra( Cedula_Solicitante);

        while (rta > 0) {
            System.out.println("Digite la cedula del solicitante");
             Cedula_Solicitante = sc.nextLine();
            rta = Helper_validacion.ValidarTodoLetra( Cedula_Solicitante);
        }

        conteo = Helper_validacion.ValidarTodoLetra( Cedula_Solicitante);

        while (conteo != 0) {
            System.out.println("Digite la cedula del solicitante");
             Cedula_Solicitante = sc.nextLine();
            conteo = Helper_validacion.ValidarTodoLetra( Cedula_Solicitante);

        }

        System.out.println("Digite el codigo del solicitante");//Codigo_Solicitante
        Codigo_Solicitante = sc.nextLine();
        rta = Helper_validacion.ValidarTodoSerial(Codigo_Solicitante);

        while (rta > 0) {
            System.out.println("Digite el codigo del solicitante");
           Codigo_Solicitante = sc.nextLine();
            rta = Helper_validacion.ValidarTodoSerial(Codigo_Solicitante);
        }

        conteo = Helper_validacion.ValidarTodoSerial(Codigo_Solicitante);

        while (conteo != 0) {
            System.out.println("Digite el codigo del solicitante");
          Codigo_Solicitante = sc.nextLine();
            conteo = Helper_validacion.ValidarTodoSerial(Codigo_Solicitante);

        }

        objetosolicitud = new Solicitud(Nombre_Solicitante, Cedula_Solicitante, Codigo_Solicitante, objetoactividad); //Asociando

        Helpers.Helper_impresion.ImprimirSolicitud(objetosolicitud);
    }
}

