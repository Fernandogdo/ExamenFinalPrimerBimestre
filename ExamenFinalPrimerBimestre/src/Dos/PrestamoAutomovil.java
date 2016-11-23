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
public class PrestamoAutomovil extends Prestamo {

    private String tp_vehiculo;
    private String marc_vehiculo;
    Garante garante2;

    public PrestamoAutomovil(String nombredebenefiario, double sueldo, double montoprestamo, double interes, int tiempoprestamo, Garante garante1, String tp_vehiculo, String marc_vehiculo, Garante garante2) {
        super(nombredebenefiario, sueldo, montoprestamo, interes, tiempoprestamo, garante1);
        this.tp_vehiculo = tp_vehiculo;
        this.marc_vehiculo = marc_vehiculo;
        this.garante2 = garante2;
    }

    public String getTp_vehiculo() {
        return tp_vehiculo;
    }

    public void setTp_vehiculo(String tp_vehiculo) {
        this.tp_vehiculo = tp_vehiculo;
    }

    public String getMarc_vehiculo() {
        return marc_vehiculo;
    }

    public void setMarc_vehiculo(String marc_vehiculo) {
        this.marc_vehiculo = marc_vehiculo;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante garante2) {
        this.garante2 = garante2;
    }

    @Override
    public String toString() {
        return String.format("PRESTAMOS\n\nPrestamo Automovil: %s\n"
                + "\nTipo Vehiculo: %s "
                + "\nMarca Vehiculo: %s "
                + "Grarante2:\nNombre: %s Apellido: %s Sueldo: %.3f ",super.toString(),getTp_vehiculo(),getMarc_vehiculo(),             
                getGarante2().getNombre(), getGarante2().getApellido(), getGarante2().getSueldo());
    }
}
