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
    private int numHabitacion;
    private String phone;

    public Estado(String name, String lastName, String correo, String sex, String fechaLlegada) {
        super(name, lastName, correo, sex, fechaLlegada);
        this.numHabitacion = numHabitacion;
        this.phone = phone;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
    

  
}
