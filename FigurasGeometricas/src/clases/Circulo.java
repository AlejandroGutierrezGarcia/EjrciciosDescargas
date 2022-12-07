package clases;

public class Circulo extends FiguraGeometrica{

    private Double radio;

    public Circulo( Double largo) {
        super(largo);
        this.radio = largo/2;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public Double calcularPerimetro() {
        return radio * 2 * Math.PI;
    }

}
