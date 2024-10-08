#include <iostream>
#include "Figura.cpp"

using namespace std;

class Circulo : public Figura{
    private: 
    int radio;

    public:
    Circulo(int, int);
    void perimetro();
    void area();
};
Circulo::Circulo(int _radio, int _lado): Figura(_lado){
    radio = _radio;
}
void Circulo::perimetro(){
    cout<<"Ingresa el radio del circulo: "<<endl;
    cin>>radio;
    cout<<"El perimetro del Circulo es: "<<(radio * 2)*3.1416<<endl;

}
void Circulo::area(){
    cout<<"Ingresa el radio del circulo: "<<endl;
    cin>>radio;
    cout<<"El area del Circulo es: "<<3.1416 * ((radio)*(radio))<<endl;
}