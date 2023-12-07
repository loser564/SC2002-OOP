#ifndef CHILDANIMAL_H
#define CHILDANIMAL_H
#include "Animal.h"
#include <iostream>

using namespace std;

class Dog : public Mammal
{
public:
    Dog() : Mammal(), owner("unknown owner")
    {
        cout << "constructing Dog object" << endl;
    }
    Dog(string n, COLOR c, string o) : Mammal(n, c), owner(o)
    {
        cout << "constructing Dog object" << endl;
    }
    ~Dog()
    {
        cout << "destructing Dog object" << endl;
    }
    void move()
    {
        cout << "Dog moves " << endl;
    }
    void speak()
    {
        cout << "Woof " << endl;
    }
    void eat()
    {
        cout << "Dog eat " << endl;
    }

private:
    string owner;
};

class Cat : public Mammal
{
public:
    Cat() : Mammal()
    {
        cout << "constructing Cat object" << endl;
    }
    Cat(string n, COLOR c) : Mammal(n, c)
    {
        cout << "constructing Cat object" << endl;
    }
    ~Cat()
    {
        cout << "destructing Cat object" << endl;
    }
    void move()
    {
        cout << "Cat moves " << endl;
    }
    void speak()
    {
        cout << "Meow" << endl;
    }
    void eat()
    {
        cout << "Cat eat " << endl;
    }
};

class Lion : public Mammal
{
public:
    Lion() : Mammal()
    {
        cout << "constructing Lion object" << endl;
    }
    Lion(string n, COLOR c) : Mammal(n, c)
    {
        cout << "constructing Lion object" << endl;
    }
    ~Lion()
    {
        cout << "destructing Lion object" << endl;
    }
    void move()
    {
        cout << "Lion moves " << endl;
    }
    void speak()
    {
        cout << "Roar" << endl;
    }
    void eat()
    {
        cout << "Lion eat " << endl;
    }
};
#endif