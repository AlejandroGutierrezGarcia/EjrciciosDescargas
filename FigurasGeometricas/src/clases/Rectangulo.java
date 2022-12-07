package clases;

public class Rectangulo extends FiguraGeometrica implements Rotable{

    public Rectangulo(Integer lados, Double alto, Double largo) {
        super(lados, alto, largo);
    }

    @Override
    public Double calcularArea() {
        return null;
    }

    @Override
    public Double calcularPerimetro() {
        return null;
    }

    @Override
    public void rotar() {
        Double alto = getAlto();
        Double largo = getLargo();
        setAlto(largo);
        setLargo(alto);
    }

    @Override
    public String toString() {
        return "Rectangulo{}";
    }
}
