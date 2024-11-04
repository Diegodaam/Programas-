#include <iostream>
#include <SFML/Graphics.hpp>
#include "Muro.h"

using namespace std;
using namespace sf;

Muro::Muro(int x, int y){
    shapeMuro.setSize(Vector2f(15.f, 600.f));
    shapeMuro.setFillColor(Color::Green);          //Muro de la derecha
    shapeMuro.setPosition(x,y);

    shapeMuro2.setSize(Vector2f(600.f, 15.f));
    shapeMuro2.setFillColor(Color::Green);         //Muro de arriba
    shapeMuro2.setPosition(x,y);
    
    shapeMuro3.setSize(Vector2f(15.f, 600.f));
    shapeMuro3.setFillColor(Color::Green);         //Muro de la izquierda
    shapeMuro3.setPosition(x,y);

    shapeMuro4.setSize(Vector2f(600.f, 15.f));
    shapeMuro4.setFillColor(Color::Green);         //Muro de abajo
    shapeMuro4.setPosition(x,y);
}
Vector2f Muro::Pos(){
    return shapeMuro.getPosition();
    return shapeMuro2.getPosition();
    return shapeMuro3.getPosition();
    return shapeMuro4.getPosition();
}
RectangleShape& Muro::getshape(){
    return shapeMuro;
}
RectangleShape& Muro::getshape2(){
    return shapeMuro2;
}
RectangleShape& Muro::getshape3(){
    return shapeMuro3;
}
RectangleShape& Muro::getshape4(){
    return shapeMuro4;
}