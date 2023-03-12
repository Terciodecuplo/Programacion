public class TarjetaRegalo {


    public static void main(String[] args) {
        TarjetaRegalo t1 = new TarjetaRegalo(100.0);
        TarjetaRegalo t2 = new TarjetaRegalo(120.0);
        t1.gasta(45.9);
        t2.gasta(5.0);
        t2.gasta(200.0);
        t1.gasta(3.55);
        System.out.println(t1.comprobarSaldo());
        System.out.println(t2.comprobarSaldo());
        TarjetaRegalo t3 = t1.fusionaCon(t2);
        System.out.println(t1.comprobarSaldo());
        System.out.println(t2.comprobarSaldo());
        System.out.println(t3.comprobarSaldo());
        System.out.println("El número de la tarjeta 1 es: " + t1.numeroTarjeta);
        System.out.println("El número de la tarjeta 2 es: " + t2.numeroTarjeta);
        System.out.println("El número de la tarjeta 3 es: " + t3.numeroTarjeta);
    }
}

