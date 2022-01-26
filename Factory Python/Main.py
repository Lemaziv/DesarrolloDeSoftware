from AnimalFactories import *
from Animals import *

def Main():
    dog = DogFactory()
    dog.create_animal().MyAnimal()
    cat = CatFactory()
    cat.create_animal().MyAnimal()