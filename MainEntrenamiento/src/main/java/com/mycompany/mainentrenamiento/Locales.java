
package com.mycompany.mainentrenamiento;

public class Locales {
    protected String comentarios;
    protected String opcionRadio;
    protected String opcionCheck;
    protected String planta;

    public Locales(String comentarios, String opcionRadio, String opcionCheck, String planta) {
        this.comentarios = comentarios;
        this.opcionRadio = opcionRadio;
        this.opcionCheck = opcionCheck;
        this.planta = planta;
    }
    
    //GETTERS

    public String getComentarios() {
        return comentarios;
    }

    public String getOpcionRadio() {
        return opcionRadio;
    }

    public String getOpcionCheck() {
        return opcionCheck;
    }

    public String getPlanta() {
        return planta;
    }
    
    //SETTERS 

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public void setOpcionRadio(String opcionRadio) {
        this.opcionRadio = opcionRadio;
    }

    public void setOpcionCheck(String opcionCheck) {
        this.opcionCheck = opcionCheck;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }
    
    
}
