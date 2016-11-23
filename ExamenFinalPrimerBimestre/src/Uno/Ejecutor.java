/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Ejecutor {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        //String [] nombre = new String[] ;
        //String [] apellido = new String[];
        String nombre;
        String apellido;
        String nombred;
        String nombred2;
        String apellidod;
        String apellidod2;
        String titulo;
        String titulo2;
        String desicion = "";

        
        do{
            System.out.println("Ingrese nombre del Alumno:");
            nombre= lector.next();

            System.out.println("Ingrese apellido del Alumno:");
            apellido = lector.next();

            System.out.println("Ingrese nombre de docente de Programación:");
            nombred = lector.next();
            
            System.out.println("Ingrese apellido del docente de Programación:");
            apellidod = lector.next();
            
            System.out.println("Ingrese el titulo del docente de programación");
            titulo = lector.next();
            
            System.out.println("Ingrese nombre del docente de Base de datos:");
            nombred2 = lector.next();
            
            System.out.println("Ingrese apellido del docente de Base de datos: ");
            apellidod2 = lector.next();
            
            System.out.println("Ingrese el titulo del docente de Base de datos");
            titulo2 = lector.next();

           
          Docente d = new Docente(nombred, apellidod, titulo);
          Docente d2 = new Docente(nombred2, apellidod2, titulo2);
          Alumno a = new Alumno(nombre, apellido, d, d2);
          
            System.out.println(a.toString());
          
          System.out.println("Desea ingresar mas alumnos (s/n)");
           desicion = lector.next();
          
        } while (desicion.equals("s"));
    }
}
