public class Banco {
    private double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double cantidad){
        saldo+=cantidad;
    }

    public void retirar(double cantidad) {
        try {
            if (cantidad > saldo) {
                throw new SaldoInsuficienteException("Saldo insuficiente");
            } else {
                saldo -= cantidad;
            }
        } catch (SaldoInsuficienteException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
