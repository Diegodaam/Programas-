
package com.mycompany.eduplanner;

import com.mycompany.eduplanner.NodoUsers;
import javax.swing.JOptionPane;

public class PilaUsers {
    public NodoUsers head;
    
    //CONSTRUCTOR
    public PilaUsers() {
        head = null;
    }
    
    //METODO DE AGREGAR USUARIOS A LA PILA
    public void push(String n, String l, int a, String g, int p){
        NodoUsers news = new NodoUsers(n, l, a, g, p); //PUNTERO LLAMADO NEWS PARA CREAR NUEVOS NODOS
        
        if(head == null){
            head = news;
        }else{
            NodoUsers aux = head;
            head = news;
            news.setNext(aux);
        }
    }
    
    //METODO PARA MOSTRAR USUARIOS DE LA PILA 
    public String show(){
        NodoUsers aux = head;
        String data = "";
        
        if(head == null){
            data = "La pila esta vacia"; 
        }else{
            data = "Los usuarios de la pila son: \n";
            while(aux != null){
                data += "Nombre: " + aux.getName() + "\n";
                data += "Apellido: " + aux.getLastName()+ "\n";
                data += "Edad: " + aux.getAge()+ "\n";
                data += "Genero: " + aux.getGender()+ "\n";
                aux = aux.getNext();
            }
        }
        return data;
    }
    
    //METODO PARA ELIMINAR USUARIOS 
    public String pop(){
        NodoUsers aux = head;
        String data = "";
        
        if(head == null){
            data = "La pila esta vacia";
        }else{
            if(aux.getNext() == null){
                head = null;
            }else{
                aux = aux.getNext();
            }
            data = "Usuario eliminado";
        }
        return data;
    }
    
    //METODO PARA VERIFICAR USUARIOS Y SUS CONTRASENAS 
    public NodoUsers check(String n, int p){
        NodoUsers aux = head;
        if(aux == null){
                JOptionPane.showMessageDialog(null, "Ningun usuario registrado");               
            }
        while(aux != null){
            if(aux.getName().equals(n) && aux.getPassword() == p){
                return aux;
            }
            aux = aux.getNext();
        }
        
        return null;
    }
    
}
