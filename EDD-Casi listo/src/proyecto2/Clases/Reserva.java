/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.Clases;

/**
 *
 * @author Antonella Ruiz
/*
 * Esta clase representa una reserva de hotel y extiende la clase Persona para incluir información adicional
 * Contiene atributos de una reserva, como el tipo de habitación, el número de teléfono celular y la fecha de salida.
 */
public class Reserva extends Persona {    
    private String tipoHabitacion;
    private String celular;
    private String fechaSalida;
    
    
    /**
     * Constructor de la clase Reserva.
     *
     * @param ci             La cedula del huésped.
     * @param nombre         El nombre del huésped
     * @param apellido       El apellido del huésped
     * @param correo         El correo electrónico del huésped
     * @param genero         El género del huésped
     * @param tipoHabitacion El tipo de habitación reservada
     * @param celular        El número de teléfono celular del huésped
     * @param fechaLlegada   La fecha de llegada del huésped
     * @param fechaSalida    La fecha de salida del huésped
     */
    public Reserva(String ci, String nombre, String apellido, String correo, String genero, String tipoHabitacion, String celular, String fechaLlegada, String fechaSalida) {
        super(ci, nombre, apellido, correo, genero, fechaLlegada);        
        this.tipoHabitacion = tipoHabitacion;
        this.celular = celular;
        this.fechaSalida = fechaSalida;
    }

     /**
     * Obtiene el tipo de habitación
     *
     * @return  tipo de la habitación reservada.
     */
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    /**
     * Establece el tipo de habitación 
     *
     * @param tipoHabitacion nuevo tipo de habitación reservada.
     */
    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    /**
     * Obtiene el número de teléfono celular del huésped
     *
     * @return número de teléfono celular del huésped
     */
    public String getCelular() {
        return celular;
    }
    
    /**
     * Establece el número de teléfono del huésped
     *
     * @param celular El nuevo número de teléfono del huésped
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }    

    /**
     * Obtiene la fecha de salida del huésped.
     *
     * @return fecha 
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Establece la fecha de salida del huésped
     *
     * @param fechaSalida La nueva fecha de salida 
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
    
}
