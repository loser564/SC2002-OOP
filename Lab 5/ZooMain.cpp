#include <iostream>
#include <string>
#include "childAnimal.h"

int main() {
    const int maxAnimals = 3;
    int numAnimals = 0;
    Animal* zoo[maxAnimals];
    bool exit = false;

    while (!exit){
        std::cout << "Select Animal to send to Zoo";
        std::cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << std::endl;

        int choice;
        std::cin >> choice;

        switch(choice){
            case 1: 
                zoo[numAnimals] = new Dog("Dog", Green, "Owner");
                zoo[numAnimals]->move();
                zoo[numAnimals]->speak();
                numAnimals++;
                break;
            case 2: 
                zoo[numAnimals] = new Cat("Cat", Blue);
                zoo[numAnimals]->move();
                zoo[numAnimals]->speak();
                numAnimals++;
                break;
            case 3:
                zoo[numAnimals] = new Lion("Lion", White);
                zoo[numAnimals]->move();
                zoo[numAnimals]->speak();
                numAnimals++;
                break;
            case 4: 
                zoo[numAnimals++] = new Dog("Dog", Green, "Owner");
                zoo[numAnimals++] = new Cat("Cat", Blue);
                zoo[numAnimals++] = new Lion("Lion", White);
                for(int i=0; i<numAnimals; i++){
                    zoo[i]->move();
                    zoo[i]->speak();
                }
                break;
            case 5: 
                exit = true;
                break;
        }
    }

    for(int i=0; i<numAnimals; i++){
        delete zoo[i];
    }

    std::cout << "Program exiting .... " << std::endl;
    return 0;
}
