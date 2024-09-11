#include <iostream>
 using namespace std;

 class Ahorcado{

   private:

   string palabra;
   string adivinadas;  
   char jugador;
   int error;
   
   void monito();

   public:

   Ahorcado(const string& _palabra);
   void menu();
   void Juego();
   void mostrarEstado();

 };

Ahorcado::Ahorcado(const string& _palabra) {
    error = 0;
    palabra = _palabra;
    adivinadas = string(palabra.length(), '_');
}
   void Ahorcado::menu(){
      cout<<"\n"<<endl;
      cout<<"Bienvenido al juego del ahorcado\n\n\n"<<endl;
      cout<<"_ _ _ _ _ _ "<<endl;
      mostrarEstado();
   }
   void Ahorcado::mostrarEstado() {
    cout <<" ";
    for (char c : adivinadas) {
        cout << c << ' ';
    }
    cout << endl;
    
    monito();

    if (adivinadas == palabra) {
        cout << "Felicidades, Has adivinado la palabra." << endl;
        exit(0);  
    }
}
void Ahorcado::monito(){
   const string monito [] = {
       "  \n\n\n\n\n\n========= \n",  
        " \n\n O\n\n\n\n========= \n",  
        " \n\n O\n |\n\n\n========= \n",  
        " \n\n O\n/|\n\n\n========= \n",  
        " \n\n O\n/|\\\n\n\n========= \n",  
        " \n\n O\n/|\\\n/\n\n========= \n",  
        " \n\n O\n/|\\\n/ \\\n\n========= \n"   
   };
   if (error < 7) {
        cout << monito[error] << endl;
    }
}

 void Ahorcado::Juego(){
    do{
   cout<<"Ingresa las letras para adivinar la palabra"<<endl;
   cin>>jugador;
   cout<<"\n"<<endl;
   bool acerto1 = false;
    for (size_t i = 0; i < palabra.length(); i++) {
        if (palabra[i] == jugador) {
            adivinadas[i] = jugador;
            acerto1 = true;
        }
    }

    if (!acerto1) {
        error++;
    }
   if(error < 7 ){
   mostrarEstado();
   } else {
        cout << "Juego terminado, Has fallado demasiadas veces." << endl;
        
        
    }
    }while(error > 7 );
 }