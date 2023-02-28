import biblioteca.Libro;
import biblioteca.Publicacion;
import biblioteca.Revista;

public class Biblioteca {
    public static void main(String[] args) {
        Libro libroUno = new Libro("978-92-76586-12-2", "Harry Potter y la Piedra Filosofal", 1997);
        Libro libroDos = new Libro("998-78-73266-89-6", "El señor de los anillos. La fiesta del anillo.", 1954);
        Revista revistaUno = new Revista("220-56-86553-90-5", "Games Tribune Magazine", 2023);
        Revista revistaDos = new Revista("220-56-86590-90-5", "Games Tribune Magazine", 2023);
        Revista revistaTres = new Revista("220-56-86635-90-5", "Games Tribune Magazine", 2023);
        libroUno.presta();
        libroDos.devuelve();
        libroDos.presta();
        libroUno.devuelve();
        libroUno.estaPrestado();
        libroDos.estaPrestado();
        System.out.println("Se ha(n) impreso " + Revista.getNumeroRevista() + " revista(s).");
        System.out.println("El título del segundo libro es " + libroDos.getTitle() + " y lo vamos a cambiar por 'El señor de los anillos. La comunidad del anillo' ");
        libroDos.setTitle("El señor de los anillos. La comunidad del anillo");
        System.out.println("Ahora el título del segundo libro es " + libroDos.getTitle());


    }

}