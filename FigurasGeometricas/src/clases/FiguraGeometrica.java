package clases;

public abstract class FiguraGeometrica {

    ///Variables
    private Integer lados;
    private Double alto;
    private Double largo;

    //Metodos abstractos
    //Es abstracto por que no tiene implementacion, sabemos que estan, pero no que representan aun
    public abstract Double calcularArea();
    public abstract Double calcularPerimetro();

    //Metodos comunes


    public FiguraGeometrica(Integer lados, Double alto, Double largo) {
        this.lados = lados;
        this.alto = alto;
        this.largo = largo;
    }

    public FiguraGeometrica(Double largo) {
        this.largo = largo;
    }


    public Integer getLados() {
        return lados;
    }

    public void setLados(Integer lados) {
        this.lados = lados;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }
}
