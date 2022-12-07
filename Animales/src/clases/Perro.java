package clases;

import interfces.Carnivoro;

public class Perro extends Animal implements Carnivoro {
    @Override
    public String sonidoAnimal() {
        return "Guau";
    }

    @Override
    public String comerCarne() {
        return "Estoy comiendo carne";
    }
}
