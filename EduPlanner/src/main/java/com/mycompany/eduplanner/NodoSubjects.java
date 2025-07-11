
package com.mycompany.eduplanner;

public class NodoSubjects {
    private String subject;         //Nombre de la materia = s
    private String type;            //Tipo de ponderacion = t
    private float partial1;           //Calificacion del parcial 1 = p1
    private float partial2;           //Calificacion del parcial 2 = p2
    private float partial3;           //Calificacion del parcial 3 = p3
    private boolean checkBox;       //Variable para confirmar si la checkbox ha sido presionada = c
    private NodoSubjects next;      //Puntero siguiente
    
    public NodoSubjects(String s, String t, float p1, float p2, float p3, boolean c){
        this(s,t,p1,p2,p3,c,null);
    }
    
    public NodoSubjects(String subject, String type, float partial1, float partial2, float partial3, boolean checkBox,NodoSubjects next) {
        this.subject = subject;
        this.type = type;
        this.partial1 = partial1;
        this.partial2 = partial2;
        this.partial3 = partial3;
        this.checkBox = checkBox;
        this.next = next;
    }
    
    //GETTERS

    public String getSubject() {
        return subject;
    }

    public String getType() {
        return type;
    }

    public float getPartial1() {
        return partial1;
    }

    public float getPartial2() {
        return partial2;
    }

    public float getPartial3() {
        return partial3;
    }
    
    public boolean getCheckBox() {
        return checkBox;
    }
    
    public NodoSubjects getNext() {
        return next;
    }
   
    
    //SETTERS

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPartial1(float partial1) {
        this.partial1 = partial1;
    }

    public void setPartial2(float partial2) {
        this.partial2 = partial2;
    }

    public void setPartial3(float partial3) {
        this.partial3 = partial3;
    }
    
    public void setCheckBox(boolean checkBox) {
        this.checkBox = checkBox;
    }

    public void setNext(NodoSubjects next) {
        this.next = next;
    }
    
    
    
    
    
    
}
