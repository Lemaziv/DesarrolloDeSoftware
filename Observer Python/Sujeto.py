from abc import abstractmethod
from Observador import *

class Sujeto():
    @abstractmethod
    def adjuntar(self):
        pass

    @abstractmethod
    def notificar(self):
        pass

class SujetoPublicador(Sujeto):

    list=[]
    Observador.list = list
    
    def adjuntar(self, o):
        Observador.observador = o
        list.append(o)

    def notificar(self, Mensaje):
        for Observador in list:
            Observador.actualizar(Mensaje)
        