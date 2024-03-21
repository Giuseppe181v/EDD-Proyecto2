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
    private int id;
    private String tipoHabitacion;
    private String phone;
    private String fechaSalida;
    
    public Reserva(String name, String lastName, String correo, String sex, String fechaLlegada) {
        super(name, lastName, correo, sex, fechaLlegada);
        this.id = id;
        this.fechaSalida = fechaSalida;
        this.phone = phone;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
    
}
