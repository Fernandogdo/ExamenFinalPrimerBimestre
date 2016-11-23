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
public class Prestamo {
    private String nombre_enefiario;
    private double sueldo;
    private double monto_prestamo;
    private double interes;
    private int tiempoprestamo;
    Garante garante1;

    public Prestamo(String nombre_enefiario, double sueldo, double monto_prestamo, 
            double interes, int tiempoprestamo, Garante garante1) {
        this.nombre_enefiario = nombre_enefiario;
        this.sueldo = sueldo;
        this.monto_prestamo = monto_prestamo;
        this.interes = interes;
        this.tiempoprestamo = tiempoprestamo;
        this.garante1 = garante1;
    }

    public String getNombredebenefiario() {
        return nombre_enefiario;
    }

    public void setNombredebenefiario(String nombre_enefiario) {
        this.nombre_enefiario = nombre_enefiario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getMontoprestamo() {
        return monto_prestamo;
    }

    public void setMontoprestamo(double monto_prestamo) {
        this.monto_prestamo = monto_prestamo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getTiempoprestamo() {
        return tiempoprestamo;
    }

    public void setTiempoprestamo(int tiempoprestamo) {
        this.tiempoprestamo = tiempoprestamo;
    }

    public Garante getGarante1() {
        return garante1;
    }

    public void setGarante1(Garante garante1) {
        this.garante1 = garante1;
    }
    
    
    
    public double ValorTotal(){
        double t = (getMontoprestamo() * getInteres())/ getTiempoprestamo();
        return t;
    } 
   
    public String toString() {
        return String.format(
                 "\nNombre: %s |Sueldo: %.2f |MontoPrestamo: %.2f |Interes %.2f "
                         + "|Tiempo Prestamo Años: %d| Valor total Prestamo: %.2f"
                + "\nGrarante1: Nombre: %s Apellido: %s Sueldo: %.2f ",
                getNombredebenefiario(), getSueldo(), getMontoprestamo(), getInteres(),getTiempoprestamo(), ValorTotal(),
                getGarante1().getNombre(),getGarante1().getApellido(),getGarante1().getSueldo());
    }
}
