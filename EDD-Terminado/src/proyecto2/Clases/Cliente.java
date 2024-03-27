/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.Clases;

/**
 *
 * @author Antonella Ruiz
 */
public class Cliente {
    private String name; 
    private String lastName;
    private int id;
    private String correo;
    private String sex;
    private String phone;   

    /**
     * 
     * @param name Nombre del cliente
     * @param lastName Apellido del cliente
     * @param id Cedula del cliente
     * @param correo Correo del cliente
     * @param sex Género del cliente
     * @param phone Telefono 
     */
    public Cliente(String name, String lastName, int id, String correo, String sex, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.correo = correo;
        this.sex = sex;
        this.phone = phone;
        this.correo = correo;
        
    }
    /**
     * Obtiene el número de cédula del huésped
     *
     * @return el número de cédula del huésped
     */
    public int getId() {
        return id;
    }

    

    /**
     * Establece el número de cédula del huésped 
     *
     * @param id el nuevo número de cédula del huésped 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del huésped
     *
     * @return nombre del huésped
     */
    public String getName() {
        return name;
    }

    

    /**
     * Establece el nombre del huésped 
     *
     * @param name el nuevo nombre del huésped
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el apellido del huésped
     *
     * @return el apellido del huésped
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Establece el apellido del huésped
     *
     * @param lastName el nuevo apellido del huésped 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public String getSex() {
        return sex;
    }

    /**
     * Establece el género del huésped
     *
     * @param sex el nuevo género del huésped
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Obtiene el número de teléfono del huésped
     *
     * @return el número de teléfono del huésped
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Establece el número de teléfono del huésped
     *
     * @param phone el nuevo número de teléfono del huésped
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
