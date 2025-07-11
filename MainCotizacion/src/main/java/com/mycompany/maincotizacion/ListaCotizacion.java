
package com.mycompany.maincotizacion;

public class ListaCotizacion {
    private Cotizacion head;
    private boolean actualizar;

    public ListaCotizacion(Cotizacion head, boolean actualizar) {
        this.head = head;
        this.actualizar = actualizar;
    }
    
    public void add(int cD, String tH, int pH, String tiP, String p, String c){
        Cotizacion nuevo = new Cotizacion(cD, tH, pH, tiP, 0, 0, 0, p, c, null);
        nuevo.setCantidadDias(cD);
        nuevo.setTipoHabitacion(tH); 
        nuevo.setTipoPago(tiP);
        nuevo.setPais(p);
        nuevo.setCiudad(c);
        
        if(head == null){
            head = nuevo;
        }else {
            Cotizacion aux = head;
            
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(nuevo);
        }
    }
    
    public String show(){
        String datos = "";
        Cotizacion aux = head;
        
        if(head == null){
            datos = "la lista esta vacia";
        }else{
            while(aux != null){
                datos += "Pais: " + aux.getPais() + "\n";
                datos += "Ciudad: " + aux.getCiudad()+ "\n";
                datos += "Dias: " + aux.getCantidadDias() + " - $" + aux.getCantidadDias() * 100 + "\n";
                datos += "Tipo de habitacion : " + aux.getTipoHabitacion()+ "\n";
                datos += "Tipo de pago: " + aux.getTipoPago() + "\n";
                datos += "Subtotal: $" + (aux.getPrecioHabitacion() + (aux.getCantidadDias() * 100)) ;
                datos += "\n";
                datos += "Iva: 16%\n";
                datos += "Total: $" + ((aux.getPrecioHabitacion() + (aux.getCantidadDias() * 100))+(((16*(aux.getPrecioHabitacion() + (aux.getCantidadDias() * 100)))/100))) + "\n";
                
                if(aux.getTipoPago().equals("Mensualidad")){
                    datos += "Mensualidad 6 meses: $" + ((((aux.getPrecioHabitacion() + (aux.getCantidadDias() * 100))+(((16*(aux.getPrecioHabitacion() + (aux.getCantidadDias() * 100)))/100))))/6) + " por mes \n";
                }
                
                datos += "\n";
                aux = aux.getNext();
            }
        }
        return datos;
    }
    
    public boolean vacia(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
    
    
    
    
    //GETTERS

    public Cotizacion getHead() {
        return head;
    }

    public boolean isActualizar() {
        return actualizar;
    }
    
    //SETTERS   

    public void setHead(Cotizacion head) {
        this.head = head;
    }

    public void setActualizar(boolean actualizar) {
        this.actualizar = actualizar;
    }
    
}
