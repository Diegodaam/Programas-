#include <iostream>
#include "Auto.cpp"
#include "Trabajador.cpp"


using namespace std;

class Sucursal: public Auto, Trabajador{
private:
    int id;
    string nombre;
    string promocion;

public: 
    Sucursal( string, string, int, string, string, string, int, int, int, string, string);
    void mostrarinfosucur();
    void venta();
};

Sucursal::Sucursal(string _marca, string _modelo, int _ano, string _color, string _nombreT, string _apellido, int _codigo_trabajador, int _edad, int _id, string _nombre, string _promocion)
    : Auto (_marca, _modelo, _ano, _color), Trabajador( _nombreT, _apellido, _codigo_trabajador, _edad){
    id = _id;
    nombre = _nombre;
    promocion = _promocion; 
}
 
void Sucursal::mostrarinfosucur(){
    mostrarinformacion();
    cout<<"id: "<<id<<endl;
    cout<<"nombre: "<<nombre<<endl;
    cout<<"promocion: "<<promocion<<endl;

}
void Sucursal::venta(){
    mostrarinfosucur();
    mostrarinfotra();
}
