/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.Clases;

/**
 *
 * @author Antonella Ruiz
 */
public class Habitacion {
    private int nroHabitacion;
    private int piso;
    private String tipoHabitacion;

     /**
     * Constructor 
     *
     * @param nroHabitacion  El número de la habitación
     * @param piso El piso en el que se encuentra la habitación
     * @param tipoHabitacion El tipo de habitación (individual, doble, suite, etc.)
     */
    public Habitacion(int nroHabitacion, int piso, String tipoHabitacion) {
        this.nroHabitacion = nroHabitacion;
        this.piso = piso;
        this.tipoHabitacion = tipoHabitacion;
    }

    /**
     * Obtiene el número de habitación del huésped
     *
     * @return el número de habitación del huésped
     */
    public int getNroHabitacion() {
        return nroHabitacion;
    }

    /**
     * Establece el número de habitación del huésped
     *
     * @param nroHabitacion el nuevo número de habitación del huésped
     */
    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    /**
     * Obtiene el piso de la habitación del huésped
     *
     * @return el piso de la habitación del huésped
     */
    public int getPiso() {
        return piso;
    }

    /**
     * Establece el piso de la habitación del huésped
     *
     * @param piso el nuevo piso de la habitación del huésped
     */
    public void setPiso(int piso) {
        this.piso = piso;
    }

    /**
     * Obtiene el tipo de habitación del huésped
     *
     * @return el tipo de habitación del huésped
     */
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    /**
     * Establece el tipo de habitación del huésped
     *
     * @param tipoHabitacion el nuevo tipo de habitación del huésped
     */
    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    
}
