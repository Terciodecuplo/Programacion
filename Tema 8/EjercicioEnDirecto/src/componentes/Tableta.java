package componentes;

public class Tableta extends ProductoElectronico implements ConectividadInternet{
    private int pulgadasPantalla;
    private int capacidadAlmacenamiento;
    private String tipoBateria;
    public Tableta(int pulgadasPantalla, int capacidadAlmacenamiento, String tipoBateria,
                   String nombreProducto, double precio, String marca){
        super(nombreProducto, precio, marca);
        this.pulgadasPantalla=pulgadasPantalla;
        this.capacidadAlmacenamiento=capacidadAlmacenamiento;
        this.tipoBateria=tipoBateria;
    }

    public int getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    @Override
    public void conectarInternet() {

    }
}
