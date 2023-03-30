public class Prueba {
    public static void main(String[] args) {
        Banco banco = new Banco(200);
        try {
            banco.retirar(100);
            banco.depositar(50);
            banco.retirar(300);
        } catch (Exception e) {
            System.out.println("Exception :" + e.getMessage());
        } finally {
            System.out.println("Tu cuenta contiene " + banco.getSaldo() + "€");
        }
    }
}
