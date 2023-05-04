package Ejercicio2;

public class Triangulo extends Figura2D implements FiguraGeometrica {
    private double ladoUno;
    private double ladoDos;
    private double ladoTres;

    public Triangulo(String nombre, double ladoUno, double ladoDos, double ladoTres) {
        super(nombre);
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
        this.ladoTres = ladoTres;
    }

    public double getLadoUno() {
        return ladoUno;
    }

    public void setLadoUno(double ladoUno) {
        this.ladoUno = ladoUno;
    }

    public double getLadoDos() {
        return ladoDos;
    }

    public void setLadoDos(double ladoDos) {
        this.ladoDos = ladoDos;
    }

    public double getLadoTres() {
        return ladoTres;
    }

    public void setLadoTres(double ladoTres) {
        this.ladoTres = ladoTres;
    }

    @Override
    public String toString() {
        double perimetro = calcularPerimetro();
        String atributos = "El nombre de esta figura es: " + super.getNombre() + " y el perímetro es de " + perimetro;
        return atributos;
    }

    public boolean equals(Triangulo triangulo) {
        if (this.getNombre() == triangulo.getNombre() &&
                this.ladoUno == triangulo.getLadoUno() &&
                this.ladoDos == triangulo.getLadoDos() &&
                this.ladoTres == triangulo.getLadoTres()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double calcularPerimetro() {
        return getLadoUno() + getLadoDos() + getLadoTres();
    }
}
