from abc import abstractclassmethod

class Animal:
    @abstractclassmethod
    def MyAnimal():
        pass

class DogAnimal(Animal):
    @staticmethod
    def MyAnimal():
        print("Perro")

class CatAnimal(Animal):
    @staticmethod
    def MyAnimal():
        print("Gato")