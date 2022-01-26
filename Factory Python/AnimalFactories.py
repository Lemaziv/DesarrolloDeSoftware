from abc import abstractclassmethod
from Animals import *

class AnimalFactory:
    @abstractclassmethod
    def create_animal(self):
        pass

class DogFactory:
    @staticmethod
    def create_animal():
        return DogAnimal

class CatFactory:
    @staticmethod
    def create_animal():
        return CatAnimal