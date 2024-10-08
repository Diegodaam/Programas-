//Rrctangulo, Cuadrado, Triangulo, Circulo, Rombo, Hexagono 
#pragma once
#include <iostream>

using namespace std;

class Figura{
    protected:
    int lado;

    public:
    Figura(int);
    virtual void perimetro() = 0;
    virtual void area() = 0;
};

Figura::Figura(int _lado){
    lado = _lado;
}