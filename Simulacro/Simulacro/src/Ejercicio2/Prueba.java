package Ejercicio2;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("circulo", 2.3);
        Circulo circuloDos = new Circulo("circulo", 2.3);
        Rectangulo rectangulo = new Rectangulo("rectangulo", 3,2);
        Triangulo triangulo = new Triangulo("triangulo", 2,3,2);
        ArrayList<Figura2D> listaFiguras = new ArrayList<>();
        listaFiguras.add(circulo);
        listaFiguras.add(circuloDos);
        listaFiguras.add(rectangulo);
        listaFiguras.add(triangulo);
        for(Figura2D figura : listaFiguras){
            System.out.println(figura);
        }
        if(circulo.equals(triangulo)){
            System.out.println("Son iguales.");
        } else {
            System.out.println("No son iguales.");
        }
    }
}
