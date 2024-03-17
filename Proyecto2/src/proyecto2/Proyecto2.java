/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;

import HashTable.HashTable;
import proyecto2.Clases.Cliente;

/**
 *
 * @author Juan
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashTable nuevo = new HashTable(10);

        Cliente a = new Cliente("Juan", "Nunes", 30556, "@gmail.com", "M", "(123) 123");
        Cliente b = new Cliente("PP", "Vaccaro", 123456, "@gmail.com", "M", "(123) 123");
        Cliente c = new Cliente("Carlos", "Perez", 5879, "@gmail.com", "M", "(123) 123");
        Cliente d = new Cliente("Carolina", "Hola", 52368, "@gmail.com", "M", "(123) 123");
        Cliente e = new Cliente("Carla", "Apellido", 12563, "@gmail.com", "M", "(123) 123");

        nuevo.insertar(a);
        nuevo.insertar(b);
        nuevo.insertar(c);
        nuevo.insertar(d);
        nuevo.insertar(e);
        
        nuevo.eliminar("Juan", "Nunes");
        System.out.println("-a----");
        Cliente aux = nuevo.getCliente("Juan", "Nunes");
        System.out.println(aux);
        
        
    }
    
}
