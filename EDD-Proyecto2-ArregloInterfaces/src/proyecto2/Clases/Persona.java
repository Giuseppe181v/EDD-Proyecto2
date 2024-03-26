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
    private String ci;
    private String nombre; 
    private String apellido;
    private String correo;
    private String genero;
    private String fechaLlegada;

    /**
     * Constructor de la clase Persona con todos los atributos.
     *
     * @param ci           Número de identificación de la persona.
     * @param nombre       Nombre de la persona.
     * @param apellido     Apellido de la persona.
     * @param correo       Correo electrónico de la persona.
     * @param genero       Género de la persona.
     * @param fechaLlegada Fecha de llegada de la persona.
     */
    public Persona(String ci, String nombre, String apellido, String correo, String genero, String fechaLlegada) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.fechaLlegada = fechaLlegada;
    }
    
    /**
     * Constructor alternativo de la clase Persona sin el atributo ci
     * Se utiliza cuando el número de identificación no está disponible o no es necesario
     */
    public Persona(String nombre, String apellido, String correo, String genero, String fechaLlegada) {
        this.ci = "";
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.fechaLlegada = fechaLlegada;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    
    
    
}

