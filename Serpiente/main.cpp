#include <SFML/Graphics.hpp>
#include <SFML/Audio.hpp>
#include "Snake.h"
#include "Manzanas.h"
#include "Muro.h"
#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>
#include <thread> 
#include <chrono> 

using namespace sf;
using namespace std;


int main(){

	RenderWindow window(VideoMode (600, 600), "Conecta 4");

    Music music;
    if(!music.openFromFile("C:/Users/Diego/Documents/Escuela/POO/Serpiente/Musica.wav")){
        cerr<<" No se pudo cargar el  hola audio"<<endl;
        return -1;
    }

    music.setLoop(true);
    music.play();

    Font font;
    if(!font.loadFromFile("C:/Users/Diego/Documents/Escuela/POO/Serpiente/texto.ttf")){
        system("No se puede cargar la fuente");
        return EXIT_FAILURE;
    }
    srand(static_cast<unsigned>(time(0)));

    Muro muroD(585,0); //Muro derecha
    Muro muroArri(0,0);//Muro arriba
    Muro muroI(0, 0);//Muro izquierda
    Muro muroAba(0,585);//Muro abajo

	Snake serpiente(300,300);

    vector<Manzana> manzana(5);

    Clock reloj;
    float temporizador = 2.5f;

    Clock reloj2;
    float temporizador2 = 0.f, delay = 0.15;

    bool haPerdido2 = false;

    while (window.isOpen())
    {
        Event event;
        while (window.pollEvent(event))
        {
            if (event.type == Event::Closed)
                window.close();
        }


        if (reloj2.getElapsedTime().asSeconds() > delay) {
            serpiente.Mover(window, font);
            reloj2.restart();
        }


        if(reloj.getElapsedTime().asSeconds() >= temporizador){
            manzana.emplace_back();
            reloj.restart();
        }

        for (size_t i = 0; i < manzana.size(); ++i) {
            if (serpiente.getShape().getGlobalBounds().intersects(manzana[i].shapeM.getGlobalBounds())) {
                serpiente.comer(); // Aumentar el tamaño de la serpiente
                manzana.erase(manzana.begin() + i); // Eliminar la manzana comida
                break;
            }
        }

        if (serpiente.getShape().getGlobalBounds().intersects(muroD.getshape().getGlobalBounds())) {
            haPerdido2 = true;
            Text text2("Game over", font, 50);
            text2.setFillColor(Color::White);
            text2.setPosition(180, 250);
            window.draw(text2);
            window.display();
            std::this_thread::sleep_for(std::chrono::seconds(2));
            window.close();  //derecha
        }
        if (serpiente.getShape().getGlobalBounds().intersects(muroArri.getshape2().getGlobalBounds())) {
            haPerdido2 = true;
            Text text2("Game over", font, 50);
            text2.setFillColor(Color::White);
            text2.setPosition(180, 250);
            window.draw(text2);
            window.display();
            std::this_thread::sleep_for(std::chrono::seconds(2));
            window.close();  //arriba
        }
        if (serpiente.getShape().getGlobalBounds().intersects(muroI.getshape3().getGlobalBounds())) {
            haPerdido2 = true;
            Text text2("Game over", font, 50);
            text2.setFillColor(Color::White);
            text2.setPosition(180, 250);
            window.draw(text2);
            window.display();
            std::this_thread::sleep_for(std::chrono::seconds(2));
            window.close();  //izquierda
        }
        if (serpiente.getShape().getGlobalBounds().intersects(muroAba.getshape4().getGlobalBounds())) {
            haPerdido2 = true;
            Text text2("Game over", font, 50);
            text2.setFillColor(Color::White);
            text2.setPosition(180, 250);
            window.draw(text2);
            window.display();
            std::this_thread::sleep_for(std::chrono::seconds(2));
            window.close();  //abajo
        }
            
        
        window.clear();

        for(const auto& manzana : manzana){
            window.draw(manzana.shapeM);
        }

        window.draw(muroD.getshape());
        window.draw(muroArri.getshape2());
        window.draw(muroI.getshape3());
        window.draw(muroAba.getshape4());

        serpiente.render(window);

        window.display();
    }

    return 0;
}

