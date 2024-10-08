#include <iostream>
#include "Figura.cpp"

using namespace std;

class Cuadrado : public Figura{
    private: 
    int lado;

    public:
    Cuadrado(int);
    void perimetro();
    void area();
};
Cuadrado::Cuadrado(int _lado): Figura(_lado){
    lado = _lado;
}
void Cuadrado::perimetro(){
    cout<<"Ingresa el lado del cuadrado: "<<endl;
    cin>>lado;
    cout<<"El perimetro del cuadrado es: "<<lado * 4<<endl;
}
void Cuadrado::area(){
    cout<<"Ingresa el lado de la figura: "<<endl;
    cin>>lado;
    cout<<"El area del cuadrado es: "<<lado * lado<<endl;
}