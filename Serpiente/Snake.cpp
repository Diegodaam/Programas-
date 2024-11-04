#include <SFML/Graphics.hpp>
#include <iostream>
#include <thread> 
#include <chrono> 
#include "Snake.h"

using namespace sf; 

Snake::Snake(int x, int y){
    cabeza = new Nodo(x,y);
    vel = 5;
    direccion = Vector2f(0.f, -15.f);
} 
Snake::~Snake(){
    Nodo* actual = cabeza;
    while (actual != nullptr) {
        Nodo* siguiente = actual->siguiente;
        delete actual;
        actual = siguiente;
    }
}
bool Snake::Mover(RenderWindow &Window, Font& font){
    Vector2f prevPos = cabeza->segmento.getPosition();

    if (Keyboard::isKeyPressed(Keyboard::Up) && direccion.y == 0)
        direccion = Vector2f(0.f, -15.f);
    else if (Keyboard::isKeyPressed(Keyboard::Down) && direccion.y == 0)
        direccion = Vector2f(0.f, 15.f);
    else if (Keyboard::isKeyPressed(Keyboard::Left) && direccion.x == 0)
        direccion = Vector2f(-15.f, 0.f);
    else if (Keyboard::isKeyPressed(Keyboard::Right) && direccion.x == 0)
        direccion = Vector2f(15.f, 0.f);

    updateSegmentos();

    Nodo* actual = cabeza->siguiente;  
    while (actual != nullptr) {
        if (cabeza->segmento.getGlobalBounds().intersects(actual->segmento.getGlobalBounds())) {
            haPerdido = true;
            Text text("Game over", font, 50);
            text.setFillColor(Color::White);
            text.setPosition(180, 250);
            Window.draw(text);
            Window.display();
            std::this_thread::sleep_for(std::chrono::seconds(2));
            Window.close();
            return true;
        }
        actual = actual->siguiente;
    }

    return false;
}

void Snake::updateSegmentos(){
    Vector2f prevPos = cabeza->segmento.getPosition();
    cabeza->segmento.move(direccion);

    // Mover de manera dinamica
    Nodo* actual = cabeza->siguiente;
    while (actual != nullptr) {
        Vector2f tempPos = actual->segmento.getPosition();
        actual->segmento.setPosition(prevPos);
        prevPos = tempPos;
        actual = actual->siguiente;
    }

}
void Snake::comer(){
    Nodo* nuevoSegmento = new Nodo(cabeza->segmento.getPosition().x, cabeza->segmento.getPosition().y);
    Nodo* actual = cabeza;

    while (actual->siguiente != nullptr) {
        actual = actual->siguiente;
    }

    actual->siguiente = nuevoSegmento; // Enlaza el nuevo segmento
}

void Snake::render(RenderWindow &Window){
   Nodo* actual = cabeza;
    while (actual != nullptr) {
        Window.draw(actual->segmento);
        actual = actual->siguiente;
    }

}

RectangleShape& Snake::getShape(){
    return cabeza->segmento;
}
RectangleShape& Snake::getShape2(){
    return cabeza->segmento;
}

Vector2f Snake::cabeza_posicion(){
    return cabeza->segmento.getPosition();
}