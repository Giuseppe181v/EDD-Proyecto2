/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.EDD;

import java.time.LocalDate;
import proyecto2.Clases.Estado;
import proyecto2.Clases.Historico;
import proyecto2.Clases.Reserva;

/**
 *
 * @author Giuseppe Vaccaro
 */
public class ABB<T> {
    private NodoABB raiz;
    private final int RESERVA = 1;
    private final int HISTORICO = 2;

    public ABB(NodoABB raiz) {
        this.raiz = raiz;
    }
    
    public ABB() {
        this.raiz = null;
    }

    public NodoABB getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoABB raiz) {
        this.raiz = raiz;
    }
            
    private void insertarReserva(Reserva reserva){
        if(raiz == null){
            raiz = new NodoABB(reserva);
        }
        else{           
            Reserva datoNodoActual = (Reserva) raiz.getDato();
            
            int ci = Integer.parseInt(reserva.getCi().replace(".", "")); 
            int nodoCi = Integer.parseInt(datoNodoActual.getCi().replace(".", ""));
                        
            if(ci < nodoCi){
                if(raiz.getIzquierdo() == null){
                    raiz.setIzquierdo(new NodoABB(reserva));
                }
                else{
                    insertarReserva(raiz.getIzquierdo(), reserva);                    
                }
            }
            else if(ci > nodoCi){
                if(raiz.getDerecho() == null){
                    raiz.setDerecho(new NodoABB(reserva));
                }
                else{
                    insertarReserva(raiz.getDerecho(), reserva);                    
                }
            }

            
        }
    }
    
    private void insertarReserva(NodoABB nodoActual, Reserva reserva){
        if(raiz == null){
            raiz = new NodoABB(reserva);
        }
        else{           
            Reserva datoNodoActual = (Reserva) nodoActual.getDato();
            
            int ci = Integer.parseInt(reserva.getCi().replace(".", "")); 
            int nodoCi = Integer.parseInt(datoNodoActual.getCi().replace(".", ""));
                        
            if(ci < nodoCi){
                if(nodoActual.getIzquierdo() == null){
                    nodoActual.setIzquierdo(new NodoABB(reserva));
                }
                else{
                    insertarReserva(nodoActual.getIzquierdo(), reserva);                    
                }
            }
            else if(ci > nodoCi){
                if(nodoActual.getDerecho() == null){
                    nodoActual.setDerecho(new NodoABB(reserva));
                }
                else{
                    insertarReserva(nodoActual.getDerecho(), reserva);                    
                }
            }            
        }
    }
    
    private void insertarHistorico(Historico historico){
        if(raiz == null){
            raiz = new NodoABB(historico);
        }
        else{           
            Historico datoNodoActual = (Historico) raiz.getDato();
            
            int ci = Integer.parseInt(historico.getCi().replace(".", "")); 
            int nodoCi = Integer.parseInt(datoNodoActual.getCi().replace(".", ""));
                        
            if(ci < nodoCi){
                if(raiz.getIzquierdo() == null){
                    raiz.setIzquierdo(new NodoABB(historico));
                }
                else{
                    insertarHistorico(raiz.getIzquierdo(), historico);                    
                }
            }
            else if(ci > nodoCi){
                if(raiz.getDerecho() == null){
                    raiz.setDerecho(new NodoABB(historico));
                }
                else{
                    insertarHistorico(raiz.getDerecho(), historico);                    
                }
            }
            else if(ci == nodoCi){
                String[] arrayInsertar = historico.getFechaLlegada().split("/");
                String[] arrayRaiz = datoNodoActual.getFechaLlegada().split("/");
                
                int diaInsertar = Integer.parseInt(arrayInsertar[0]);
                int mesInsertar = Integer.parseInt(arrayInsertar[1]);
                int añoInsertar = Integer.parseInt(arrayInsertar[2]);
                
                int diaRaiz = Integer.parseInt(arrayRaiz[0]);
                int mesRaiz = Integer.parseInt(arrayRaiz[1]);
                int añoRaiz = Integer.parseInt(arrayRaiz[2]);
                                
                LocalDate fechaInsertar = LocalDate.of(añoInsertar, mesInsertar, diaInsertar);
                LocalDate fechaRaiz = LocalDate.of(añoRaiz, mesRaiz, diaRaiz);
                
                if(fechaInsertar.isBefore(fechaRaiz)){
                    if(raiz.getIzquierdo() == null){
                        raiz.setIzquierdo(new NodoABB(historico));
                    }
                    else{
                        insertarHistorico(raiz.getIzquierdo(), historico);                    
                    }
                }
                else if(fechaInsertar.isAfter(fechaRaiz)){
                    if(raiz.getDerecho() == null){
                        raiz.setDerecho(new NodoABB(historico));
                    }
                    else{
                        insertarHistorico(raiz.getDerecho(), historico);                    
                    }
                }
                else{
                    System.out.println("Historico ya registrado");
                }                                                
            }            
        }
    }
    
    private void insertarHistorico(NodoABB nodoActual, Historico historico){
        if(raiz == null){
            raiz = new NodoABB(historico);
        }
        else{           
            Historico datoNodoActual = (Historico) nodoActual.getDato();
            
            int ci = Integer.parseInt(historico.getCi().replace(".", "")); 
            int nodoCi = Integer.parseInt(datoNodoActual.getCi().replace(".", ""));
                        
            if(ci < nodoCi){
                if(nodoActual.getIzquierdo() == null){
                    nodoActual.setIzquierdo(new NodoABB(historico));
                }
                else{
                    insertarHistorico(nodoActual.getIzquierdo(), historico);                    
                }
            }
            else if(ci > nodoCi){
                if(nodoActual.getDerecho() == null){
                    nodoActual.setDerecho(new NodoABB(historico));
                }
                else{
                    insertarHistorico(nodoActual.getDerecho(), historico);                    
                }
            }
            else if(ci == nodoCi){
                String[] arrayInsertar = historico.getFechaLlegada().split("/");
                String[] arrayRaiz = datoNodoActual.getFechaLlegada().split("/");
                
                int diaInsertar = Integer.parseInt(arrayInsertar[0]);
                int mesInsertar = Integer.parseInt(arrayInsertar[1]);
                int añoInsertar = Integer.parseInt(arrayInsertar[2]);
                
                int diaRaiz = Integer.parseInt(arrayRaiz[0]);
                int mesRaiz = Integer.parseInt(arrayRaiz[1]);
                int añoRaiz = Integer.parseInt(arrayRaiz[2]);
                                
                LocalDate fechaInsertar = LocalDate.of(añoInsertar, mesInsertar, diaInsertar);
                LocalDate fechaRaiz = LocalDate.of(añoRaiz, mesRaiz, diaRaiz);
                
                if(fechaInsertar.isBefore(fechaRaiz)){
                    if(nodoActual.getIzquierdo() == null){
                       nodoActual.setIzquierdo(new NodoABB(historico));
                    }
                    else{
                        insertarHistorico(nodoActual.getIzquierdo(), historico);                    
                    }
                }
                else if(fechaInsertar.isAfter(fechaRaiz)){
                    if(nodoActual.getDerecho() == null){
                        nodoActual.setDerecho(new NodoABB(historico));
                    }
                    else{
                        insertarHistorico(nodoActual.getDerecho(), historico);                    
                    }
                }
                else{
                    System.out.println("Historico ya registrado");
                }                                                
            }             
        }
    }
    
    
    public void insertar(Historico historico){
        insertarHistorico(historico);
    }
    
    
    public void insertar(Reserva reserva){
        insertarReserva(reserva);        
    }
     
    public Reserva buscar(int ci){
        if(raiz == null){
            return null;
        }
        else{           
            Reserva datoNodoActual = (Reserva) raiz.getDato();
             
            int nodoCi = Integer.parseInt(datoNodoActual.getCi().replace(".", ""));
                        
            if(ci < nodoCi){
                return buscar(raiz.getIzquierdo(), ci);
            }
            else if(ci > nodoCi){
                return buscar(raiz.getDerecho(), ci);
            }
            else{
                return datoNodoActual;
            }           
        }
    }
    
    private Reserva buscar(NodoABB nodoActual, int ci){
        if(raiz == null){
            return null;
        }
        else{
            if(nodoActual == null){
                System.out.println("Elemento no existente");
            }
            else{
                Reserva datoNodoActual = (Reserva) nodoActual.getDato();

                int nodoCi = Integer.parseInt(datoNodoActual.getCi().replace(".", ""));

                if(ci < nodoCi){
                    return buscar(nodoActual.getIzquierdo(), ci);
                }
                else if(ci > nodoCi){
                    return buscar(nodoActual.getDerecho(), ci);
                }
                else{
                    return datoNodoActual;
                }                           
            }
        }
        return null;
    }
    
    public void eliminar(int ci){
        if(raiz == null){
            System.out.println("Error: arbol vacio");
        }
        else{
            Reserva datoNodoActual = (Reserva) raiz.getDato();
            
            int nodoCi = Integer.parseInt(datoNodoActual.getCi().replace(".", ""));            
            
            NodoABB nodoHijo = null;
            if(ci < nodoCi){
                nodoHijo = (NodoABB) raiz.getIzquierdo();                
            }
            else if(ci > nodoCi){
                nodoHijo = (NodoABB) raiz.getDerecho();                
            }
            else{
                NodoABB<Reserva> sucesor = obtenerSucesor(ci);
                        
                eliminar(Integer.parseInt(sucesor.getDato().getCi().replace(".", "")));

                raiz.setDato(sucesor.getDato());
            }            
                        
            if(nodoHijo != null){
                Reserva datoNodoHijo = (Reserva) nodoHijo.getDato();
                int hijoCi = Integer.parseInt(datoNodoHijo.getCi().replace(".", ""));
                
                if(hijoCi == ci){                    
                    if(nodoHijo.getIzquierdo() == null && nodoHijo.getDerecho() == null){
                        if(raiz.getIzquierdo() == nodoHijo){
                            raiz.setIzquierdo(null);
                        }
                        else{
                            raiz.setDerecho(null);
                        }
                    }
                    else if(nodoHijo.getIzquierdo() != null && nodoHijo.getDerecho() == null){
                        raiz.setIzquierdo(nodoHijo.getIzquierdo());
                    }
                    else if(nodoHijo.getIzquierdo() == null && nodoHijo.getDerecho() != null){
                        raiz.setDerecho(nodoHijo.getDerecho());
                    }
                    else if(nodoHijo.getIzquierdo() != null && nodoHijo.getDerecho() != null){
                        NodoABB<Reserva> sucesor = obtenerSucesor(hijoCi);
                        
                        eliminar(Integer.parseInt(sucesor.getDato().getCi()));
                        
                        nodoHijo.setDato(sucesor);
                    }
                }
                else{
                    eliminar(nodoHijo, ci);
                }
            }
        }
    }
    
    
    private void eliminar(NodoABB nodoActual, int ci){
        if(raiz == null){
            System.out.println("Error: arbol vacio");
        }
        else{
            Reserva datoNodoActual = (Reserva) nodoActual.getDato();
            
            int nodoCi = Integer.parseInt(datoNodoActual.getCi().replace(".", ""));
            
            NodoABB nodoHijo = null;
            if(ci < nodoCi){
                nodoHijo = (NodoABB) nodoActual.getIzquierdo();                
            }
            else if(ci > nodoCi){
                nodoHijo = (NodoABB) nodoActual.getDerecho();                
            }
                        
            if(nodoHijo != null){
                Reserva datoNodoHijo = (Reserva) nodoHijo.getDato();
                int hijoCi = Integer.parseInt(datoNodoHijo.getCi().replace(".", ""));
                
                if(hijoCi == ci){                    
                    if(nodoHijo.getIzquierdo() == null && nodoHijo.getDerecho() == null){
                        if(nodoActual.getIzquierdo() == nodoHijo){
                            nodoActual.setIzquierdo(null);
                        }
                        else{
                            nodoActual.setDerecho(null);
                        }
                    }
                    else if(nodoHijo.getIzquierdo() != null && nodoHijo.getDerecho() == null){
                        nodoActual.setIzquierdo(nodoHijo.getIzquierdo());
                    }
                    else if(nodoHijo.getIzquierdo() == null && nodoHijo.getDerecho() != null){
                        nodoActual.setDerecho(nodoHijo.getDerecho());
                    }
                    else if(nodoHijo.getIzquierdo() != null && nodoHijo.getDerecho() != null){
                        NodoABB<Reserva> sucesor = obtenerSucesor(hijoCi);
                        
                        eliminar(Integer.parseInt(sucesor.getDato().getCi().replace(".", "")));
                        
                        nodoHijo.setDato(sucesor.getDato());
                    }
                }
                else{
                    eliminar(nodoHijo, ci);
                }
            }
        }
    }
        
    
    public NodoABB obtenerSucesor(int ci){
        Lista recorridoInorden = new Lista();
        sucesor(raiz, recorridoInorden, ci, false);
        
        return (NodoABB) recorridoInorden.obtener(1);
    }
    
    private void sucesor(NodoABB actual, Lista lista, int ci, boolean add){
        if(actual != null){
            sucesor(actual.getIzquierdo(), lista, ci, add);
            
            int nodoCi = Integer.parseInt(((Reserva) actual.getDato()).getCi().replace(".", ""));
            
            if(nodoCi == ci){
                lista.agregarFinal(actual);
                add = true;
            }
            if(add && nodoCi != ci){
                lista.agregarFinal(actual);
                add = false;
            }
            
            sucesor(actual.getDerecho(), lista, ci, add);                    
        }
    }
    
     
    
    public void preorden(){
        System.out.println(raiz.getDato());
        preorden(raiz.getIzquierdo());
        preorden(raiz.getDerecho());
    }
    
    private void preorden(NodoABB nodoActual){
        if(nodoActual != null){
            System.out.println(nodoActual.getDato());
            preorden(nodoActual.getIzquierdo());
            preorden(nodoActual.getDerecho());
        }
    }
    
    public void inorden(){
        inorden(raiz.getIzquierdo());
        Historico r = (Historico) raiz.getDato();
            System.out.println(r.getCi());
        inorden(raiz.getDerecho());
    }
    
    private void inorden(NodoABB nodoActual){
        if(nodoActual != null){
            inorden(nodoActual.getIzquierdo());
            Historico r = (Historico) nodoActual.getDato();
            System.out.println(r.getCi());
            inorden(nodoActual.getDerecho());
        }
    }
    
    public void postorden(){
        postorden(raiz.getIzquierdo());
        postorden(raiz.getDerecho());
        System.out.println(raiz.getDato());
    }
    
    private void postorden(NodoABB nodoActual){
        if(nodoActual != null){
            postorden(nodoActual.getIzquierdo());
            postorden(nodoActual.getDerecho());
            System.out.println(nodoActual.getDato());
        }
    }
    
    
}
