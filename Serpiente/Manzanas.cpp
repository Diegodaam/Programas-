#include <iostream>
#include <SFML/Graphics.hpp>
#include "Manzanas.h"

using namespace sf;

Manzana::Manzana(){
    shapeM.setSize(Vector2f(15.f, 15.f));
    shapeM.setFillColor(Color::Red);
    GenerarManzana();
}
void Manzana::GenerarManzana(){
    int x = rand() % 39 * 15 +15;
    int y = rand() % 39 * 15 +15;
    shapeM.setPosition(x, y);
}
Vector2f Manzana::Pos(){
    return shapeM.getPosition();
}