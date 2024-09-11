#include <iostream>
#include "Sucursal.cpp"

using namespace std;

int main(){

    Sucursal sucu("Toyota", "Corolla", 2020, "Rojo", "Pedro", "Castellano", 1234, 44, 1, "Sucursal Centro", "Descuento 10%");
    cout<<endl;
    cout<<"**************************************"<<endl;
    sucu.mostrarinformacion();
    cout<<"**************************************"<<endl;
    sucu.mostrarinfosucur();
    cout<<"***************************************"<<endl;
    sucu.venta();


}