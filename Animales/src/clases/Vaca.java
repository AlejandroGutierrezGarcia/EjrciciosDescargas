package clases;

import interfces.Herbivoro;

public class Vaca extends Animal implements Herbivoro {
    @Override
    public String sonidoAnimal() {
        return "Muuuu";
    }

    @Override
    public String comerHierba() {
        return "Estoy comiendo plantas";
    }
}
