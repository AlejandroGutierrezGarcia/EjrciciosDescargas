import clases.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(15.5);
        //17D es para especificar que es 17 peo double y no entero seria como 17.0
        Cuadrado cuadrado = new Cuadrado(4, 17D, 17D);
        Rectangulo rectangulo = new Rectangulo(4,17D,5D);
        Triangulo triangulo = new Triangulo(3,18D,15D);


        List<FiguraGeometrica> figuraGeometricaList = new ArrayList<>();
        figuraGeometricaList.add(circulo);
        figuraGeometricaList.add(cuadrado);
        figuraGeometricaList.add(rectangulo);
        figuraGeometricaList.add(triangulo);


    }
}