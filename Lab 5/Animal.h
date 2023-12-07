#ifndef ANIMALH
#define ANIMALH
#include <iostream>
#include <string>

using namespace std;

enum COLOR { Green, Blue, White, Black, Brown } ;

class Animal
{
public:
    Animal() : _name("unknown")
    {
        cout << "constructing Animal object " << _name << endl;
    }
    ~Animal()
    {
        cout << "destructing Animal object " << _name << endl;
    }
    Animal(string n, COLOR c) : _name(n), _color(c)
    {
        cout << "constructing " << colorString(_color) << " Animal object " << _name << endl;
    }
    virtual void speak()
    {
        cout << "Animal speaks " << endl;
    }
    virtual void move() = 0;

private:
    string _name;
    COLOR _color;
    string colorString(COLOR c)
    {
        string color;
        switch (c)
        {
        case 0:
            color = "Green";
        case 1:
            color = "Blue";
        case 2:
            color = "White";
        case 3:
            color = "Black";
        case 4:
            color = "Brown";
        }
        return color;
    }
};

class Mammal : public Animal
{
public:
    Mammal() : Animal()
    {
        cout << "constructing Mammal object" << endl;
    }
    Mammal(string n, COLOR c) : Animal(n, c)
    {
        cout << "constructing Mammal object" << endl;
    }
    ~Mammal()
    {
        cout << "destructing Mammal object" << endl;
    }
    virtual void eat()
    {
        cout << "Mammal eat " << endl;
    }
    virtual void move()
    {
        cout << "Mammal moves " << endl;
    }
};
#endif