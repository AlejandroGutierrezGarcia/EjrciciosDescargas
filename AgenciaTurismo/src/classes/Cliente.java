package classes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String dni;
    private String nombre;

    private List<Localizador> localizadors;

    public void addLocalizador(Localizador localizador){
        if (localizadors.size() >= 2) {
            var total = localizador.getTotal() * 0.95;
            localizador.setTotal(
                    total
            );
        }
        localizadors.add(localizador);

        System.out.println("El total de la compra es:" + localizador.getTotal());
    }

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.localizadors = new ArrayList<>();
    }

    public List<Localizador> getLocalizadors() {
        return localizadors;
    }

    public void setLocalizadors(List<Localizador> localizadors) {
        this.localizadors = localizadors;
    }

    public Cliente() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
