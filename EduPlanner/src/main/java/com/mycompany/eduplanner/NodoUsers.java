
package com.mycompany.eduplanner;

public class NodoUsers {
    private String name;        //NOMBRE = 'n'
    private String lastName;    //APELLIDO = 'l'
    private int age;            //EDAD = 'a'
    private String gender;        //GENERO = 'g'
    private int password;    //CONTRASENA = 'p'
    private NodoUsers next;     //PUNTERO SIGUIENTE
    
    public NodoUsers(String n, String l, int a, String g, int p){
        this(n,l,a,g,p,null);
    }
    
    //CONSTRUCTOR
    public NodoUsers(String name, String lastName, int age, String gender, int password, NodoUsers next) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.password = password;
        this.next = next;
    }
    
    //GETTERS

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    public int getPassword() {
        return password;
    }

    public NodoUsers getNext() {
        return next;
    }
    
    //SETTERS 

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setPassword(int password) {
        this.password = password;
    }

    public void setNext(NodoUsers next) {
        this.next = next;
    }
    
}
