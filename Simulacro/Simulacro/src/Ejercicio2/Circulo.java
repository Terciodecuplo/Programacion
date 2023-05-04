package Ejercicio2;

public class Circulo extends Figura2D implements FiguraGeometrica{
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI+getRadio();
    }
    @Override
    public String toString(){
        double perimetro = calcularPerimetro();
        String atributos = "El nombre de esta figura es: "+ this.getNombre() + " y el perímetro es de " + perimetro;
        return atributos;
    }

    public boolean equals(Circulo circulo){
        if(this.getNombre() == circulo.getNombre() && this.radio == circulo.getRadio()){
            return true;
        } else {
            return false;
        }
    }

}
