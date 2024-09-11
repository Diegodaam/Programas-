#include <iostream>
#include <cmath>

using namespace std;

class calculadora{

public:

calculadora();
calculadora(int*, int*);
int suma(int *num1, int *num2);
int resta(int *num1, int *num2);
int multiplicacion(int *num1, int *num2);
int divicion(int *num1, int *num2);
int potencia(int *num1, int *num2);
int modulo(int *num1, int *num2);
int raiz(int *num1);

private: 

int num1;
int num2;
int resultado;


};

calculadora::calculadora() {
    num1 = 0;
    num2 = 0;
}

calculadora::calculadora(int *num1, int *num2){
    this -> num1 = *num1;
    this -> num2 = *num2;
}

int calculadora::suma(int *_num1, int *_num2){
    return *_num1 + *_num2;
}
int calculadora::resta(int *_num1, int *_num2){
    return *_num1 - *_num2;
}
int calculadora::multiplicacion(int *_num1, int *_num2){
    return *_num1 * *_num2;
}
int calculadora::divicion(int *_num1, int *_num2){
    return *_num1 / *_num2;
}
int calculadora::potencia(int *_num1, int *_num2){
    return static_cast<int>(pow(*_num1, *_num2));
}
int calculadora::modulo(int *_num1, int *_num2){
    return *_num1 % *_num2;
}
int calculadora::raiz(int *_num1){
    return sqrt(*_num1);
}