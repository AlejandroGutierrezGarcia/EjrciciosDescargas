package classes;

public class Reserva {

    private Double precioUnitario;

    public Reserva(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public Reserva() {;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
