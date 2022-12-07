package clases;

import interfces.Carnivoro;

public class Gato extends Animal implements Carnivoro {

    @Override
    public String sonidoAnimal() {
        return "Miau";
    }

    @Override
    public String comerCarne() {
        return "Estoy comiendo carne";
    }
}
