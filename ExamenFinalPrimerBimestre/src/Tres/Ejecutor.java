/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tres;

/**
 *
 * @author SALAS
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
        Coches c = new Coches("123ABC", "Rojo", "Toyota", 2, 5);
        Camiones ca = new Camiones("1212", "Azul", "Chevrolet", 5, 10);
        Microbuses m = new Microbuses("3245", "Morado", "Mercedez", 5, 2);
        
        Vehiculos vehiculos[] = new Vehiculos[3];
        
        vehiculos[0] = c;
        vehiculos[1] = ca;
        vehiculos[2] = m;
        
        for (Vehiculos vehiculo : vehiculos) {
            System.out.printf("%s\n\n", vehiculo);
        }
    }
}
