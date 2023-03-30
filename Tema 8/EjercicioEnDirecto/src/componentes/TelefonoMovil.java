package componentes;

public class TelefonoMovil extends ProductoElectronico implements ConectividadInternet{
    private int numModelo;
    private int capacidadAlmacenamiento;
    private int nucleosProcesamiento;
    private static int movilesCreados = 0;
    public TelefonoMovil(int numModelo, int capacidadAlmacenamiento, int nucleosProcesamiento,
                         String nombreProducto, double precio, String marca){
        super(nombreProducto, precio, marca);
        this.numModelo = numModelo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.nucleosProcesamiento = nucleosProcesamiento;
        movilesCreados++;
    }

    public int getNumModelo() {
        return numModelo;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public int getNucleosProcesamiento() {
        return nucleosProcesamiento;
    }
    public static int getMovilesCreados(){
        return movilesCreados;
    }

    @Override
    public void conectarInternet() {
        System.out.println("Se ha conectado a internet a través de Wi-Fi.");
    }
}
