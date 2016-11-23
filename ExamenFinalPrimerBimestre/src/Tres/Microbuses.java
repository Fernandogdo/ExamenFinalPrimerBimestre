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
public class Microbuses extends Vehiculos{
    private int num_rutas;

    public Microbuses(String matricula, String color, String marca, int dias, int num_rutas) {
        super(matricula, color, marca, dias);
        this.num_rutas = num_rutas;
    }

    public int getNum_rutas() {
        return num_rutas;
    }

    public void setNum_rutas(int num_rutas) {
        this.num_rutas = num_rutas;
    }
    
    public double precio_alquiler(){
        double dia = getDias() * 50;
        double total = dia + (getNum_rutas()*10);
        return total;
    }
    
    @Override
    public String toString(){
        return String.format("Microbuses\n%s Alquiler Microbuses: %.2f", super.toString(), precio_alquiler());
    }
    
    
}
