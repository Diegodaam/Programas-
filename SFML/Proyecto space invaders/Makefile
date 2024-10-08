all: compile link

compile:
	g++ -Isrc/include -c main.cpp Player.cpp Bullet.cpp Enemie.cpp Muro.cpp

link:
	g++ main.o Player.o Bullet.o Enemie.o Muro.o -o main -Lsrc/lib -lsfml-graphics -lsfml-window -lsfml-system