package Clases;

import java.util.List;

public class Factura {

    private Long codigoFactura;
    private Cliente cliente;
    private List<Item> listaItems;
    private double total;

    public Factura() {
    }

    public Factura(Long codigoFactura, Cliente cliente, List<Item> listaItems, double total) {
        this.codigoFactura = codigoFactura;
        this.cliente = cliente;
        this.listaItems = listaItems;
        this.total = total;
    }

    public Long getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(Long codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getListaItems() {
        return listaItems;
    }

    public void setListaItems(List<Item> listaItems) {
        this.listaItems = listaItems;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "codigoFactura=" + codigoFactura +
                ", cliente=" + cliente.toString() +
                ", listaItems=" + listaItems +
                ", total=" + total +
                '}';
    }
}
