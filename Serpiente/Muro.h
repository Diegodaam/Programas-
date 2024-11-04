#include <iostream>
#include <SFML/Graphics.hpp>

using namespace std;
using namespace sf;

class Muro {
    public:
    RectangleShape shapeMuro;
    RectangleShape shapeMuro2;
    RectangleShape shapeMuro3;
    RectangleShape shapeMuro4;
    Muro(int x, int y);
    Vector2f Pos();
    RectangleShape& getshape();
    RectangleShape& getshape2();
    RectangleShape& getshape3();
    RectangleShape& getshape4();


};
