/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

import Accion.Nodo;

/**
 *
 * @author usuario
 */
public class Arbol {

    private Nodo raiz;

    public void preorder() {
        preorder(raiz);
    }

    public void preorder(Nodo nodo) {
        System.out.print(nodo.getDato());
        if (nodo.getIzq() != null) {
            preorder(nodo.getIzq());
        }
        if (nodo.getDer() != null) {
            preorder(nodo.getDer());
        }
    }

    public void addNodo(Nodo nodo) {
        this.addNodo(nodo, raiz);
    }

    private void addNodo(Nodo nodo, Nodo raiz) {
        if (raiz == null) {
            this.setRaiz(nodo);
        } else {
            if (nodo.getDato() <= raiz.getDato()) {
                if (raiz.getIzq() == null) {
                    raiz.setIzq(nodo);
                } else {
                    addNodo(nodo, raiz.getIzq());
                }
            } else {
                if (raiz.getDer() == null) {
                    raiz.setDer(nodo);
                } else {
                    addNodo(nodo, raiz.getDer());
                }
            }
        }
    }

    /**
     * @return the raiz
     */
    public Nodo getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}
