#include <iostream>

using namespace std;

class Trabajador{

private:

    string nombreT;
    string apellido;
    int codigo_trabajador;
    int edad;

public:

    Trabajador(string, string, int, int);
    void mostrarinfotra();
};

Trabajador::Trabajador(string _nombreT, string _apellido, int _codigo_trabajador, int _edad){
    nombreT = _nombreT;
    apellido = _apellido;
    codigo_trabajador = _codigo_trabajador;
    edad = _edad;
}
void Trabajador::mostrarinfotra(){
    cout<<"Nombre: "<< nombreT <<endl;
    cout<<"Apellido: "<< apellido <<endl;
    cout<<"Codigo del trabajdor: "<< codigo_trabajador<<endl;
    cout<<"Edad: "<< edad <<endl;
}