#include <iostream>
#include <SFML/Graphics.hpp>
#pragma once

using namespace sf;

class Manzana{
    public:
    RectangleShape shapeM;
    Manzana();
    Vector2f Pos();
    void GenerarManzana();
};