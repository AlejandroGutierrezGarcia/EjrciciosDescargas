package clases;

public class Cuadrado extends FiguraGeometrica{

    public Cuadrado(Integer lados, Double alto, Double largo) {
        super(lados, alto, largo);
    }

    @Override
    public Double calcularArea() {
        return getAlto() * getLargo();
    }

    @Override
    public Double calcularPerimetro() {
        return getLargo() * 2 + getAlto() * 2;
    }
}
