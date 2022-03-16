from abc import abstractmethod


class Component():
    @abstractmethod
    def operation(self):
        pass


class Decorator(Component):
    def __init__(self, component):
        self._component = component

    @abstractmethod
    def operation(self):
        pass


class ConcreteDecoratorA(Decorator):
    def operation(self):
        self._component.operation()
        


class ConcreteDecoratorB(Decorator):
    def operation(self):
        self._component.operation()



class ConcreteComponent(Component):
    def operation(self):
        pass