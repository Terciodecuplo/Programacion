public class TelefonoMovil extends ProductoElectronico implements ConectividadInternet {
    private String numeroModelo;
    private int capacidadAlmacenamiento;
    private int nucleosProcesador;

    private static int numeroDeMoviles = 0;

    public TelefonoMovil(String numeroModelo, int capacidadAlmacenamiento, int nucleosProcesador,
                         String nombreProducto, double precio, String marca) {
        super(nombreProducto, precio, marca);
        this.numeroModelo = numeroModelo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.nucleosProcesador = nucleosProcesador;
        numeroDeMoviles++;

    }

    public String getNumeroModelo() {
        return numeroModelo;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public int getNucleosProcesador() {
        return nucleosProcesador;
    }

    public static int getTelefonosTotales() {
        return numeroDeMoviles;
    }

    @Override
    public void conectarInternet() {
        System.out.println("El dispositivo se ha conectado a internet a través de la red móvil.");
    }
}
