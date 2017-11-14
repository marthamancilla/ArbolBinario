/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import Accion.Nodo;
import Arboles.Arbol;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<String> entrada = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Arbol arbol;
        String c;
        int i, inicio, fin;
        while (true) {
            c = sc.nextLine();
            entrada.add(c);
            if ("$".equals(c)) {
                break;
            }
        }
        i = inicio = fin = 0;
        while (i < entrada.size()) {
            arbol = new Arbol();
            for (; i < entrada.size(); i++) {
                if (entrada.get(i).equals("*") || i == entrada.size() - 1) {
                    inicio = i;
                    break;
                }
            }

            for (int j = inicio - 1; j >= fin; j--) {
                for (int k = 0; k < entrada.get(j).length(); k++) {
                    Nodo n = new Nodo();
                    n.setDato(entrada.get(j).charAt(k));
                    arbol.addNodo(n);
                }
            }
            arbol.preorder();
            System.out.println("");
            fin = inicio + 1;
            i = inicio + 1;
        }
    }

}
