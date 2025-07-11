
package com.mycompany.eduplanner;

import javax.swing.JOptionPane;

public class ListTasks {
    public NodoTasks head;
    private int cantNodos;

    public ListTasks() {
        head = null;
        cantNodos = 0;
    }
    
    //METODO PARA AGREGAR TAREAS Y EXAMENES  
    public void add(String s, String a, int w, int d, String m){
        NodoTasks news = new NodoTasks(s, a, w, d, m);
        
        if(head == null){
            head = news;
        }else{
            NodoTasks aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(news);
        }
        cantNodos++;
    }
    
    //METODO PARA MOSTRAR LAS TAREAS Y EXAMENES
    public String show(){
        NodoTasks aux = head;
        String data = "";
        
        if(head == null){
            data = "La lista esta vacia";
        }else{
            data = "Los datos de la lista son: \n";
            while(aux != null){
                data += "Materia: " + aux.getSubject() + "\n";
                data += "Nombre: " + aux.getActivityName()+ "\n";
                data += "Ponderacion: " + aux.getWeighing()+ "\n";
                data += "Dias: " + aux.getDay()+ "\n";
                data += "Mes: " + aux.getMonth()+ "\n";
                data += "\n";
                aux = aux.getNext();
            }
        }
        return data;
    }
    
    public void delete(String nameTask){
        NodoTasks current = head;
        NodoTasks aux = null;
        
        while(current != null){
            if(current.getActivityName().equals(nameTask)){
                if(aux == null){
                    head = current.getNext();
                }else{
                    aux.setNext(current.getNext());
                }
                JOptionPane.showMessageDialog(null, "Eliminado con exito");
                return;
            }else{
                JOptionPane.showMessageDialog(null, "No hay ninguna tarea con ese nombre");
            }
        aux = current;
        current = current.getNext();
        }
    }
}
