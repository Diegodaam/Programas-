#include <iostream>
#include "Figura.cpp"

using namespace std;

class Triangulo : public Figura{
    private: 
    int base, altura;
    int ladoA, ladoB, ladoC;

    public:
    Triangulo(int, int, int, int, int, int);
    void perimetro();
    void area();
};
Triangulo::Triangulo(int _altura, int _base, int _ladoA, int _ladoB, int _ladoC, int _lado): Figura(_lado){
    altura = _altura;
    base = _base;
    ladoA = _ladoA;
    ladoB = _ladoB;
    ladoC = _ladoC;
}
void Triangulo::perimetro(){
    cout<<"Ingresa los lados del Triangulo: "<<endl;
    cin>>ladoA>>ladoB>>ladoC;
    cout<<"El perimetro del Triangulo es: "<<ladoA + ladoB + ladoC<<endl;

}
void Triangulo::area(){
    cout<<"Ingresa la base del Triangulo:  "<<endl;
    cin>>base;
    cout<<"Ingresa la altura del Triangulo: "<<endl;
    cin>>altura;
    cout<<"El area del Triangulo es: "<<(base * altura)/2<<endl;
}