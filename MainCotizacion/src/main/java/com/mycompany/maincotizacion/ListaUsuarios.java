
package com.mycompany.maincotizacion;

public class ListaUsuarios {
   private ListaUsuarios head;
   private boolean actualizar;
   private ListaUsuarios next;
   private String usuario;
   private int contrasena;

    public ListaUsuarios(ListaUsuarios head, boolean actualizar, ListaUsuarios next, String usuario, int contrasena) {
        this.head = null;
        this.actualizar = false;
        this.next = null;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    public  ListaUsuarios(){
        this.head = null;
        deafult();
    }
    

    public void add(String u, int c){     
        ListaUsuarios nuevo = new ListaUsuarios(null, false, null, u, c);
        nuevo.setUsuario(u);
        nuevo.setContrasena(c);
        
        if(head == null){
            head = nuevo;
        }else{
            ListaUsuarios aux = head;
            
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(nuevo);
        }
    }
    public void deafult (){
        add("Diego", 1234);
        add("Juan", 4321);
        add("Lupe", 6789);
        add("Maria", 2211);
        add("Pedro", 1122);
    }
    
    public boolean verificar(String u, int c){
        ListaUsuarios aux = head;
        
        while(aux != null){
            if(aux.getUsuario().equals(u) && aux.getContrasena() == c){
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }






    //GETTERS 

    public ListaUsuarios getHead() {
        return head;
    }

    public boolean isActualizar() {
        return actualizar;
    }

    public ListaUsuarios getNext() {
        return next;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getContrasena() {
        return contrasena;
    }
    
    //SETTERS 

    public void setHead(ListaUsuarios head) {
        this.head = head;
    }

    public void setActualizar(boolean actualizar) {
        this.actualizar = actualizar;
    }

    public void setNext(ListaUsuarios next) {
        this.next = next;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
