package biblioteca;

public class Revista extends Publicacion {
    private static int numeroRevista = 0;

    public Revista(String isbn, String title, int publicationYear) {
        super(isbn, title, publicationYear);
        this.numeroRevista++;
    }

    public static int getNumeroRevista() {
        return numeroRevista;
    }
}
