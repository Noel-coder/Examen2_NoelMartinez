/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen2_noelmartinez;

import java.io.Serializable;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;


public class Mensajes implements Serializable {
    private JTextArea contenido;
    private Date hora;
    private Date fecha;
    private JCheckBox leido;
    
    private static final long SerialVersionUID = 777L;

    public Mensajes(JTextArea contenido, Date hora, Date fecha, JCheckBox leido) {
        this.contenido = contenido;
        this.hora = hora;
        this.fecha = fecha;
        this.leido = leido;
    }

    public JTextArea getContenido() {
        return contenido;
    }

    public void setContenido(JTextArea contenido) {
        this.contenido = contenido;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public JCheckBox getLeido() {
        return leido;
    }

    public void setLeido(JCheckBox leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Mensajes{" + "contenido=" + contenido + ", hora=" + hora + ", fecha=" + fecha + ", leido=" + leido + '}';
    }
    
    
    
}
