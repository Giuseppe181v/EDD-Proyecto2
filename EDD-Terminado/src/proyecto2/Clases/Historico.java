/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.Clases;

import proyecto2.Clases.Persona;

/**
 *
 * @author Giuseppe Vaccaro
 * 
 * Esta clase representa un historial de las personas que han ocupado habitaciones en el hotel
 * Extiende la clase Persona para incluir información adicional sobre la habitación ocupada
 */

public class Historico extends Persona {    
    private String numHabitacion;
    
     /**
     * Constructor 
     *
     * @param ci            cedula de la persona
     * @param nombre        Nombre de la persona
     * @param apellido      Apellido de la persona
     * @param correo        Correo de la persona
     * @param genero        Género de la persona
     * @param fechaLlegada  Fecha de llegada de la persona
     * @param numHabitacion Número de habitación ocupada por la persona
     */
    public Historico(String ci, String nombre, String apellido, String correo, String genero, String fechaLlegada, String numHabitacion) {
        super(ci, nombre, apellido, correo, genero, fechaLlegada);
        this.numHabitacion = numHabitacion;
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
    
    
    
    

    
    
    
}
