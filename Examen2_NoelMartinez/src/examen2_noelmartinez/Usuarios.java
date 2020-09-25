/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_noelmartinez;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuarios extends Persona implements Serializable {

    private String NombreUsuario;
    private String contraseña;
    private ArrayList<Chats> listaChats = new ArrayList();
    private ArrayList<Usuarios> listaAmigos = new ArrayList();
    private ArrayList<Solicitudes> listaSolicitudes = new ArrayList();

    private static final long SerialVersionUID = 777L;

    public Usuarios(String nombre, String apellido, String NumeroTelefono) {
        super(nombre, apellido, NumeroTelefono);
    }
    
    public Usuarios(String NombreUsuario, String contraseña, String nombre, String apellido, String NumeroTelefono) {
        super(nombre, apellido, NumeroTelefono);
        this.NombreUsuario = NombreUsuario;
        this.contraseña = contraseña;
    }

    public ArrayList<Solicitudes> getListaSolicitudes() {
        return listaSolicitudes;
    }

    public void setListaSolicitudes(ArrayList<Solicitudes> listaSolicitudes) {
        this.listaSolicitudes = listaSolicitudes;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Chats> getListaChats() {
        return listaChats;
    }

    public void setListaChats(ArrayList<Chats> listaChats) {
        this.listaChats = listaChats;
    }

    public ArrayList<Usuarios> getListaAmigos() {
        return listaAmigos;
    }

    public void setListaAmigos(ArrayList<Usuarios> listaAmigos) {
        this.listaAmigos = listaAmigos;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "NombreUsuario=" + NombreUsuario + ", contrase\u00f1a=" + contraseña + ", listaChats=" + listaChats + ", listaAmigos=" + listaAmigos + '}';
    }

}
