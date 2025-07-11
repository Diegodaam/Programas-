
package com.mycompany.eduplanner;

public class ListQuestions {
    public NodoQuestions head;
    private int cantNodos;

    public ListQuestions() {
        this.head = head;
        this.cantNodos = cantNodos;
    }
    
    public void add(String q, String a){
        NodoQuestions news = new NodoQuestions(q, a);
        
        if(head == null){
            head = news;
        }else{
        NodoQuestions aux = head;
        while(aux.getNext() != null){
            aux = aux.getNext();
        }
        aux.setNext(news);
        }
        cantNodos++;
    }
    
    public String show(){
        NodoQuestions aux = head;
        String data = "";
        
        if(head == null){
            data = "La lista esta vacia";
        }else{
            data = "Las preguntas son: \n";
            while(aux != null){
                data += "Pregunta: " + aux.getQuestion() + "\n";
                data += "Respuesta: " + aux.getAnswer()+ "\n";
                aux = aux.getNext();
            }
        }
        return data;
    }
    
}
