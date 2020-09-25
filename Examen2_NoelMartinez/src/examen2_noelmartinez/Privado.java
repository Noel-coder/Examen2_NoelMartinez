/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen2_noelmartinez;

import java.io.Serializable;
import java.util.ArrayList;


public class Privado extends Chats implements Serializable {
    private ArrayList<Mensajes> listaMensajes = new ArrayList();
    private Usuarios usuario;

    private static final long SerialVersionUID = 777L;
    
    public Privado() {
    }
    
    public Privado(ArrayList<Mensajes> listaMensajes, Usuarios usuario) {
        this.listaMensajes = listaMensajes;
        this.usuario = usuario;
    }

    public ArrayList<Mensajes> getListaMensajes() {
        return listaMensajes;
    }

    public void setListaMensajes(ArrayList<Mensajes> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Privado{" + "listaMensajes=" + listaMensajes + ", usuario=" + usuario + '}';
    }
    
}
