/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dos;

/**
 *
 * @author SALAS
 */
public class Ejecutora {

    public static void main(String[] args) {

        Garante g1 = new Garante("Manuel", "Muñoz", 320);
        Garante g2 = new Garante("Jorge ", "Macas", 500);
        Garante g3 = new Garante("David ", "Mora", 1200);
        Garante g4 = new Garante("Cristian ", "Gonzalez", 390);

        PrestamoAutomovil p1 = new PrestamoAutomovil("Tatiana", 370, 2000, 5, 4, g1, "Camioneta", "Chevrolet", g2);
        PrestamoAutomovil p2 = new PrestamoAutomovil("Juan", 850, 2500, 6, 12, g2, "Auto", "Audi", g2);

        PrestamoEducativo p3 = new PrestamoEducativo("Diego", 320, 380.9, 6, 8, g1, "Educativo", "Universidad Nacional", g3, g4);
        PrestamoEducativo p4 = new PrestamoEducativo("Nelsón", 600, 590.1, 3, 7, g1, "Educativo", "Ibero Americano", g3, g4);

        Prestamo prestamo[] = new Prestamo[4];

        prestamo[0] = p1;
        prestamo[1] = p2;
        prestamo[2] = p3;
        prestamo[3] = p4;

        for (Prestamo i : prestamo) {
            System.out.println(i);
        }
    }
}
