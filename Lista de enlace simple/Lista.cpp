//agregar usuario que guarde su nombre, edad, su telefono, apellido, celular, sueldo, curp, sangre
//tienes mascota? si si nombre de la mascota, estudia? nombre de la escuela?
#include <iostream>

using namespace std;

struct Nodo {
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
    Nodo *siguiente;


};
class Lista{
    Nodo *lista = nullptr;

    public: 
    Lista();
    void agregar(string, string, int, string, string, int, string, string, string, string);
    void mostrar();
    void buscar(string);
    void eliminar(string);
};
Lista::Lista(){
    lista=nullptr;
}

void Lista::agregar(string nom, string ape, int n, string tel, string cel, int suel, string cur, string sang, string masco, string escu){
    Nodo *Nodo2 = new Nodo();
    Nodo2-> edad = n;
    Nodo2-> nombre = nom;
    Nodo2-> telefono = tel;
    Nodo2-> apellido = ape;
    Nodo2-> celular = cel;
    Nodo2-> sueldo = suel;
    Nodo2-> curp = cur;
    Nodo2-> sangre = sang;
    Nodo2-> mascota = masco;
    Nodo2-> escuela = escu;
 
    Nodo *temp = lista;
    Nodo *temp2;

    while((temp != nullptr)){
        temp2 = temp;
        temp = temp-> siguiente;
    }
    if(lista == temp){
        lista = Nodo2;
    } else {
        temp2->siguiente = Nodo2;
    }
    Nodo2-> siguiente = temp;
}
void Lista::mostrar(){
    Nodo *actual = new Nodo();
    actual = lista;

    while(actual != nullptr){
        cout<<"Nombre: "<<actual->nombre<<endl;
        cout<<"Apellido: "<<actual->apellido<<endl;
        cout<<"Edad: "<<actual->edad<<endl;
        cout<<"Telefono: "<<actual->telefono<<endl;
        cout<<"Celular: "<<actual->celular<<endl;
        cout<<"Sueldo: "<<actual->sueldo<<endl;
        cout<<"Curp: "<<actual->curp<<endl;
        cout<<"Tipo de sangre: "<<actual->sangre<<endl;
        cout<<"Mascota: "<<actual->mascota<<endl;
        cout<<"Escuela: "<<actual->escuela<<"\n"<<endl;
        actual = actual->siguiente;
    }
}
void Lista::buscar(string nombr){
    Nodo *actual2 = new Nodo();
    actual2 = lista;

    cout<<"Ingresa el nombre que deseas buscar: "<<endl;
    cin>>nombr;
    cout<<"\n";
    while(actual2 != nullptr){
        if(actual2->nombre == nombr){   
        cout<<"Nombre: "<<actual2->nombre<<endl;
        cout<<"Apellido: "<<actual2->apellido<<endl;
        cout<<"Edad: "<<actual2->edad<<endl;
        cout<<"Telefono: "<<actual2->telefono<<endl;
        cout<<"Celular: "<<actual2->celular<<endl;
        cout<<"Sueldo: "<<actual2->sueldo<<endl;
        cout<<"Curp: "<<actual2->curp<<endl;
        cout<<"Tipo de sangre: "<<actual2->sangre<<endl;
        cout<<"Mascota: "<<actual2->mascota<<endl;
        cout<<"Escuela: "<<actual2->escuela<<"\n"<<endl;
        break;
        }else if(actual2->nombre != nombr){
            actual2 = actual2->siguiente;
        }
    }
}
void Lista::eliminar(string nombr){
    Nodo *actual3 = new Nodo();
    actual3 = lista; 
    Nodo *temp= nullptr;

    cout<<"Ingresa el nombre que deseas eliminar: "<<endl;
    cin>>nombr;
    while((actual3 != nullptr) && (actual3->nombre != nombr)){
            temp = actual3;
            actual3 = actual3->siguiente;
    }
    if(temp == nullptr){
        lista = lista->siguiente;
        delete actual3;
    }
    else{
        temp->siguiente = actual3->siguiente;
        delete actual3;
    }
}
