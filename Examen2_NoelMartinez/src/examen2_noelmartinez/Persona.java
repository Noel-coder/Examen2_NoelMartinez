/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen2_noelmartinez;

import java.io.Serializable;


public abstract class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private String NumeroTelefono;

    private static final long SerialVersionUID = 777L;
    
    public Persona(String nombre, String apellido, String NumeroTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.NumeroTelefono = NumeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(String NumeroTelefono) {
        this.NumeroTelefono = NumeroTelefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", NumeroTelefono=" + NumeroTelefono + '}';
    }
    

}
