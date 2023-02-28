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

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
