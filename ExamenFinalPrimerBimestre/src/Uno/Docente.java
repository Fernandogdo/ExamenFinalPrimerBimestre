/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

/**
 *
 * @author SALAS
 */
public class Docente {
    
    private String nombred;
    private String apellidod;
    private String titulo;

    public Docente(String nombred, String apellidod, String titulo) {
        this.nombred = nombred;
        this.apellidod = apellidod;
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombred;
    }

    public void setNombred(String nombred) {
        this.nombred = nombred;
    }

    public String getApellido() {
        return apellidod;
    }

    public void setApellidod(String apellidod) {
        this.apellidod = apellidod;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre: %s Apellido: %s Título: %s", getNombre(), getApellido(), getTitulo());
    }
}
