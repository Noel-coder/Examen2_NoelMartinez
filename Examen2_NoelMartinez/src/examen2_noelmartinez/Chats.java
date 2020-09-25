/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen2_noelmartinez;

import java.io.Serializable;
import java.util.ArrayList;

public class Chats implements Serializable {
    private ArrayList<Mensajes> listaMensajes = new ArrayList();
    
    private static final long SerialVersionUID = 777L;
    
    public Chats() {
    }

    public Chats(ArrayList<Mensajes> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }

    public ArrayList<Mensajes> getListaMensajes() {
        return listaMensajes;
    }

    public void setListaMensajes(ArrayList<Mensajes> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }

    @Override
    public String toString() {
        return "Chats{" + "listaMensajes=" + listaMensajes + '}';
    }
    
}
