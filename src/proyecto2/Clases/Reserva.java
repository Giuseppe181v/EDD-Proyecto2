/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.Clases;

/**
 *
 * @author Giuseppe Vaccaro
 */
public class Reserva extends Persona {    
    private String tipoHabitacion;
    private String celular;
    private String fechaSalida;
    
    // String ci, nombre, apellido, email, genero, tipoHabitacion, celular, fechaLlegada, fechaSalida;

    public Reserva(String ci, String nombre, String apellido, String correo, String genero, String tipoHabitacion, String celular, String fechaLlegada, String fechaSalida) {
        super(ci, nombre, apellido, correo, genero, fechaLlegada);        
        this.tipoHabitacion = tipoHabitacion;
        this.celular = celular;
        this.fechaSalida = fechaSalida;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }    

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
    
}
