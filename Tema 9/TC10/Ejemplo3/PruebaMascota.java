package Ejemplo3;

/**
 * PruebaMascota.java
 * Programa que prueba la interfaz Mascota
 *
 */
public class PruebaMascota {
    public static void main(String[] args) {
    // Polimorfismo: elementos que pueden cambiar su forma (Gato, Perro) sin variar su naturaleza (Mascota)
    // Posibilidad de que un objeto adopte un comportamiento diferente según el contexto en el que se encuentre (ej. sobrecarga de funciones)
    // Varios objetos pueden comportarse de forma polimórfica si pertenecen a la misma jerarquía de clases o si implementan la misma interfaz
    Mascota garfield = new Gato("macho", "34569"); 
    Mascota lisa = new Gato("hembra", "96059"); 
    Mascota kuki = new Perro("hembra", "234678"); 
    Mascota ayo = new Perro("macho", "778950");
    System.out.println(garfield.getCodigo());
    System.out.println(lisa.getCodigo());
    System.out.println(kuki.getCodigo());
    System.out.println(ayo.getCodigo());
    // Polimorfismo dinámico o en tiempo de ejecución -> Herencia o interfaces (@Override)
    garfield.come("pescado");
    lisa.come("hamburguesa");
    kuki.come("pescado");
    }
}
