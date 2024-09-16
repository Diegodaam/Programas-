#include <iostream>
#include <vector>
#include <string>


using namespace std;

class Beneficiario{

    protected: 
    vector<string> Vfecha_inicio;
    vector<int> Vnumcuenta;
    vector<int> Vsaldo_actual;
    vector<int> Vsaldo_anterior;
    vector<string> Vnombre_atendidopor;
    string fecha_inicio;
    int numcuenta;
    int saldo_actual;
    int saldo_anterior;
    string entrada3;
    int Nentrada3;
    int saldo;

    public:
    Beneficiario( string, int, int, int);
    void agregar_beneficiario();

};

Beneficiario::Beneficiario(string _fecha_inicio, int _numcuenta, int _saldo_actual, int _saldo_anterior){
    fecha_inicio = _fecha_inicio;
    numcuenta = _numcuenta;
    saldo_actual = _saldo_actual;
    saldo_anterior = _saldo_anterior;
}
void Beneficiario::agregar_beneficiario(){
    cout<<"Agrega el mes en el que inicio: "<<endl;
    cin>>entrada3;
    Vfecha_inicio.push_back(entrada3);

    cout<<"Agrega el numero de cuenta del beneficiario"<<endl;
    cin>>Nentrada3;
    Vnumcuenta.push_back(Nentrada3);

    cout<<"Agrega el saldo actual del beneficiario: "<<endl;
    cin>>Nentrada3;
    Vsaldo_actual.push_back(Nentrada3);

    Vsaldo_anterior = Vsaldo_actual;

    cout<<"Trabajador que lo atendio: "<<endl;
    cin>>entrada3;
    Vnombre_atendidopor.push_back(entrada3);
}