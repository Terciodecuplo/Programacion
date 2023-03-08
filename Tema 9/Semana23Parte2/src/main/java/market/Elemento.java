package market;

public class Elemento {
    private String nombreProducto;
    private double precio;
    private int unidades;
    public Elemento(String nombreProducto, double precio, int unidades){
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.unidades = unidades;
    }
    /* No incluyo conscientemente los métodos setter por dos motivos:
        1- no se pide expresamente.
        2- en caso de modificar algún dato, soy partidario de generar una nueva instancia "Elemento"
           con los nuevos datos y eliminar el anterior. De esta manera se mantiene un hermetismo
           y se impide la modificación una vez se ha creado el objeto.
     */
    public String getNombreProducto() {
        return nombreProducto;
    }
    public double getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }
}
