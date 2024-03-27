/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.EDD;

/**
 *
 * @author Giuseppe Vaccaro
 */
public class NodoABB<T> {
    //--------------------/ Atributos /------------------------
    private T dato;
    private NodoABB izquierdo;
    private NodoABB derecho;

    //-------------------/ Constructor /----------------------
    /***
     * Constructor de la clase Nodo del arbol BB
     *
     * @param dato El dato que se almacenará en el nodo.
     */
    public NodoABB(T dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
    
    
    //-----------------------/ Metodos /-----------------------
    /**
     * Obtiene el dato del nodo
     * @return 
     */
    public T getDato() {
        return dato;
    }

    /**
     * Cambia el dato del nodo
     * @param dato 
     */
    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * Obtiene el siguiente del nodo del lado izquierdo
     * @return 
     */
    public NodoABB getIzquierdo() {
        return izquierdo;
    }

     /**
     * Cambia el siguiente del nodo del lado izquierdo
     * @param izquierdo 
     */
    public void setIzquierdo(NodoABB izquierdo) {
        this.izquierdo = izquierdo;
    }

    /**
     * Obtiene el siguiente del nodo del lado derecho
     * @return 
     */
    public NodoABB getDerecho() {
        return derecho;
    }

     /**
     * Cambia el siguiente del nodo del lado derecho
     * @param derecho 
     */
    public void setDerecho(NodoABB derecho) {
        this.derecho = derecho;
    }
    
    
    
    
}
