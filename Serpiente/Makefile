all: compile link

compile:
	g++ -Isrc/include -c main.cpp Snake.cpp Manzanas.cpp Muro.cpp 

link:
	g++ main.o Snake.o Manzanas.o Muro.o  -o main -Lsrc/lib -lsfml-graphics -lsfml-window -lsfml-system -lsfml-audio