import classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel(400D);
        Boleto boleto = new Boleto(1000D);
        Transporte transporte = new Transporte(30D);
        Comida comida = new Comida(500D);

        List<Reserva> reservas = List.of(hotel, boleto, transporte, comida);

        Localizador localizador = new Localizador(reservas);

        Cliente cliente = new Cliente("123132123", "Jean");

        cliente.addLocalizador(localizador);

    }
}