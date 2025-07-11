
package com.mycompany.mainentrenamiento;

public class Plaza extends Locales{
    private String nombre;
    private int codigo;

    public Plaza(String nombre, int codigo, String comentarios, String opcionRadio, String opcionCheck, String planta) {
        super(comentarios, opcionRadio, opcionCheck, planta);
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

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
