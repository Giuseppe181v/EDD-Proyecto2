/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.EDD;

import proyecto2.EDD.Lista;
import proyecto2.Clases.Cliente;
import javax.swing.JOptionPane;
import proyecto2.Clases.Estado;

/**
 *
 * @author Giuseppe Vaccaro
 */
public class TablaHash {
    //---------------------/ Atributos /----------------------
    private Lista[] tabla;
    private int capacidad;
    
    //-------------------/ Construcotr /----------------------
    /**
     * Constructor de la clase TablaHash
     * @param capacidad 
     */
    public TablaHash(int capacidad) {
        this.tabla = new Lista[capacidad];
        this.capacidad = capacidad;
        
        for (int i = 0; i < capacidad; i++) {
            tabla[i] = new Lista();
        }
    }

    //---------------------/ Metodos /------------------------
    /**
     * Obtiene el arreglo de listas de la tabla de dispersion
     * @return 
     */
    public Lista[] getTabla() {
        return tabla;
    }
    
    /**
     * Cambia el arreglo de listas de la tabla de dispersion
     * @param tabla 
     */
    public void setTabla(Lista[] tabla) {
        this.tabla = tabla;
    }
    
    /**
     * Obtiene la capacidad de la tabla de dispersion
     * @return 
     */
    public int getCapacidad() {
        return capacidad;
    }
    
    /**
     * Cambia la capacidad de la tabla de dispersion
     * @param capacidad 
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    /**
     * Obtiene el codigo hash dado un nombre y un apellido
     * @param nombre
     * @param apellido
     * @return 
     */
    public int codigoHash(String nombre, String apellido){
        int codigo = 0;
        
        for (int i = 0; i < nombre.length(); i++) {
            int valorNumerico = nombre.charAt(i);
            codigo += valorNumerico;
        }
        
        for (int i = 0; i < apellido.length(); i++) {
            int valorNumerico = apellido.charAt(i);
            codigo += valorNumerico;
        }
        
        return codigo % getCapacidad();
    }
    
    /**
     * Inserta un registro de la hoja de estado en la tabla de dispersion
     * @param estado 
     */
    public void insertar(Estado estado){
        int indice = codigoHash(estado.getNombre(), estado.getApellido());
        
        tabla[indice].agregarFinal(estado);        
    }
    
    /**
     * obtiene un registro de la hoja de estado en la tabla de dispersion
     * @param nombre
     * @param apellido
     * @return 
     */
    public Estado obtener(String nombre, String apellido){
        int indice = codigoHash(nombre, apellido);
        
        Lista lista = tabla[indice];
        if(!lista.esVacio()){
            for (int i = 0; i < lista.getNumElementos(); i++) {
                Estado aux = (Estado) lista.obtener(i);

                if(aux.getNombre().equals(nombre) && aux.getApellido().equals(apellido)){
                    return aux;
                }
            }            
        }
        return null;
    }
    
    /**
     * Elimina un registro de la hoja de estado en la tabla de dispersion
     * @param nombre
     * @param apellido 
     */
    public void eliminar(String nombre, String apellido){
        int indice = codigoHash(nombre, apellido);
        
        Lista lista = tabla[indice];
        if(lista.esVacio()){
            System.out.println("No se tiene registro del cliente");
        }
        else{
            for (int i = 0; i < lista.getNumElementos(); i++) {
                Estado aux = (Estado) lista.obtener(i);

                if(aux.getNombre().equals(nombre) && aux.getApellido().equals(apellido)){
                    lista.eliminar(i);
                }
            } 
        }
    }
        
    
    

    
    
    
    
    
    
}
