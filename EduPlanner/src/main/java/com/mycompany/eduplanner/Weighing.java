package com.mycompany.eduplanner;


//ESTA ES UNA CLASE PARA PODER GENERAR LA TABLA EN EL jINTERNALFRAMEREGISTERSUBJECT

public class Weighing {
    
private String type;
    private int num1;
    private int num2;
    private int num3;
    
    //CONSTRUCTOR
    public Weighing(String type, int num1, int num2, int num3) {
        this.type = type;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    //GETTERS

    public String getType() {
        return type;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }
    
    //SETTERS 
    public void setType(String type) {
        this.type = type;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
    
    
}
