/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.Clases;

import proyecto2.Clases.Persona;

/**
 *
 * @author Giuseppe Vaccaro
 */
public class Estado extends Persona {
    private String numHabitacion;
    private String celular;
    
     /**
     * Constructor
     *
     * @param numHabitacion Número de habitación ocupada por la persona.
     * @param ci            Número de identificación de la persona.
     * @param nombre        Nombre de la persona.
     * @param apellido      Apellido de la persona.
     * @param correo        Correo electrónico de la persona.
     * @param genero        Género de la persona.
     * @param celular       Número de teléfono de contacto de la persona.
     * @param fechaLlegada  Fecha de llegada de la persona.
     */
    public Estado(String numHabitacion, String ci, String nombre, String apellido, String correo, String genero, String celular, String fechaLlegada) {
        super(ci, nombre, apellido, correo, genero, fechaLlegada);
        this.numHabitacion = numHabitacion;
        this.celular = celular;
    }
    
    /**
     * constructor alternativo sin el atributo CI. 
     * @param numHabitacion
     * @param nombre
     * @param apellido
     * @param correo
     * @param genero
     * @param celular
     * @param fechaLlegada 
     */
    public Estado(String numHabitacion, String nombre, String apellido, String correo, String genero, String celular, String fechaLlegada) {
        super(nombre, apellido, correo, genero, fechaLlegada);
        this.numHabitacion = numHabitacion;
        this.celular = celular;
    }

    

    /**
     * Obtiene el número de habitación del huésped
     *
     * @return el número de habitación del huésped
     */
    public String getNumHabitacion() {
        return numHabitacion;
    }
    /**
     * Establece el número de habitación del huésped
     *
     * @param numHabitacion el nuevo número de habitación del huésped
     */
    public void setNumHabitacion(String numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    /**
     * Obtiene el número de teléfono del huésped
     *
     * @return el número de teléfono del huésped
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Establece el número de teléfono del huésped
     *
     * @param celular el nuevo número de teléfono del del huésped
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }
    

   
    
    
    
    

  
}
