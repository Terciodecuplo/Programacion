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

}
