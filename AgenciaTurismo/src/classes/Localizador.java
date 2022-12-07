package classes;

import java.util.List;

public class Localizador {


    List<Reserva> reservas;

    Double total;


    public Localizador( List<Reserva> reservas) {
        this.reservas = reservas;
        this.total = total;
    }

    public Double calculateTotal(){

        var cantHotel = reservas.stream()
                .filter(r -> r instanceof Hotel)
                .count();

        var cantBoleto = reservas.stream()
                .filter(r -> r instanceof Boleto)
                .count();

        var cantTransporte = reservas.stream()
                .filter(r -> r instanceof Transporte)
                .count();

        var cantComida = reservas.stream()
                .filter(r -> r instanceof Comida)
                .count();

        reservas.forEach( re -> {
            if (re instanceof Hotel && cantHotel ==2)
                re.setPrecioUnitario(
                        re.getPrecioUnitario() * 0.95
                );
            else if (re instanceof Boleto && cantBoleto ==2)
                re.setPrecioUnitario(
                        re.getPrecioUnitario() * 0.95
                );
        });

        Double total = reservas.stream()
                .mapToDouble(
                        Reserva::getPrecioUnitario
                )
                .sum();

        if (cantComida >=1 && cantTransporte >=1 && cantHotel >= 1 && cantBoleto >= 1){
            total = total * 0.90;
        }
        return total;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
