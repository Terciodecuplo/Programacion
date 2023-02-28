package biblioteca;

public class Libro extends Publicacion implements Prestable {
    private boolean prestado = false;

    public Libro(String isbn, String title, int publicationYear) {
        super(isbn, title, publicationYear);
    }

    @Override
    public void presta() {
        if (!this.prestado) {
            System.out.println("El libro ha sido prestado.");
            this.prestado = true;
        } else {
            System.out.println("El libro no se encuentra disponible.");
        }
    }

    @Override
    public void devuelve() {
        if (this.prestado) {
            System.out.println("Has devuelto el libro");
            this.prestado = false;
        } else {
            System.out.println("No se puede devolver lo que no se tiene...");
        }
    }

    @Override
    public void estaPrestado() {
        if (this.prestado) {
            System.out.println("El libro está prestado.");
        } else {
            System.out.println("El libro se puede prestar.");
        }
    }
}
