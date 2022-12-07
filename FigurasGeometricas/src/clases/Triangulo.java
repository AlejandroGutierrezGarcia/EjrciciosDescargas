package clases;

public class Triangulo extends FiguraGeometrica{



    public Triangulo(Integer lados, Double alto, Double largo) {
        super(lados, alto, largo);
    }

    @Override
    public Double calcularArea() {
        return getAlto() * getLargo() / 2;
    }

    @Override
    public Double calcularPerimetro() {
        return getLargo() * 3;
    }
}
