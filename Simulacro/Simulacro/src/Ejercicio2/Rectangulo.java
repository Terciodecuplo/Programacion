package Ejercicio2;

public class Rectangulo extends Figura2D implements FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        double perimetro = calcularPerimetro();
        String atributos = "El nombre de esta figura es: " + super.getNombre() + " y el perímetro es de " + perimetro;
        return atributos;
    }

    public boolean equals(Rectangulo rectangulo) {
        if (this.getNombre() == rectangulo.getNombre() &&
                this.base == rectangulo.getBase() &&
                this.altura == rectangulo.getAltura()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double calcularPerimetro() {
        return getAltura() * 2 + getBase() * 2;
    }
}
