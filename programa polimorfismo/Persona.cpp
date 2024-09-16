#include <iostream> 
#include <vector>
#include <string> 

using namespace std;

class Persona{

    protected: 
    vector<string> Vnombre;
    vector<string> Vapellido;
    vector<string> Vnombre2;
    vector<string> Vapellido2;
    string nombre;
    string apellido;
    string entrada;
    string entrada3;

    public:
    Persona(string, string);
    virtual void agregar_trabajador();
    virtual void agregar_beneficiario();


};

Persona::Persona(string _nombre, string _apellido){
    nombre = _nombre;
    apellido = _apellido;
}
void Persona::agregar_trabajador(){

        cout<<"Ingresa el nombre del trabajador:"<<endl;
        cin>>entrada;
         
    
        Vnombre.push_back(entrada);
    
        cout<<"Ingresa el apellido: "<<endl;
        cin>>entrada;
        Vapellido.push_back(entrada);
}
void Persona::agregar_beneficiario(){

        cout<<"Ingresa el nombre del Beneficiario:"<<endl;
        cin>>entrada3;
    
        Vnombre2.push_back(entrada3);
    
        cout<<"Ingresa el apellido del beneficiario: "<<endl;
        cin>>entrada3;
        Vapellido2.push_back(entrada3);
}
