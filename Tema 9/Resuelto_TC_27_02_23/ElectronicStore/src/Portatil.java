public class Portatil extends ProductoElectronico implements ConectividadInternet{
    private int capacidadAlmacenamiento;
    private int memoriaRAM;
    private String tarjetaGrafica;

    public Portatil(String nombreProducto, double precio, String marca, int capacidadAlmacenamiento, int memoriaRAM, String tarjetaGrafica) {
        super(nombreProducto, precio, marca);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.memoriaRAM = memoriaRAM;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public void conectarInternet() {
        System.out.println("Este dispositivo está conectado a internet mediante Wi-Fi o Ethernet.");
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public String toString(){
        String caracteristicas = "Portátil marca " + getMarca() + " - " + getNombreProducto() + " con:\n"
                + getMemoriaRAM() + "GB de memoria RAM\n"
                + getCapacidadAlmacenamiento() + "GB de SSD de alta velocidad\n"
                + "Tarjeta gráfica " + getTarjetaGrafica() +"\n"
                + "Por TAN SOLO " + getPrecio() +"€";
        return caracteristicas;
    }
}
