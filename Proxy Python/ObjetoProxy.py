from abc import abstractclassmethod
from asyncio.windows_events import NULL


class FuncionObjeto:
    @abstractclassmethod
    def funcion(self):
        pass


class ObjetoImplementacion(FuncionObjeto):
    def ObjetoImplementacion():
        ObjetoImplementacion.Configuracion()

    @staticmethod
    def funcion():
        print("Hola")

    def Configuracion():
        print("Configurando...")


class ObjetoProxy(FuncionObjeto):
    def __init__(self, object):
        ObjetoImplementacion.name = object

    @staticmethod
    def funcion():
        if object == NULL:
            object.ObjetoImplementacion()
        object.funcion()
