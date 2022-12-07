package Repository;
import Clases.Factura;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FacturaImp implements CrudInterface <Factura>{

    List <Factura> listaFacturas = new ArrayList <Factura>();
    @Override
    public void save(Factura objeto) {
        listaFacturas.add(objeto);
    }

    @Override
    public void mostrarPantalla() {
        for(Factura factura : listaFacturas){
            System.out.println(factura.toString());
        }
    }

    @Override
    public Optional<Factura> buscar(Long codigoBuscado) {
        boolean flag = false;
        for(Factura f : listaFacturas) {
            if (f.getCodigoFactura().equals(codigoBuscado)) {
                System.out.println(f.toString());
                return Optional.of(f);
            }
        }
        if (flag == false){
            System.out.println("Factura no encontrada");
        }
        return Optional.empty();
    }

    @Override
    public void eliminar(Long codigoBorrado) {
        Optional<Factura> fact = this.buscar(codigoBorrado);

        if (fact.isEmpty()){
            System.out.println("Facctura no encontrada");
        } else {
            System.out.println("Factura borrada correctamente");
            listaFacturas.remove(fact.get());
        }
    }

    @Override
    public List<Factura> traerTodos() {
        return listaFacturas;
    }
}
