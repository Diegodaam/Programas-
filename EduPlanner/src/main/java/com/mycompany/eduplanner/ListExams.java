/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eduplanner;

import javax.swing.JOptionPane;

public class ListExams {
    public NodoExams head;
    private int cantNodos;

    public ListExams() {
        head = null;
        cantNodos = 0;
    }
    
    //METODO PARA AGREGAR EXAMENES  
    public void add(String s, String a, int w, int d, String m){
        NodoExams news = new NodoExams(s, a, w, d, m);
        
        if(head == null){
            head = news;
        }else{
            NodoExams aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(news);
        }
        cantNodos++;
    }
    
    //METODO PARA MOSTRAR LAS TAREAS Y EXAMENES
    public String show(){
        NodoExams aux = head;
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
    
    public void delete(String nameExam){
        NodoExams current = head;
        NodoExams aux = null;
        
        while(current != null){
            if(current.getActivityName().equals(nameExam)){
                if(aux == null){
                    head = current.getNext();
                }else{
                    aux.setNext(current.getNext());
                }
                JOptionPane.showMessageDialog(null, "Eliminado con exito");
                return;
            }else{
                JOptionPane.showMessageDialog(null, "No hay ningun examen con ese nombre");
            }
        aux = current;
        current = current.getNext();
        }
    }
}
