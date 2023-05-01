public class Tableta extends ProductoElectronico implements ConectividadInternet{
    private double diagonalPantalla;
    private int capacidadAlmacenamiento;
    private String tipoBateria;

    public Tableta(String nombreProducto, double precio, String marca,
                   double diagonalPantalla, int capacidadAlmacenamiento, String tipoBateria) {
        super(nombreProducto, precio, marca);
        this.diagonalPantalla = diagonalPantalla;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.tipoBateria = tipoBateria;
    }

    @Override
    public void conectarInternet() {
        System.out.println("La tablet se ha conectado a internet a través de la red Wi-Fi.");
    }

    public double getDiagonalPantalla() {
        return diagonalPantalla;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }
}
