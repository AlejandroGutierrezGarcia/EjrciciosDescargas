package classes;

import java.util.List;

public class ClienteRepository {

    private List<Cliente> clientes;

    public ClienteRepository(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    public ClienteRepository() {
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
