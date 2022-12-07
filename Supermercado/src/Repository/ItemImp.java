package Repository;
import Clases.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemImp implements CrudInterface <Item>{

    List <Item> listaItems = new ArrayList<Item>();

    @Override
    public void save(Item objeto) {
        listaItems.add(objeto);
    }

    @Override
    public void mostrarPantalla() {
        for (Item it : listaItems) {
            System.out.println(it.toString());
        }
    }

    @Override
    public Optional<Item> buscar(Long codigoBuscado) {

        boolean bandera = false;
        for (Item item : listaItems) {
            if (item.getCodigo().equals(codigoBuscado)) {
                System.out.println(item.toString());
                return Optional.of(item);
            }
        }

        if (bandera == false) {
            System.out.println("Item no encontrado");
        }
        return Optional.empty();
    }

    @Override
    public void eliminar(Long codigoBorrado) {
        Optional<Item> item = this.buscar(codigoBorrado);

        if (item.isEmpty()) {
            System.out.println("No se encontró el item a borrar");
        }
        else {
            System.out.println("Item borrado correctamente");
            listaItems.remove(item.get());
        }
    }

    @Override
    public List<Item> traerTodos() {
        return listaItems;
    }
}

