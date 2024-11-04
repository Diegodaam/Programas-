#include <SFML/Graphics.hpp>
#include <iostream>
#include "Manzanas.h"
#include <vector>
#pragma once

using namespace sf;
using namespace std;

struct Nodo{
    RectangleShape segmento;
    Nodo* siguiente;
    Nodo(float x, float y){
        segmento.setSize(Vector2f(15.f, 15.f));
        segmento.setFillColor(Color::White);
        segmento.setPosition(x,y);
        siguiente = nullptr;
    }
};

class Snake: public Manzana{
    protected:
    RectangleShape shape;
    Nodo* cabeza;
    Vector2f direccion;
    float velX = 0.1;
    float velY = 0.0;
    float vel;
    bool haPerdido = false;
    string mensajePerdedor;

    public:
    Snake(int, int);
    bool Mover(RenderWindow &Window, Font& font);
    void comer();
    void render(RenderWindow &Window);
    void updateSegmentos();
    RectangleShape& getShape();
    RectangleShape& getShape2();
    Vector2f cabeza_posicion();
    ~Snake();
};
