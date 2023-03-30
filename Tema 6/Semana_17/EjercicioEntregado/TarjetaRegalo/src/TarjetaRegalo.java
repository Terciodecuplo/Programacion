public class TarjetaRegalo {
    double saldo;
    String numeroTarjeta;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.numeroTarjeta = generarNumeroTarjeta();
    }

    public String generarNumeroTarjeta() {
        String zeroesAddedAtTheBeggining = "";      //Se añadirán tantos 0 a la cadena como cifras le falten a "numeroTarjeta" para tener longitud 5.
        this.numeroTarjeta = Integer.toString((int) (Math.random() * (99999 - 0 + 1) + 0));
        if (this.numeroTarjeta.length() < 5) {
            for (int i = this.numeroTarjeta.length(); i < 5; i++) {
                zeroesAddedAtTheBeggining += "0";
            }
        }
        return zeroesAddedAtTheBeggining + this.numeroTarjeta;
    }

    public double comprobarSaldo() {
        return this.saldo;
    }

    public void gasta(double spentAmount) {
        if (this.saldo < spentAmount) {
            System.out.println("No tiene saldo suficiente para gastar " + spentAmount + "€");
        } else {
            this.saldo -= spentAmount;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo tarjeta) {
        TarjetaRegalo newCard = new TarjetaRegalo(tarjeta.saldo + this.saldo);
        tarjeta.saldo = 0;
        this.saldo = 0;
        return newCard;
    }

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
