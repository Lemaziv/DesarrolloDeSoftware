from Observador import ObservadorDos, ObservadorUno
from Sujeto import *
from Mensaje import *

def ObserverMain():
    observadorUno = ObservadorUno()
    observadorDos = ObservadorDos()
    sujetoPublicador = SujetoPublicador()

    sujetoPublicador.adjuntar(observadorUno)
    sujetoPublicador.adjuntar(observadorDos)

    sujetoPublicador.notificar(Mensaje("Mensaje"))

if __name__ == "__main__":
    ObserverMain()