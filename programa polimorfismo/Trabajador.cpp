#include <iostream> 
#include <vector>
#include <string>
#include "Persona.cpp"
#include "Beneficiario.cpp"

using namespace std;

class Trabajador: public Persona, Beneficiario{

    protected: 
    vector<int> Vid;
    vector<int> Vsueldo;
    int id;
    int sueldo;
    int entrada2;
    

    public:
    Trabajador();
    Trabajador(string, string, int, int, string, int, int, int);
    virtual void mostrarinfo();
    void agregar_trabajador();
    void agregar_beneficiario();
    void mostrarinfo_beneficiario();
    void mostrarinfo_id();
    void mostrarinfo_numcuenta();

};
Trabajador::Trabajador() : Persona("", ""), Beneficiario("", 0, 0, 0) {
    id = 0;
    sueldo = 0;
}
Trabajador::Trabajador(string _nombre, string _apellido, int _id, int _sueldo, string _fecha_inicio, int _numcuenta, int _sueldo_actual, int _sueldo_anterior): Persona(_nombre, _apellido), Beneficiario(_fecha_inicio, _numcuenta, _sueldo_actual, _sueldo_anterior){
    id = _id;
    sueldo = _sueldo;
}
void Trabajador::mostrarinfo(){
    for(size_t i = 0; i < Vnombre.size(); i++) {
        cout<<endl;
        cout << "Nombre: " << Vnombre[i]<<endl;
        cout << "Apellido: " << Vapellido[i]<<endl;
        cout << "ID: " << Vid[i]<<endl;
        cout << "Sueldo: " << Vsueldo[i] <<"\n"<< endl;
    }
}
void Trabajador::agregar_trabajador(){
   
    Persona::agregar_trabajador();
    
    cout<<"Ingresa el ID del trabajador:"<<endl;
    cin>>entrada2;
    Vid.push_back(entrada2);

    cout<<"Ingresa el sueldo del trabajador:"<<endl;
    cin>>entrada2;
    Vsueldo.push_back(entrada2);
}
void Trabajador::agregar_beneficiario(){
    Persona::agregar_beneficiario();
    Beneficiario::agregar_beneficiario();
}
void Trabajador::mostrarinfo_beneficiario(){
    for(size_t i = 0; i < Vnombre2.size(); i++) {
        cout<<endl;
        cout << "Nombre: " << Vnombre2[i]<<endl;
        cout << "Apellido: " << Vapellido2[i]<<endl;
        cout << "Fecha de inicio: " << Vfecha_inicio[i]<<endl;
        cout << "Numero de cuenta: " << Vnumcuenta[i] << endl;
        cout << "Saldo actual: "<< Vsaldo_actual[i]<<endl;
        cout << "Trabajador que lo atendio: "<< Vnombre_atendidopor[i]<<"\n"<<endl;
        }
}
void Trabajador::mostrarinfo_id(){
    int buscar_id;

    cout<<"Ingresa tu ID: "<<endl;
    cin>>buscar_id;
    bool encontrado = false;
    for (size_t i = 0; i < Vid.size(); i++) {
        if (Vid[i] == buscar_id) {
            cout <<endl;
            cout << "Nombre del trabajador: " << Vnombre[i] << endl;
            cout << "Apellido del trabajador: " << Vapellido[i] << endl;
            cout << "ID del trabajador: " << Vid[i] << endl;
            cout << "Sueldo del trabajador: " << Vsueldo[i] <<"\n"<<endl;
            encontrado = true;
            break;
        }
        if(!encontrado){
            cout<<"Trabajador no encontrado"<<endl;
        }

    } 
    
}
void Trabajador::mostrarinfo_numcuenta(){
        int buscar_numcuenta, opcion3;

    cout<<"Ingresa tu numero de cuenta: "<<endl;
    cin>>buscar_numcuenta;
    bool encontrado = false;
    for (size_t i = 0; i < Vnumcuenta.size(); i++) {
        if (Vnumcuenta[i] == buscar_numcuenta) {
            cout <<endl;
            cout << "Nombre: " << Vnombre2[i] << endl;
            cout << "Apellido: " << Vapellido2[i] << endl;
            cout << "Numero de cuenta: " << Vnumcuenta[i] << endl;
            cout << "Fecha de inicio: " << Vfecha_inicio[i] <<endl;
            cout << "Saldo actual: " << Vsaldo_actual[i] <<endl;
            cout << "Saldo anterior: " << Vsaldo_anterior[i]<<endl;
            cout << "Trabajador que l@ atendio: "<< Vnombre_atendidopor[i]<<"\n"<<endl;
            encontrado = true;
            
        
        
            cout<<"elije la opcion que deseas realizar:\n1-Retirar dinero\n2-Depositar dinero"<<endl;
            cin>>opcion3;


            if(opcion3 > 2 || opcion3 < 1){
                cout<<"Selecciona un numero dentro del rango (1-2)"<<endl;


            }if(opcion3 == 1){//Retirar
                cout<<"Ingresa la cantidad de dinero que deseas retirar: "<<endl;
                cin>>saldo;
                if(Vsaldo_actual[i] >= saldo){
                Vsaldo_actual[i] -= saldo ;
                cout<<"Ahora tu saldo es de: "<<Vsaldo_actual[i]<<endl;
                } else{
                    cout<<"Saldo insuficiente"<<endl;
                }


            }if(opcion3 == 2){//Depositar

                cout<<"Ingresa la cantidad de dinero que deseas depositar"<<endl;
                cin>>saldo;
                Vsaldo_actual[i] += saldo;
                cout<<"Ahora tu saldo es de: "<<Vsaldo_actual[i]<<endl;

            } 
    break;
        }
        if(!encontrado){
            cout<<"Trabajador no encontrado"<<endl;
        }
    }
    
}

