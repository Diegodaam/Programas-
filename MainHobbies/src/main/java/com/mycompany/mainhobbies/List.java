
package com.mycompany.mainhobbies;

import javax.swing.JOptionPane;

public class List {
    private Habitos head;
    private int cantNodos;

    public List() {
        head = null;
        cantNodos = 0;
    }
    
    public void agreagar(String n, String s, String l, String k, int t){
        Habitos news = new Habitos(n, s, l, k, t);
        
        if(head == null){
            head = news;
        }else{
            Habitos aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            
            aux.setNext(news);
        }
        cantNodos++;
    }
    
    public String recorrer(){
        Habitos aux = head;
        String data ="";
        if(head == null){
            data = "La lista esta vacia";
        }else{
            data = "Tus hobbies son: \n";
            while(aux != null){
                data += "Nombre: " + aux.getName() + "\n";
                data += "Habilidades: " + aux.getSkill()+ "\n";
                data += "Gusto: " + aux.getLike()+ "\n";
                data += "Es para ninos: " + aux.getKids()+ "\n";
                data += "Tiempo: " + aux.getTime()+ "\n";
                data += "\n";
                aux = aux.getNext(); 
            }
        }
        return data;
    }   
    
    
    public String eliminar(){
        Habitos aux = head;
        String data = "";
        
        if(head == null){
            data = "La lista esta vacia";
        }else{
            if(aux.getNext() == null){
                head = null;
            }else{
                head = aux.getNext();
            }
            data = "Hobbie eliminado";
        }
        return data;
    }
    
    public void buscar() {
    Habitos aux = head;

    if (head == null) {
        JOptionPane.showMessageDialog(null, "La lista está vacía");
    } else {
        String name1 = JOptionPane.showInputDialog("Ingresa el nombre del hobbie que deseas ver:");
        boolean encontrado = false;

        while (aux != null) {
            if (aux.getName().equalsIgnoreCase(name1)) {
                String data = "Hobbie encontrado:\n";
                data += "Nombre: " + aux.getName() + "\n";
                data += "Habilidades: " + aux.getSkill() + "\n";
                data += "Gusto: " + aux.getLike() + "\n";
                data += "Es para niños: " + aux.getKids() + "\n";
                data += "Tiempo: " + aux.getTime() + "\n";
                JOptionPane.showMessageDialog(null, data);
                encontrado = true;
                break; // Elimina este "break" si quieres que busque todos los hobbies con ese nombre
            }
            aux = aux.getNext();
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún hobbie con ese nombre.");
        }
    }
}
}
