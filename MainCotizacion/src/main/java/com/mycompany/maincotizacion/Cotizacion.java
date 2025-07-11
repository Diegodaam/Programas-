
package com.mycompany.maincotizacion;

public class Cotizacion {
    private int CantidadDias;   //cD
    private String TipoHabitacion;  //3 tipos diferentes de habitacion ---tH
    private int precioHabitacion;
    private String TipoPago;    //2 tipos de pagos --- tiP
    private int subtotal;   //sT
    private int iva;    //i
    private int totalPagar; //totP
    private String pais;    //p
    private String ciudad;  //c
    
    private Cotizacion next; 

    public Cotizacion(int CantidadDias, String TipoHabitacion, int precioHabitcion,  String TipoPago, int subtotal, int iva, int totalPagar, String pais, String ciudad, Cotizacion next) {
        this.CantidadDias = CantidadDias;
        this.TipoHabitacion = TipoHabitacion;
        this.precioHabitacion = precioHabitcion;
        this.TipoPago = TipoPago;
        this.subtotal = subtotal;
        this.iva = iva;
        this.totalPagar = totalPagar;
        this.pais = pais;
        this.ciudad = ciudad;
        this.next = null;
    }

    
    
    //GETTERS

    public int getCantidadDias() {
        return CantidadDias;
    }

    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public int getPrecioHabitacion() {
        return precioHabitacion;
    }
    

    public String getTipoPago() {
        return TipoPago;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public int getIva() {
        return iva;
    }

    public int getTotalPagar() {
        return totalPagar;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Cotizacion getNext() {
        return next;
    }
    
    
    //SETTERS 

    public void setCantidadDias(int CantidadDias) {
        this.CantidadDias = CantidadDias;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public void setPrecioHabitacion(int precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
    

    public void setTipoPago(String TipoPago) {
        this.TipoPago = TipoPago;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public void setTotalPagar(int totalPagar) {
        this.totalPagar = totalPagar;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setNext(Cotizacion next) {
        this.next = next;
    }
    
    
}
