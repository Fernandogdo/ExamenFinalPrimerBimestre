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
public class Camiones extends Vehiculos{
    
    private int toneladas;

    public Camiones(String matricula, String color, String marca, int dias, int toneladas) {
        super(matricula, color, marca, dias);
        this.toneladas = toneladas;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }
    
    public double precio_alquiler(){
        double dia = getToneladas() * 50;
        double total = dia + (getToneladas()*10);
        return total;
    }
    
    @Override
    public String toString(){
        return String.format("Camiones:\n%s Alquiler Camiones: %.2f", super.toString(), precio_alquiler() );
    }
}
