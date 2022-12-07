package clases;

import interfces.IComer;

public class ComerAnimal implements IComer<Animal> {
    @Override
    public String comer(Animal animal) {
        String message = "";

        if(animal instanceof Gato)
            return ((Gato) animal).comerCarne();
        else if(animal instanceof Perro)
            return ((Perro) animal).comerCarne();
        else if(animal instanceof Vaca)
            return ((Vaca) animal).comerHierba();

        return null;
    }
}
