
package com.mycompany.eduplanner;

public class NodoTasks {
    private String subject;
    private String activityName;
    private int weighing;
    private int day;
    private String month;
    private NodoTasks next;
    
    public NodoTasks(String s, String a, int w, int d, String m){
        this(s,a,w,d,m,null);
    }
    
    public NodoTasks(String subject, String activityName, int weighing, int day, String month, NodoTasks next) {
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

    public NodoTasks getNext() {
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

    public void setNext(NodoTasks next) {
        this.next = next;
    }
    
    
    
    
    
}
