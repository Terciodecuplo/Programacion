package biblioteca;

public class Libro extends Publicacion implements Prestable{
    private boolean prestado;

    @Override
    public void presta(boolean state) {

    }

    @Override
    public void devuelve(boolean state) {

    }

    @Override
    public boolean esPrestado(boolean state) {
        return false;
    }
}
