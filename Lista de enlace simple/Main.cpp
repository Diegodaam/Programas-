#include <iostream>
#include "Lista.cpp"
 
using namespace std;

int main(){

    Lista miLista;

    string nombre;
    string apellido;
    int edad;
    string telefono;
    string celular;
    int sueldo;
    string curp;
    string sangre;
    string mascota;
    string escuela;

    int opcion;
    char opcion2;
    char opcion3;
    char opcion4; 

    while(1){
    cout<<".:MENU:."<<endl;
    cout<<"Ingresa el numero de lo que deseas hacer"<<endl;
    cout<<"1-Agregar Trabajador"<<endl;
    cout<<"2-Mostrar informacion de trabajadores"<<endl;
    cout<<"3-Buscar"<<endl;
    cout<<"4-Eliminar"<<endl;
    cout<<"5-Salir"<<endl;
    cin>>opcion;

    switch(opcion){
    case 1: do{
            cout<<"inserta tu nombre: "<<endl;
            cin>>nombre;
            cout<<"Inserta tu apellido: "<<endl;
            cin>>apellido;
            cout<<"Dijita tu edad: "<<endl;
            cin>>edad;
            cout<<"Dijita tu telefono de casa: "<<endl;
            cin>>telefono;
            cout<<"Dijita tu celular personal: "<<endl;
            cin>>celular;
            cout<<"Dijita tu sueldo: "<<endl;
            cin>>sueldo;
            cout<<"Ingresa tu CURP: "<<endl;
            cin>>curp;
            cout<<"Ingresa tu tipo de sangre: "<<endl;
            cin>>sangre;

            cout<<"Tienes mascota? (s/n)"<<endl;
            cin>>opcion2;
            if(opcion2 == 's'){
                cout<<"Inserta el nombre de tu mascota: "<<endl;
                cin>>mascota;
            }else if(opcion2 == 'n'){
                mascota = "ninguna";
            }
            cout<<"Estudias? (s/n)"<<endl;
            cin>>opcion4;
            if(opcion4 == 's'){
                cout<<"Inserta el nombre de tu escuela: "<<endl;
                cin>>escuela;
            }else if(opcion4 == 'n'){
                escuela = "ninguna";
            }

            miLista.agregar(nombre, apellido, edad, telefono, celular, sueldo, curp, sangre, mascota, escuela);
            cout<<"Quieres insertar ortro nodo? (s/n): "<<endl;
            cin>>opcion3;
            }while((opcion3 == 's') || (opcion3 == 'S'));
    break;

    case 2: cout<<"Tus trabajadores son: \n"<<endl;
            miLista.mostrar();
    break;

    case 3: miLista.buscar(nombre);
    break;
    case 4: miLista.eliminar(nombre);  

    break;
    case 5: return 0;
    break;
    default : cout<<"ERROR, Ingresa un numero dentro del rango(1-3)"<<endl;
    }
    }

}