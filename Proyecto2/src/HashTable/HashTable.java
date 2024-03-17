/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTable;

import HashTable.List;
import proyecto2.Clases.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class HashTable {
    private int size;
    private int numElement;
    private List[] table;

    public HashTable(int size) {
        this.numElement = 0;
        this.size = size;
        this.table = new List[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List[] getTable() {
        return table;
    }

    public void setTable(List[] table) {
        this.table = table;
    }
    
    public boolean isEmpty(){
        return this.numElement == 0;
    }
    
    
    
    public int hash(String name, String lastName){
        int nameNum = 0;
        int lastNum = 0;
        for (int i = 0; i < name.length(); i++) {
            int c =  name.charAt(i);
            nameNum = nameNum + c;  
        }
        
        for (int i = 0; i < lastName.length(); i++) {
            int c = lastName.charAt(i);
            lastNum = lastNum - c;
        }
        lastNum = lastNum * (-1);
        
        int op = nameNum * lastNum;
        return op%this.size;
        
    }
    
    public void insertar(Cliente cliente){ 
        int idx = hash(cliente.getName(), cliente.getLastName());
        if(this.table[idx] == null){
            this.table[idx] = new List(cliente);
            
        }else{
            this.table[idx].append(cliente); 

        }
        
    }
    
    public void eliminar(String name, String lastName){
        int idx = hash(name, lastName);
        int lenLista = this.table[idx].len();
        if(lenLista > 1){
            for (int i = 0; i < lenLista; i++) {
                Cliente auxCliente = (Cliente) this.table[idx].get(i);
                if(name == auxCliente.getName() && lastName == auxCliente.getLastName()){
                    this.table[idx].pop(i); 
                    JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito");
                    return;
                }   
            }
            JOptionPane.showMessageDialog(null, "Este cliente no existe");
            
        }
        
        else if(lenLista == 1){
            this.table[idx].pop(0);
            JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito");

        }
        else{
            JOptionPane.showMessageDialog(null, "Este cliente no existe");   
        }

    }
    
    public Cliente getCliente(String name, String lastName){
        int idx = hash(name, lastName);
        List clientes = this.table[idx];
        if(clientes.isEmpty()){
            JOptionPane.showMessageDialog(null, "No existe el cliente solicitado");
            
        }
        else if(clientes.len() == 1){
            return (Cliente) clientes.get(0);
        }
        else if(clientes.len() > 1){
            for (int i = 0; i < clientes.len(); i++) {
                Cliente auxCliente = (Cliente) clientes.get(i);
                if(name == auxCliente.getName() && lastName == auxCliente.getLastName()){
                    return auxCliente;
                }            
            }
            JOptionPane.showMessageDialog(null, "No existe el cliente solicitado");
        }
        return null;    
    }
    
    
    
    
}
