/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;

import Interfaces.Menu;
import proyecto2.EDD.TablaHash;
import proyecto2.Clases.Cliente;
import proyecto2.Clases.Estado;
import proyecto2.Clases.Historico;
import proyecto2.Clases.Reserva;
import proyecto2.EDD.ABB;
import proyecto2.EDD.Excel;
import proyecto2.EDD.Lista;
import proyecto2.EDD.NodoABB;

/**
 *
 * @author Giuseppe Vaccaro
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Excel excel = new Excel();
        TablaHash tablaEstado = excel.obtenerEstado();
        ABB arbolReserva = excel.obtenerReserva();
        ABB arbolHistorico = excel.obtenerHistorico();
        Menu menu = new Menu(tablaEstado, arbolReserva, arbolHistorico);
        menu.setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
