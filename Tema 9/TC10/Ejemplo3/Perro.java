package Ejemplo3;

/**
 * Perro.java
 * Definición de la clase Perro
 *
 */
public class Perro extends Animal implements Mascota {
    private String codigo;
    public Perro (String s, String c) { 
        super(s);
        this.codigo = c;
    }
    @Override
    public String getCodigo() { 
        return this.codigo;
    }
    /**
     * Hace que el Perro emita sonidos.
     */
    @Override
    public void hazRuido() { 
        this.ladra();
    }
    /**
     * Hace que el Perro ladre.
     */
    public void ladra() { 
        System.out.println("Guau guau");
    }
    /**
     * Hace que el Perro coma.
     * A los Perros les gusta la carne, si le damos otra comida la rechazará.
     *
     * @param comida la comida que se le ofrece al Perro
     */
    @Override
    public void come(String comida) {
        if (comida.equals("carne")) { 
            System.out.println("Hmmmm, gracias");
        } else {
            System.out.println("Lo siento, yo solo como carne");
        } 
    }
}
