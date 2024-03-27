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

    /**
     * Obtiene el número de cédula del huésped
     *
     * @return el número de cédula del huésped
     */
    public String getCi() {
        return ci;
    }

    /**
     * Establece el número de cédula del huésped 
     *
     * @param ci el nuevo número de cédula del huésped 
     */
    public void setCi(String ci) {
        this.ci = ci;
    }

    /**
     * Obtiene el nombre del huésped
     *
     * @return nombre del huésped
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del huésped 
     *
     * @param nombre el nuevo nombre del huésped
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del huésped
     *
     * @return el apellido del huésped
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del huésped
     *
     * @param apellido el nuevo apellido del huésped 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el correo del huésped
     *
     * @return el correo del huésped
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo del huésped
     *
     * @param correo el nuevo correo del huésped
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el género del huésped
     *
     * @return el género del huésped
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género del huésped
     *
     * @param genero el nuevo género del huésped
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la fecha de llegada del huésped
     *
     * @return la fecha de llegada del huésped
     */
    public String getFechaLlegada() {
        return fechaLlegada;
    }

    /**
     * Establece la fecha de llegada del huésped
     *
     * @param fechaLlegada la nueva fecha de llegada del huésped
     */
    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    
    
    
}

