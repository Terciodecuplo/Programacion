package Ejemplo3;

/**
 * Gato.java
 * Definición de la clase Gato
 */
public class Gato extends Animal implements Mascota{ 
    
    private String codigo;
    public Gato (String s, String c) { 
        super(s);
        this.codigo = c;
    }
    @Override
    public String getCodigo() { 
        return this.codigo;
    }
    /**
     * Hace que el gato emita sonidos.
     */
    @Override
    public void hazRuido() { 
        this.maulla(); this.ronronea();
    }
    /**
     * Hace que el gato maulle.
     */
    public void maulla() { 
        System.out.println("Miauuuu");
    }
    /**
     * Hace que el gato ronronee
     */
    public void ronronea() { 
        System.out.println("mrrrrrr");
    }
     /**
     * Hace que el gato coma.
     * A los gatos les gusta el pescado, si le damos otra comida
     * la rechazará.
     *
     * @param comida la comida que se le ofrece al gato
     */
    @Override
    public void come(String comida) { 
        if (comida.equals("pescado")) {
            System.out.println("Hmmmm, gracias"); 
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }
}
