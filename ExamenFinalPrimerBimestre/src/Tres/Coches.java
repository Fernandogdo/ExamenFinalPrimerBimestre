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
public class Coches extends Vehiculos{
    
    private int num_pasajeros;

    public Coches(String matricula, String color, String marca, int dias, int num_pasajeros) {
        super(matricula, color, marca, dias);
        this.num_pasajeros = num_pasajeros;
    }

    public int getNum_pasajeros() {
        return num_pasajeros;
    }

    public void setNum_pasajeros(int num_pasajeros) {
        this.num_pasajeros = num_pasajeros;
    }
    
    public double precio_alquiler(){
        double dia = getDias() * 50;
        double total = dia + (getNum_pasajeros()*5);
        return total;
    }
    
    @Override
    public String toString(){
        return String.format("Coches:\n%s Alquiler Coche: %.2f", super.toString(), precio_alquiler());
    }
    
}
