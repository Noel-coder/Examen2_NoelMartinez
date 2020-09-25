/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen2_noelmartinez;

import java.io.Serializable;
import java.util.ArrayList;


public class Grupo extends Chats implements Serializable {
    private String nombre;
    private ArrayList <Usuarios> listaMiembros = new ArrayList();
    private Usuarios administrador;
    private ArrayList<Mensajes> listaMensajes = new ArrayList();

    private static final long SerialVersionUID = 777L;
    
    public Grupo() {
    }

    public Grupo(ArrayList<Mensajes> listaMensajes) {
        super(listaMensajes);
    }

    public Grupo(String nombre, ArrayList<Usuarios> listaMiembros, Usuarios administrador, ArrayList<Mensajes> listaMensajes) {
        this.nombre = nombre;
        this.listaMiembros = listaMiembros;
        this.administrador = administrador;
        this.listaMensajes = listaMensajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuarios> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(ArrayList<Usuarios> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public Usuarios getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Usuarios administrador) {
        this.administrador = administrador;
    }

    public ArrayList<Mensajes> getListaMensajes() {
        return listaMensajes;
    }

    public void setListaMensajes(ArrayList<Mensajes> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }

    @Override
    public String toString() {
        return "Grupo{" + "nombre=" + nombre + ", listaMiembros=" + listaMiembros + ", administrador=" + administrador + ", listaMensajes=" + listaMensajes + '}';
    }
    
}
