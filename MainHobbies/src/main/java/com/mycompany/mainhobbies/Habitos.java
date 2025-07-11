
package com.mycompany.mainhobbies;

public class Habitos {
    private String name;//Como se llama tu hobbie?
    private String skill;//Que habilidades desarrollas?
    private String like; //Que es lo que mas te gusta de tu hobbie?
    private String kids; //Tambien lo pueden hacer ni;os?
    private int time;   //Cuanto tiempo le dedicas?
    public Habitos next;
    
    public Habitos(String n, String s, String l, String k, int t){
        this(n,s,l,k,t,null);
    }

    public Habitos(String name, String skill, String like, String kids, int time, Habitos next) {
        this.name = name;
        this.skill = skill;
        this.like = like;
        this.kids = kids;
        this.time = time;
        this.next = next;
    }
    
    //GETTERS

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public String getLike() {
        return like;
    }

    public String getKids() {
        return kids;
    }

    public int getTime() {
        return time;
    }

    public Habitos getNext() {
        return next;
    }
    
    
    //SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public void setKids(String kids) {
        this.kids = kids;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setNext(Habitos next) {
        this.next = next;
    }
    
}
