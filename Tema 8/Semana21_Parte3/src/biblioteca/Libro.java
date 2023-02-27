package biblioteca;

public class Libro extends Publicacion implements Prestable{
    private boolean prestado;

    public Libro(boolean prestado, String isbn, String title, int publicationYear){
        super(isbn, title, publicationYear);
        this.prestado=prestado;
    }

    @Override
    public boolean presta(boolean state) {
        if(!state){
            System.out.println("El libro ha sido prestado.");
            return true;
        } else {
            System.out.println("El libro no se encuentra disponible.");
            return false;
        }
    }

    @Override
    public boolean devuelve(boolean state) {
        if(state){
            System.out.println("Has devuelto el libro");
            return  false;
        }else{
            System.out.println("No se puede devolver lo que no se posee...");
            return false;
        }
    }

    @Override
    public void estaPrestado(boolean state) {
        if(state){
            System.out.println("El libro está prestado.");
        } else {
            System.out.println("El libro se puede prestar.");
        }
    }
}
