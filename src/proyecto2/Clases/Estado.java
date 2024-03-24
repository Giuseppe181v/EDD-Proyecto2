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

    public Estado(String numHabitacion, String ci, String nombre, String apellido, String correo, String genero, String celular, String fechaLlegada) {
        super(ci, nombre, apellido, correo, genero, fechaLlegada);
        this.numHabitacion = numHabitacion;
        this.celular = celular;
    }
    
    public Estado(String numHabitacion, String nombre, String apellido, String correo, String genero, String celular, String fechaLlegada) {
        super(nombre, apellido, correo, genero, fechaLlegada);
        this.numHabitacion = numHabitacion;
        this.celular = celular;
    }

    

    public String getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(String numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    

   
    
    
    
    

  
}
