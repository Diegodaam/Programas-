/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eduplanner;

public class NodoExams {
    private String subject;
    private String activityName;
    private int weighing;
    private int day;
    private String month;
    private NodoExams next;
    
    public NodoExams(String s, String a, int w, int d, String m){
        this(s,a,w,d,m,null);
    }
    
    public NodoExams(String subject, String activityName, int weighing, int day, String month, NodoExams next) {
        this.subject = subject;
        this.activityName = activityName;
        this.weighing = weighing;
        this.day = day;
        this.month = month;
        this.next = next;
    }
    
    //GETTERS

    public String getSubject() {
        return subject;
    }

    public String getActivityName() {
        return activityName;
    }

    public int getWeighing() {
        return weighing;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public NodoExams getNext() {
        return next;
    }
    
    //SETTERS

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public void setWeighing(int weighing) {
        this.weighing = weighing;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setNext(NodoExams next) {
        this.next = next;
    }
    
    
    
    
    
}
