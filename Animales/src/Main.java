import clases.*;

public class Main {
    public static String comerAnimal(Animal animal){
        String message = "";

        if(animal instanceof Gato)
            message = ((Gato) animal).comerCarne();
        else if(animal instanceof Perro)
            message = ((Perro) animal).comerCarne();
        else if(animal instanceof Vaca)
            message = ((Vaca) animal).comerHierba();

        return message;
    }

    public static void main(String[] args) {

        Gato gato = new Gato();
        Perro perro = new Perro();
        Vaca vaca = new Vaca();

        System.out.println(gato.sonidoAnimal());
        System.out.println(perro.sonidoAnimal());
        System.out.println(vaca.sonidoAnimal());

        System.out.println(gato.comerCarne());
        System.out.println(perro.comerCarne());
        System.out.println(vaca.comerHierba());

        System.out.println(comerAnimal(gato));

        ComerAnimal comerAnimal = new ComerAnimal();
        comerAnimal.comer(gato);
    }

}
