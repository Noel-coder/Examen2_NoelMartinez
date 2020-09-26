/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen2_noelmartinez;

import javax.swing.JProgressBar;


public class HiloMensaje extends Thread {
    private JProgressBar barra;
    private int tiempo;
    private boolean vive;
    private boolean avanzar;

    public HiloMensaje() {
    }

    public HiloMensaje(JProgressBar barra, int tiempo) {
        this.barra = barra;
        this.tiempo = tiempo;
        vive = true;
        avanzar = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    
    @Override
    public void run(){
        while (vive) {            
            if (avanzar) {
                barra.setMaximum(tiempo);
                barra.setValue(barra.getValue()+1);
                if (barra.getValue() == tiempo) {
                    vive= false;
                }
            }
            try {
                Thread.sleep(1050);
            } catch (InterruptedException e) {
            }
        }
        barra.setValue(0);
    }
    
}
