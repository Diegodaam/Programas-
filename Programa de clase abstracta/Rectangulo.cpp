#include <iostream>
#include "Figura.cpp"

using namespace std;

class Rectangulo : public Figura{
    private: 
    int base, altura;

    public:
    Rectangulo(int, int, int);
    void perimetro();
    void area();
};
Rectangulo::Rectangulo(int _altura, int _base, int _lado): Figura(_lado){
    altura = _altura;
    base = _base;
}
void Rectangulo::perimetro(){
    cout<<"Ingresa la base del rectangulo: "<<endl;
    cin>>base;
    cout<<"Ingresa la altura del rectangulo: "<<endl;
    cin>>altura;
    cout<<"El perimetro del cuadrado es: "<<(altura * 2)+(base *2)<<endl;
}
void Rectangulo::area(){
    cout<<"Ingresa la base del rectangulo:  "<<endl;
    cin>>base;
    cout<<"Ingresa la altura del rectangulo: "<<endl;
    cin>>altura;
    cout<<"El area del rectangulo es: "<<base * altura<<endl;
}