/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen2_noelmartinez;


public class Solicitudes {
    private String emisor;
    private Usuarios usuario;

    public Solicitudes() {
    }

    public Solicitudes(String emisor, Usuarios usuario) {
        this.emisor = emisor;
        this.usuario = usuario;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Solicitudes{" + "emisor=" + emisor + ", usuario=" + usuario + '}';
    }
    
    
}
