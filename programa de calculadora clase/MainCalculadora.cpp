#include <iostream>
#include "calculadora3.cpp"

using namespace std;

int main(){

calculadora cal;

while(1){
    int opcion, num1, num2;
    cout<<"1-Suma\n2-Resta\n3-Multiplicacion\n4-Divicion\n5-Potencia\n6-modulo\n7-raiz\n8-salir\nElije el numero de la operacion que deseas: ";
    cin>>opcion;
        if(opcion < 1 || opcion >8){
                cout<<"Error, escribe un numero dentro del rango"<<endl;

        }
    switch (opcion){
        
        case 1: cout<<"Ingresa 2 valores: "<<endl;
                cin>>num1>>num2;
                cout<<"el resultado de la suma es: "<<cal.suma(&num1, &num2)<<endl;
                break;
        case 2: cout<<"Ingresa 2 valores: "<<endl;
                cin>>num1>>num2;
                cout<<"el resultado de la resta es: "<<cal.resta(&num1, &num2)<<endl;
                break;
        case 3: cout<<"Ingresa 2 valores: "<<endl;
                cin>>num1>>num2;
                cout<<"el resultado de la multiplicacion es: "<<cal.multiplicacion(&num1, &num2)<<endl;
                break;
        case 4: cout<<"Ingresa 2 valores: "<<endl;
                cin>>num1>>num2;
                cout<<"el resultado de la divicion es: "<<cal.divicion(&num1, &num2)<<endl;
                break;
        case 5: cout<<"Ingresa primero la base y luego el exponente: "<<endl;
                cin>>num1>>num2;
                cout<<"el resultado de la potencia es: "<<cal.potencia(&num1, &num2)<<endl;
                break;
        case 6: cout<<"Ingresa 2 valores: "<<endl;
                cin>>num1>>num2;
                cout<<"el resultado de la modulacion es: "<<cal.modulo(&num1, &num2)<<endl;
                break;
        case 7: cout<<"Ingresa 1 valor: "<<endl;
                cin>>num1;
                cout<<"el resultado de la raiz es: "<<cal.raiz(&num1)<<endl;
                break;
        case 8: return 0;
    }


        }

}


