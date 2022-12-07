package Repository;

import Clases.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteImp implements CrudInterface <Cliente> {

    List<Cliente> listaClientes = new ArrayList<>();

    @Override
    public void save(Cliente objeto) {
        listaClientes.add(objeto);
    }

    @Override
    public void mostrarPantalla() {
        listaClientes.forEach(cliente -> System.out.println(cliente));
    }

    @Override
    public Optional<Cliente> buscar(Long dniBuscado) {
        boolean flag = false;
        for(Cliente c : listaClientes) {
            if (c.getDni().equals(dniBuscado)) {
                System.out.println("Dni: " + c.getDni());
                System.out.println("Nombre:  " + c.getNombre());
                System.out.println("Apellido: " + c.getApellido());
                return Optional.of(c);
            }
        }
        if (flag == false){
            System.out.println("Cliente no encontrado");
        }
        return Optional.empty();
    }

    @Override
    public void eliminar(Long dniBorrado) {
        Optional<Cliente> cli = this.buscar(dniBorrado);

        if (cli.isEmpty()){
            System.out.println("Cliente no encontrado");
        } else {
            System.out.println("Cliente borrado correctamente");
            listaClientes.remove(cli.get());
        }
    }

    @Override
    public List<Cliente> traerTodos() {
        return null;
    }
}
