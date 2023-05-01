
public class PruebaProductosElectronicos {
    public static void main(String[] args) {
        // Creamos un objeto TelefonoMovil
        TelefonoMovil telefono = new TelefonoMovil("iPhone 12", 1200, 6, "12 Pro Max", 256, "Apple");

        // Llamamos al método conectarInternet()
        telefono.conectarInternet();

        // Creamos un objeto Tableta
        Tableta tablet = new Tableta("iPad Pro", 800, "Apple", 12.9, 128, "Litio");

        // Llamamos al método conectarInternet()
        tablet.conectarInternet();

        // Creamos un objeto Portatil
        Portatil portatil = new Portatil("MacBook Pro", 2000, "Apple", 512, 16, "AMD Radeon Pro 5500M");

        // Llamamos al método conectarInternet()
        portatil.conectarInternet();

        // Mostramos el total de teléfonos móviles creados
        System.out.println("Total de teléfonos móviles creados: " + TelefonoMovil.getTelefonosTotales());
        System.out.println(portatil);
    }
}
