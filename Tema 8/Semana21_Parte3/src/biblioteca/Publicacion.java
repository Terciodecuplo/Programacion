package biblioteca;

public class Publicacion {
    private String isbn;
    private String title;
    private int publicationYear;

    public Publicacion(String isbn, String title, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.publicationYear = publicationYear;
    }
}
