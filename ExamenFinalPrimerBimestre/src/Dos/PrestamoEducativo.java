/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dos;

/**
 **
 * @author SALAS
 */
public class PrestamoEducativo extends Prestamo{
    private String nivel_estudio;
    private String centroeducativo;
    Garante garante3;
    Garante garante4;
    public PrestamoEducativo(String nombredebenefiario, double sueldo, double montoprestamo, double interes, int tiempoprestamo, Garante garante1, String nivel_estudio ,String centroeducativo, Garante garante3, Garante garante4) {
        super(nombredebenefiario, sueldo, montoprestamo, interes, tiempoprestamo, garante1);
        setNivel_estudio(nivel_estudio);
        setCentroeducativo(centroeducativo);
        setGarante3(garante3);
        setGarante4(garante4);
    }

    public String getNivel_estudio() {
        return nivel_estudio;
    }

    public void setNivel_estudio(String nivel_estudio) {
        this.nivel_estudio = nivel_estudio;
    }

    public String getCentroeducativo() {
        return centroeducativo;
    }

    public void setCentroeducativo(String centroeducativo) {
        this.centroeducativo = centroeducativo;
    }

    public Garante getGarante3() {
        return garante3;
    }

    public void setGarante3(Garante garante3) {
        this.garante3 = garante3;
    }

    public Garante getGarante4() {
        return garante4;
    }

    public void setGarante4(Garante garante4) {
        this.garante4 = garante4;
    }
     @Override
    public String toString() {
        return String.format("\nPrestamo Educativo: %s\n "
                + "\nNivel de Estuduio: %s "
                + "Centro Educativo: %s "
                + "Grarante3: \nNombre: %s Apellido: %s Sueldo: %.3f\n"
                + "Grarante4: Nombre: %s Apellido: %s Sueldo: %.2f ",super.toString(),getNivel_estudio(),getCentroeducativo(),
                getGarante3().getNombre(), getGarante3().getApellido(), getGarante3().getSueldo(),
                getGarante4().getNombre(), getGarante4().getApellido(), getGarante4().getSueldo());
        
    }
    
    
}
