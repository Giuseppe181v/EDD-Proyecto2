/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.EDD;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import static org.apache.poi.ss.usermodel.CellType.FORMULA;
import static org.apache.poi.ss.usermodel.CellType.NUMERIC;
import static org.apache.poi.ss.usermodel.CellType.STRING;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import proyecto2.Clases.Estado;
import proyecto2.Clases.Historico;
import proyecto2.Clases.Reserva;

/**
 *
 * @author Giuseppe Vaccaro
 * 
 * *Clase para leer y procesar datos desde un archivo de Excel
 */
public class Excel {
    
    /**
     * Lee los datos de una hoja específica del archivo de Excel.
     * 
     * @param hoja El índice de la hoja que se desea leer.
     * @return Una lista de listas que representa los datos de la hoja.
     *         Cada lista interna representa una fila, y cada elemento de
     *         la lista interna representa una celda de esa fila.
     */
    public Lista<Lista> leerHoja(int hoja){
        try{
            FileInputStream fileExcel = new FileInputStream("Booking_hotel.xlsx");                         
            Workbook excel = WorkbookFactory.create(fileExcel);   
            Sheet hojaEstado = excel.getSheetAt(hoja);
            
            Lista valoresHoja = new Lista();
            for(Row fila: hojaEstado){
                
                Lista valores = new Lista();
                for(Cell celda: fila){                    
                    
                    if(celda.getCellTypeEnum() == CellType.FORMULA){
                        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");
                        Date fecha = celda.getDateCellValue();
                        String fechaFormateada = formateador.format(fecha);
                        System.out.println(fechaFormateada);
                        valores.agregarFinal(fechaFormateada);
                    }
                    else{
                        DataFormatter convertidor = new DataFormatter();
                        String valorCelda = convertidor.formatCellValue(celda);
                        valores.agregarFinal(valorCelda);                        
                    }
                    
                }
                valoresHoja.agregarFinal(valores);
            }
            
            valoresHoja.eliminarInicio();
            return valoresHoja;
            
        }
        catch(Exception e){
            System.out.println("Error");
        }
        return null;
    }
    
    /**
     * Obtiene los datos de la hoja correspondiente al estado de las reservas
     * 
     * @return tabla hash que contiene la información de las reservas
     *  Cada reserva se almacena en la tabla utilizando el número de
     *   habitación como clave
     */
    public TablaHash obtenerEstado(){
        Lista<Lista> hojaEstado = leerHoja(2);
        
        TablaHash tablaEstado = new TablaHash(hojaEstado.getNumElementos());
        
        for (int i = 0; i < hojaEstado.getNumElementos(); i++) {
            
            Lista<String> fila = hojaEstado.obtener(i);
            if(fila.getNumElementos() == 6){
                fila.agregarInicio("");
            }
            
            String numHab, nombre, apellido, correo, genero, celular, fechaLlegada = "";
            if(fila.obtener(0).isBlank()){
                Lista<String> filaAnterior = hojaEstado.obtener(i-1);                
                fila.reemplazar(filaAnterior.obtener(0), 0);                
            } 
            numHab = fila.obtener(0);            
            nombre = fila.obtener(1);
            apellido = fila.obtener(2);
            correo = fila.obtener(3);
            genero = fila.obtener(4);
            celular = fila.obtener(5);
            fechaLlegada = fila.obtener(6); 
            
            
            Estado nuevoEstado = new Estado(numHab, nombre, apellido, correo, genero, celular, fechaLlegada);
            tablaEstado.insertar(nuevoEstado);
        }
        
        return tablaEstado;
    }
    
    
    /**
     * Obtiene los datos de la hoja correspondiente a las reservas activas
     * 
     * @return Un árbol que contiene la información
     *         de las reservas activas.
     */
    public ABB obtenerReserva(){
        Lista<Lista> hojaReserva = leerHoja(0);
        
        ABB arbolReserva = new ABB();
        
        for (int i = 0; i < hojaReserva.getNumElementos(); i++) {
            
            Lista<String> fila = hojaReserva.obtener(i);                       
                
            String ci, nombre, apellido, correo, genero, tipoHabitacion, celular, fechaLlegada, fechaSalida;
            ci = fila.obtener(0);
            nombre = fila.obtener(1);
            apellido = fila.obtener(2);
            correo = fila.obtener(3);
            genero = fila.obtener(4);
            tipoHabitacion = fila.obtener(5);
            celular = fila.obtener(6);
            fechaLlegada = fila.obtener(7);
            fechaSalida = fila.obtener(8);
            
            Reserva nuevaReserva = new Reserva(ci, nombre, apellido, correo, genero, tipoHabitacion, celular, fechaLlegada, fechaSalida);
            arbolReserva.insertar(nuevaReserva);
        }
        
        return arbolReserva;
    }
    
    /**
     * Obtiene los datos de la hoja correspondiente al historial de reservas
     * @return árbol que contiene la información del historial de reservas
     */
    public ABB obtenerHistorico(){
        Lista<Lista> hojaReserva = leerHoja(3);
        
        ABB arbolReserva = new ABB();
        
        for (int i = 0; i < hojaReserva.getNumElementos(); i++) {
            
            Lista<String> fila = hojaReserva.obtener(i);                       
                
            String ci, nombre, apellido, correo, genero, fechaLlegada, numHabitacion = " ";
            ci = fila.obtener(0);
            nombre = fila.obtener(1);
            apellido = fila.obtener(2);
            correo = fila.obtener(3);
            genero = fila.obtener(4);
            fechaLlegada = fila.obtener(5);
            numHabitacion = fila.obtener(6);
            
            Historico nuevaReserva = new Historico(ci, nombre, apellido, correo, genero, fechaLlegada, numHabitacion);
            arbolReserva.insertar(nuevaReserva);
        }
        
        return arbolReserva;
    }
    
    
    
    
    
}
