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

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    
}
