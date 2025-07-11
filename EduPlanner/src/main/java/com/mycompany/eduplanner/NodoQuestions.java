
package com.mycompany.eduplanner;

public class NodoQuestions {
    private String question;    //q
    private String answer;      //a
    public NodoQuestions next;
    
    public NodoQuestions(String q, String a){
        this(q,a,null);
    }
    
    //CONSTRUCTOR
    public NodoQuestions(String question, String answer, NodoQuestions next) {
        this.question = question;
        this.answer = answer;
        this.next = next;
    }
    
    //GETTERS
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public NodoQuestions getNext() {
        return next;
    }
    
    //SETTERS   
    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setNext(NodoQuestions next) {
        this.next = next;
    }
    
    
    
    
    
    
}
