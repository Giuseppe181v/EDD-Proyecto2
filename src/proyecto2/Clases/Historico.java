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
public class Historico extends Persona {    
    private String numHabitacion;

    public Historico(String ci, String nombre, String apellido, String correo, String genero, String fechaLlegada, String numHabitacion) {
        super(ci, nombre, apellido, correo, genero, fechaLlegada);
        this.numHabitacion = numHabitacion;
    }

    public String getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(String numHabitacion) {
        this.numHabitacion = numHabitacion;
    }
    
    
    
    

    
    
    
}
