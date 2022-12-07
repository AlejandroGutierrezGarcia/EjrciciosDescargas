import Clases.Cliente;
import Repository.ClienteImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ClienteImp cliImp = new ClienteImp();
        Cliente cli1 = new Cliente(10262L, "Alejandro", "Gutierrez");
        Cliente cli2 = new Cliente(52347L, "Paola", "Garcia");
        Cliente cli3 = new Cliente(30045L, "Sebastian", "Rodriguez");

        //Guardar clientes
        cliImp.save(cli1);

        //Listar clientes
        cliImp.mostrarPantalla();

        //Buscar clientes
        System.out.println("Ingrese el dni del cliente a buscar: ");
        Scanner teclado = new Scanner(System.in);
        Long clienteBuscar = teclado.nextLong();
        cliImp.buscar(clienteBuscar);

        //Borrar cliente
        System.out.println("Ingrese dni de cliente a borrar:");
        Long dniEliminar = teclado.nextLong();
        cliImp.eliminar(dniEliminar);

    }
}