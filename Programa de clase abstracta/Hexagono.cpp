#include <iostream>
#include "Figura.cpp"

using namespace std;

class Hexagono : public Figura{
    private: 
    int apotema;
    int perimetroA;

    public:
    Hexagono(int, int, int);
    void perimetro();
    void area();
};
Hexagono::Hexagono(int _apotema, int _perimetroA, int _lado): Figura(_lado){
    apotema = _apotema;
    perimetroA = _perimetroA;
}
void Hexagono::perimetro(){
    cout<<"Ingresa el lado del Hexagono: "<<endl;
    cin>>lado;
    cout<<"El perimetro del Hexagono es: "<<lado *6<<endl;

}
void Hexagono::area(){
    cout<<"Ingresa el apotema del hexagono:  "<<endl;
    cin>>apotema;
    cout<<"Ingresa el perimetro del hexagono: "<<endl;
    cin>>perimetroA;
    cout<<"El area del Hexagono es: "<<(perimetroA * apotema)/2<<endl;
}