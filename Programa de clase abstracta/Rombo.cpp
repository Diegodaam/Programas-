#include <iostream>
#include "Figura.cpp"

using namespace std;

class Rombo : public Figura{
    private: 
    int diagonalMx;
    int diagonalMn;

    public:
    Rombo(int, int, int);
    void perimetro();
    void area();
};
Rombo::Rombo(int _diagonalMx, int _diagonalMn, int _lado): Figura(_lado){
    diagonalMx = _diagonalMx;
    diagonalMn = _diagonalMn;
}
void Rombo::perimetro(){
    cout<<"Ingresa el lado del rombo: "<<endl;
    cin>>lado;
    cout<<"El perimetro del rombo es: "<<lado*4<<endl;

}
void Rombo::area(){
    cout<<"Ingresa la diagonal mayor del rombo:  "<<endl;
    cin>>diagonalMx;
    cout<<"Ingresa la diagonal menor del rombo: "<<endl;
    cin>>diagonalMn;
    cout<<"El area del Triangulo es: "<<(diagonalMx * diagonalMn)/2<<endl;
}