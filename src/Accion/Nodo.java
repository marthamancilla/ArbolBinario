/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accion;

/**
 *
 * @author usuario
 */
public class Nodo {

    private Nodo izq;
    private Nodo der;
    private Nodo padre;
    private char dato;

    /**
     * @return the izq
     */
    public Nodo getIzq() {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    /**
     * @return the der
     */
    public Nodo getDer() {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(Nodo der) {
        this.der = der;
    }

    /**
     * @return the padre
     */
    public Nodo getPadre() {
        return padre;
    }

    /**
     * @param padre the padre to set
     */
    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    /**
     * @return the dato
     */
    public char getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(char dato) {
        this.dato = dato;
    }
}
