/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.EDD;

import java.time.LocalDate;
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
    /**
     * Inserta una reserva en el árbol
     * Si la raiz es nula, crea un nuevo nodo con la reserva proporcionada como dato
     * Si la raiz no es nula, realiza la inserción recursivamente en el subárbol izquierdo o derecho según corresponda
     * @param reserva La reserva a insertar 
     */       
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
    
    /**
     * Inserta una reserva en el árbol a partir de un nodo actual
     * Si el nodo actual es nulo, crea un nuevo nodo con la reserva proporcionada como dato
     * Si el nodo actual no es nulo, realiza la inserción recursivamente en el subárbol izquierdo o derecho según corresponda
     * @param nodoActual Nodo en el que se está realizando la inserción
     * @param reserva  La reserva a insertar 
     */
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
    
    /**
     * Inserta un nuevo registro histórico en el árbol
     * Si el árbol está vacío, crea un nuevo nodo raiz con el registro histórico dado
     * De lo contrario, inserta recursivamente el registro histórico en la posición apropiada
     * Si ya existe un registro con el mismo CI y fecha de llegada, imprime un mensaje indicando que ya está registrado
     * @param historico 
     */
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
    
    /**
     * Método auxiliar recursivo para insertar un registro histórico en el árbol
     * @param nodoActual Nodo que se está evaluando para la inserción 
     * @param historico  Registro històrico a insertar 
     */
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
    
    /**
     * Método auxiliar para llamar a insertarHistorico 
     * @param historico Registro històrico a insertar 
     */
    public void insertar(Historico historico){
        insertarHistorico(historico);
    }
    
    /**
     * Método auxiliar para llamar a insertarReserva
     * @param reserva La reserva  a insertar 
     */
    public void insertar(Reserva reserva){
        insertarReserva(reserva);        
    }
     
    /**
     * Busca una reserva en el árbol utilizando el número de CI como criterio de busquedad
     * @param ci  El número de CI utilizado para buscar la reserva
     * @return La reserva encontrada, o null si no se encuentra ninguna reserva con el número de CI dado
     */
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
    
    
    /**
    * Método auxiliar recursivo para buscar una reserva en el árbol,  comenzando desde el nodo dado
    *
    * @param nodoActual El nodo actual que se está evaluando 
    * @param ci  El número de CI utilizado para buscar la reserva
    * @return La reserva encontrada, o null si no se encuentra ninguna reserva con el número de CI dado
    */
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
    
    /**
     * Elimina una reserva del árbol usando el número de CI como criterio de busquedad
     * @param ci El número de CI utilizado para identificar la reserva a eliminar
     */
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
    
    /**
     * Método auxiliar recursivo para eliminar una reserva del árbol
     * @param nodoActual El nodo que se está evaluando durante la eliminación
     * @param ci El número de CI utilizado para identificar la reserva que se va a eliminar
     */
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
        
    /**
    * Obtiene el sucesor de un nodo en el árbol dado su número de CI.
    * El sucesor es el siguiente nodo en orden inorden después del nodo con el CI proporcionado
    *
    * @param ci El número de CI del nodo del que se desea encontrar el sucesor.
    * @return El nodo sucesor del nodo con el CI dado.
    */
    public NodoABB obtenerSucesor(int ci){
        Lista recorridoInorden = new Lista();
        sucesor(raiz, recorridoInorden, ci, false);
        
        return (NodoABB) recorridoInorden.obtener(1);
    }
    
    
    
    /**
    * Método auxiliar recursivo para encontrar el sucesor de un nodo en el árbol 
    *
    * @param actual El nodo actual que se está evaluando durante la búsqueda 
    * @param lista  La lista en la que se almacenan los nodos visitados durante el recorrido
    * @param ci     El número de CI del nodo del que se desea encontrar el sucesor
    * @param add    Un indicador booleano para controlar si se debe agregar el nodo actual a la lista
    */
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
    
     
    /**
     * Realiza un recorrido en preorden del árbol  e imprime los datos de cada nodo visitado
     */
    public void preorden(){
        System.out.println(raiz.getDato());
        preorden(raiz.getIzquierdo());
        preorden(raiz.getDerecho());
    }
    
    /**
    * Método auxiliar recursivo para realizar un recorrido en preorden 
    *
    * @param nodoActual El nodo actual que se está evaluando durante el recorrido en preorden
    */
    private void preorden(NodoABB nodoActual){
        if(nodoActual != null){
            System.out.println(nodoActual.getDato());
            preorden(nodoActual.getIzquierdo());
            preorden(nodoActual.getDerecho());
        }
    }
      /**
     * Realiza un recorrido en inorden del árbol  e imprime los datos de cada nodo visitado
     */
    public void inorden(){
        inorden(raiz.getIzquierdo());
        Historico r = (Historico) raiz.getDato();
            System.out.println(r.getCi());
        inorden(raiz.getDerecho());
    }
    
    /**
    * Método auxiliar recursivo para realizar un recorrido en inorden del árbol de búsqueda binaria.
    *
    * @param nodoActual El nodo actual que se está evaluando durante el recorrido en inorden.
    */
    private void inorden(NodoABB nodoActual){
        if(nodoActual != null){
            inorden(nodoActual.getIzquierdo());
            Historico r = (Historico) nodoActual.getDato();
            System.out.println(r.getCi());
            inorden(nodoActual.getDerecho());
        }
    }
    
     /**
     * Realiza un recorrido en postorden del árbol  e imprime los datos de cada nodo visitado
     */
    public void postorden(){
        postorden(raiz.getIzquierdo());
        postorden(raiz.getDerecho());
        System.out.println(raiz.getDato());
    }
    
    
    /**
    * Método auxiliar recursivo para realizar un recorrido en postorden del árbol de búsqueda binaria.
    *
    * @param nodoActual El nodo actual que se está evaluando durante el recorrido en postorden.
    */
    private void postorden(NodoABB nodoActual){
        if(nodoActual != null){
            postorden(nodoActual.getIzquierdo());
            postorden(nodoActual.getDerecho());
            System.out.println(nodoActual.getDato());
        }
    }
    
    
}
