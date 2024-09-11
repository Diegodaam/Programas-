#include <iostream> 

using namespace std;

class Auto{

private:
    string marca;
    string modelo;
    int ano;
    string color;

public: 
    Auto(string, string, int, string);
    void mostrarinformacion();
};


Auto::Auto(string _marca, string _modelo, int _ano, string _color){
    marca = _marca;
    modelo = _modelo;
    ano = _ano;
    color = _color;
}

void Auto::mostrarinformacion(){
    cout<<"Marca: "<<marca<<endl;
    cout<<"Modelo: "<<modelo<<endl;
    cout<<"Ano: "<<ano<<endl;
    cout<<"Color: "<<color<<endl;
}
