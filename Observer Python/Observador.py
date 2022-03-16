from Mensaje import *
from abc import abstractmethod

class Observador():
    @abstractmethod
    def actualizar(self, Mensaje):
        pass

class ObservadorUno(Observador):
    def actualizar(self, Mensaje):
        print("ObservadorUno: ", Mensaje.getContenidoMensaje)

class ObservadorDos(Observador):
    def actualizar(self, Mensaje):
        print("ObservadorDos: ", Mensaje.getContenidoMensaje)