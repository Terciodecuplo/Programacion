import componentes.TelefonoMovil;

public class Tienda {
    public static void main(String[] args) {
        TelefonoMovil telefono = new TelefonoMovil(14,128,8,"iPhone",1599.99,"apple");
        System.out.println("La capacidad de este dispositivo es: " + telefono.getCapacidadAlmacenamiento());
        telefono.conectarInternet();
    }
}