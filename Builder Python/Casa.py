class Casa:
    CasaBuild=[]

    def __init__(self):
        self.CasaBuild=list()

    def setPuerta(self):
        self.CasaBuild.append('Puerta')
        return self

    def setTecho(self):
        self.CasaBuild.append('Techo')
        return self

    def setPared(self):
        self.CasaBuild.append('Pared')
        return self

    def PrintCasa(self):
        return self.CasaBuild