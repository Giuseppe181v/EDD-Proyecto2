/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.Clases;

/**
 *
 * @author Giuseppe Vaccaro
 */
public class Persona {
    private String name; 
    private String lastName;
    private String correo;
    private String sex;
    private String fechaLlegada;

    public Persona(String name, String lastName, String correo, String sex, String fechaLlegada) {
        this.name = name;
        this.lastName = lastName;
        this.correo = correo;
        this.sex = sex;
        this.fechaLlegada = fechaLlegada;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    
    
}

