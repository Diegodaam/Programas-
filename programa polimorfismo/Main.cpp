#include <iostream>
#include "Trabajador.cpp"

using namespace std;

int main(){
    int opcion, opcionif;
    Trabajador *T = new Trabajador();
    while(1){
    cout<<endl;
    cout<<"Elije el numero de la opcion que quieres realizar: "<<endl;
    cout<<"1-Agregar trabajador\n2-Agregar beneficiario\n3-Ingresar al sistema\n4-Mostrar trabajadores\n5-Mostrar Beneficiarios"<<endl;
    cin>>opcion;
    if(opcion > 5 || opcion < 1){
        cout<<"Ingresa un numero dentro del rango(1-5)"<<endl;
    }

    switch(opcion){

        case 1: T ->agregar_trabajador();
                break;

        case 2: T ->agregar_beneficiario();
                break;
        case 3: cout<<endl;
                cout<<"*****Bienvenido*****\n"<<endl;
                cout<<"Selecciona el numero al area que perteneces:\n1-Trabajador\n2-Beneficiario"<<endl;
                cin>>opcionif;
                if(opcionif > 2 || opcionif < 1){
                    cout<<"Ingresa un numero dentro del rango (1-2)"<<endl;
                }else if(opcionif == 1){
                    T ->mostrarinfo_id();
                }else{
                    T ->mostrarinfo_numcuenta();
                }
                break;

        case 4: T ->mostrarinfo();
                break;
        case 5: T ->mostrarinfo_beneficiario();
                break;
                    
                    




    }
    }
}