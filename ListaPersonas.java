
package ej_8_1_personas;
import java.util.*;
public class ListaPersonas {
    Vector listaPersonas;
    public ListaPersonas(){
        listaPersonas=new Vector();
    }
    public void anadirPersona(Persona P){
        listaPersonas.add(P);
    }
    public void eliminarPersona(int i){
        listaPersonas.removeElementAt(i);
    }
    public void borrarLista(){
        listaPersonas.removeAllElements();
    }
}
