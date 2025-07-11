
package com.mycompany.eduplanner;


public class ListSubject {
    public NodoSubjects head;
    private int cantNodos;

    public ListSubject() {
        head = null;
        cantNodos = 0;
    }
    
    //METODO PARA AGREGAR MATERIAS 
    public void add(String s, String t, float p1, float p2, float p3, boolean c){
        NodoSubjects news = new NodoSubjects(s, t, p1, p2, p3, c);
        
        if(head == null){
            head = news;
        }else{
            NodoSubjects aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(news);
        }
        cantNodos++;
    }
    
    //METODO PARA MOSTRAR LAS MATERIAS
    public String show(){
        NodoSubjects aux = head;
        String data = "";
        
        if(head == null){
            data = "La lista esta vacia";
        }else{
            data = "Los datos de la lista son: \n";
            while(aux != null){
                data += "Materia: " + aux.getSubject() + "\n";
                data += "Tipo: " + aux.getType()+ "\n";
                data += "Parcial 1: " + aux.getPartial1()+ "\n";
                data += "Parcial 2: " + aux.getPartial2()+ "\n";
                data += "Parcial 3: " + aux.getPartial3()+ "\n";
                data += "\n";
                aux = aux.getNext();
            }
        }
        return data;
    }
    
    
    public String showRecommendations(){
        NodoSubjects aux = head;
        String data = "";
        
        if(head == null){
            data = "No se ha registrado ninguna materia";
        }else{
            while(aux != null){
                if(aux.getCheckBox() == true){
                    if(aux.getPartial2() >= 95){
                        data += "En la materia de " + aux.getSubject() + "\nNecesitas estar mas atento a lo que indica el profesor\n";
                        data += "\n";
                    }
                    if(aux.getPartial2() >= 75 && aux.getPartial2() <= 94){
                        data += "En la materia de " + aux.getSubject() + "\npuedes estar mas relajado, pero no mucho\n";
                        data += "\n";
                    }
                    if(aux.getPartial2() >= 50 && aux.getPartial2() <= 74){
                        data += "En la materia de " + aux.getSubject() + "\npuedes estar totalmente despreocupado pero igual no te confies\n";
                        data += "\n";
                    }
                }else{
                    if(aux.getPartial3() >= 90){
                        data += "En la materia de " + aux.getSubject() + "\nNecesitas estar mas atento a lo que indica el profesor\n";
                        data += "\n";
                    }
                    if(aux.getPartial3() >= 70 && aux.getPartial3() <= 89){
                        data += "En la materia de " + aux.getSubject() + "\npuedes estar mas relajado, pero no mucho\n";
                        data += "\n";
                    }
                    if(aux.getPartial3() >= 50 && aux.getPartial3() <= 69){
                        data += "En la materia de " + aux.getSubject() + "\npuedes estar totalmente despreocupado pero igual no te confies\n";
                        data += "\n";
                    }
                }
            aux = aux.getNext();
            }
        }
        return data;
    }
}
