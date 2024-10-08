#include <iostream>
#include "Cuadrado.cpp"
#include "Rectangulo.cpp"
#include "Triangulo.cpp"
#include "Circulo.cpp"
#include "Rombo.cpp"
#include "Hexagono.cpp"

using namespace std;

int main(){
    int opcion, opcion2;

    Figura *f1 = new Cuadrado(1);
    Figura *f2 = new Rectangulo(1, 1, 1);
    Figura *f3 = new Triangulo(1, 1, 1, 1, 1, 1);
    Figura *f4 = new Circulo(1, 1);
    Figura *f5 = new Rombo(1, 1, 1);
    Figura *f6 = new Hexagono(1, 1, 1);

    while(1){
    cout<<"Ingresa el numero de la figura que quieres calcular: "<<endl;
    cout<<"1-Cuadrado"<<endl; //f1
    cout<<"2-Rectangulo"<<endl; //f2
    cout<<"3-Triangulo"<<endl; //f3
    cout<<"4-Circulo"<<endl;  //f4
    cout<<"5-Rombo"<<endl; //f5
    cout<<"6-Hexagono"<<endl; //f6
    cout<<"0-salir"<<endl;
    cin>>opcion;

    switch(opcion){
        case 0: return 0;
        break;
        case 1: cout<<"Ingresa el numero de lo que deseas calcular: "<<endl;
                cout<<"1-Perimetro"<<endl;
                cout<<"2-Area"<<endl;
                cin>>opcion2;
                if(opcion2 == 1){
                    f1->perimetro();
                }
                else if(opcion2 == 2){
                    f1->area();
                }
        break;
        case 2: cout<<"Ingresa el numero de lo que deseas calcular: "<<endl;
                cout<<"1-Perimetro"<<endl;
                cout<<"2-Area"<<endl;
                cin>>opcion2;
                if(opcion2 == 1){
                    f2->perimetro();
                }
                else if(opcion2 == 2){
                    f2->area();
                }
        break;
        case 3: cout<<"Ingresa el numero de lo que deseas calcular: "<<endl;
                cout<<"1-Perimetro"<<endl;
                cout<<"2-Area"<<endl;
                cin>>opcion2;
                if(opcion2 == 1){
                    f3->perimetro();
                }
                else if(opcion2 == 2){
                    f3->area();
                }
        break;
        case 4: cout<<"Ingresa el numero de lo que deseas calcular: "<<endl;
                cout<<"1-Perimetro"<<endl;
                cout<<"2-Area"<<endl;
                cin>>opcion2;
                if(opcion2 == 1){
                    f4->perimetro();
                }
                else if(opcion2 == 2){
                    f4->area();
                }
        break;
        case 5: cout<<"Ingresa el numero de lo que deseas calcular: "<<endl;
                cout<<"1-Perimetro"<<endl;
                cout<<"2-Area"<<endl;
                cin>>opcion2;
                if(opcion2 == 1){
                    f5->perimetro();
                }
                else if(opcion2 == 2){
                    f5->area();
                }
        break;
        case 6: cout<<"Ingresa el numero de lo que deseas calcular: "<<endl;
                cout<<"1-Perimetro"<<endl;
                cout<<"2-Area"<<endl;
                cin>>opcion2;
                if(opcion2 == 1){
                    f6->perimetro();
                }
                else if(opcion2 == 2){
                    f6->area();
                }
        break;
        default: cout<<"Error, Ingresa un numero dentro del rango"<<endl;
        



    }
    }





}