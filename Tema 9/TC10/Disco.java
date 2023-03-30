/*
 * En Java existe una solución para mostrar información sobre un objeto por pantalla. 
 * Si se quiere mostrar el contenido de la variable int x se utiliza System.out.print(x) 
 * y si se quiere mostrar el valor de la variable de tipo String nombre se escribe System.out.print(nombre). 
 * De la misma manera, si se quiere mostrar el objeto garfield que pertenece a la clase Gato, también se podría usar System.out.print(garfield). 
 * Java sabe perfectamente cómo mostrar enteros (int) y cadenas de caracteres (String) pero no sabe a priori cómo se pintan gatos. 
 * Para indicar a Java cómo debe pintar un objeto de la clase Gato basta con implementar el método toString dentro de la clase.
 */
public class Disco {
    private String autor;
    private String titulo;
    private String genero;
    private int duracion; // duración total en minutos
    public Disco(){

    }
    public Disco(String autor, String titulo, String genero, int duracion){
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
    public String getAutor() { 
        return autor;
    }
    public void setAutor(String autor) { 
        this.autor = autor;
    }
    public String getGenero() { 
        return genero;
    }
    public void setGenero(String genero) { 
        this.genero = genero;
    }
    public String getTitulo() { 
        return titulo;
    }
    public void setTitulo(String titulo) { 
        this.titulo = titulo;
    }
    public int getDuracion() { 
        return duracion;
    }
    public void setDuracion(int duracion) { 
        this.duracion = duracion;
    }
    // Distinguimos un objeto de otro por sus atributos
    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\n------------------------------------------";
        return cadena;
    }

    public Boolean equals(Disco disco) {
        Boolean eq = disco.getAutor().equals(this.autor) &&
        disco.getGenero().equals(this.genero) &&
        disco.getTitulo().equals(this.titulo) &&
        disco.getDuracion()==this.duracion;
        return eq;
    }

    public static void main(String[] args){
        Disco disco1 = new Disco("autor", "titulo", "genero", 120);
        Disco disco2 = new Disco("autor", "titulo", "genero", 120);
        System.out.println(disco1);
        System.out.println(disco2);
        // Comparamos referencias -> false
        System.out.println(disco1.equals(disco2));
        // Tenemos que crear un método equals que compare los atributos del objeto
        // Cuidado con los String no inicializados (null)
    }
}

