from abc import abstractmethod
import copy


class Carro:
    @abstractmethod
    def Clonar():
        pass

class Audi(Carro):
    Modelo=''

    def __init__(self):
        self.Modelo="Samsung"

    @staticmethod
    def Clonar(Car):
        newCar = copy.deepcopy(Car)
        return newCar
    
    def getModelo(self):
        return self.Modelo